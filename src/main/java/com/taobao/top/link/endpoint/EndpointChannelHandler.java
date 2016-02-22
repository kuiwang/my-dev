package com.taobao.top.link.endpoint;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import com.taobao.top.link.BufferManager;
import com.taobao.top.link.DefaultLoggerFactory;
import com.taobao.top.link.LinkException;
import com.taobao.top.link.Logger;
import com.taobao.top.link.LoggerFactory;
import com.taobao.top.link.Text;
import com.taobao.top.link.channel.ChannelContext;
import com.taobao.top.link.channel.ChannelException;
import com.taobao.top.link.channel.ChannelSender;
import com.taobao.top.link.channel.ChannelSender.SendHandler;
import com.taobao.top.link.channel.SimpleChannelHandler;
import com.taobao.top.link.schedule.Scheduler;

// make timing
public class EndpointChannelHandler extends SimpleChannelHandler {

    class InnerSendHandler implements SendHandler {

        private ByteBuffer buffer;

        public InnerSendHandler(ByteBuffer buffer) {
            this.buffer = buffer;
        }

        @Override
        public void onSendComplete(boolean success) {
            BufferManager.returnBuffer(this.buffer);
        }

    }

    private Map<Integer, SendCallback> callbackByFlag;

    private Endpoint endpoint;

    private AtomicInteger flag;

    // all connect in/out endpoints
    private Map<String, Identity> idByToken;

    private Logger logger;

    private Scheduler<Identity> scheduler;

    private StateHandler stateHandler;

    public EndpointChannelHandler() {
        this(DefaultLoggerFactory.getDefault());
    }

    public EndpointChannelHandler(LoggerFactory loggerFactory) {
        this.logger = loggerFactory.create(this);
        this.flag = new AtomicInteger();
        this.callbackByFlag = new ConcurrentHashMap<Integer, SendCallback>();
        this.idByToken = new ConcurrentHashMap<String, Identity>();
    }

    public void cancel(SendCallback callback) {
        this.callbackByFlag.remove(callback.flag);
    }

    private Message createConnectAckMessage(Message connectMessage) {
        Message msg = new Message();
        // version match with message from
        msg.protocolVersion = connectMessage.protocolVersion;
        msg.flag = connectMessage.flag;
        msg.token = connectMessage.token;
        return msg;
    }

    private Runnable createTask(final ChannelContext context, final Message message,
            final Identity messageFrom) {
        return new MessageScheduleTask(message) {

            @Override
            public void run() {
                try {
                    internalOnMessage(context, message, messageFrom);
                } catch (LinkException e) {
                    logger.error(e);
                }
            }
        };
    }

    protected final boolean flush(Message msg, ChannelSender sender, int timeout)
            throws ChannelException {
        ByteBuffer buffer = BufferManager.getBuffer();
        MessageIO.writeMessage(buffer, msg);
        return sender.sendSync(buffer, new InnerSendHandler(buffer), timeout);
    }

    private void handleCallback(SendCallback callback, Message msg, Identity msgFrom) {
        if (!callback.getTarget().getIdentity().equals(msgFrom)) {
            this.logger.warn(Text.E_IDENTITY_NOT_MATCH_WITH_CALLBACK, msgFrom,
                    callback.getTarget().getIdentity());
            return;
        }
        if (this.isError(msg)) {
            callback.setError(new LinkException(msg.statusCode, msg.statusPhase));
        } else {
            callback.setReturn(msg.content);
        }
    }

    // deal with connect-in message from endpoint,
    // parse identity send from endpoint and assign it a token,
    // token just used for routing message-from, not auth
    private void handleConnect(ChannelContext context, Message connectMessage)
            throws ChannelException {
        Message ack = this.createConnectAckMessage(connectMessage);
        ack.messageType = MessageType.CONNECTACK;
        try {
            Identity id = this.endpoint.getIdentity().parse(connectMessage.content);
            EndpointProxy proxy = this.endpoint.getEndpoint(id);
            // set connect-in version as the sender protocol version
            ChannelSenderWrapper senderWrapper = new ChannelSenderWrapper(context.getSender(),
                    connectMessage.protocolVersion);
            proxy.add(senderWrapper);
            if (proxy.getToken() == null) {
                synchronized (proxy) {
                    if (proxy.getToken() == null) {
                        // uuid for token? or get from id?
                        proxy.setToken(UUID.randomUUID().toString());
                    }
                }
            }
            ack.token = proxy.getToken();
            this.idByToken.put(proxy.getToken(), id);

            if (this.stateHandler != null) {
                this.stateHandler.onConnect(proxy, senderWrapper);
            }

            this.logger.info(Text.E_ACCEPT, this.endpoint.getIdentity(), id, proxy.getToken());
        } catch (LinkException e) {
            ack.statusCode = e.getErrorCode();
            ack.statusPhase = this.parseStatusPhase(e);
            this.logger.error(Text.E_REFUSE, e);
        }
        final ByteBuffer buffer = BufferManager.getBuffer();
        MessageIO.writeMessage(buffer, ack);
        context.reply(buffer, new InnerSendHandler(buffer));
    }

    private void handleConnectAck(SendCallback callback, Message msg) throws LinkException {
        if (callback == null) {
            throw new LinkException(Text.E_NO_CALLBACK);
        }
        if (this.isError(msg)) {
            callback.setError(new LinkException(msg.statusCode, msg.statusPhase));
        } else if (msg.token == null) {
            callback.setError(new LinkException(Text.E_NULL_TOKEN));
        } else {
            callback.setComplete();
            // set token for proxy for sending message next time
            callback.getTarget().setToken(msg.token);
            // store token from target endpoint for receiving it's message
            // next time
            this.idByToken.put(msg.token, callback.getTarget().getIdentity());
            this.logger.info(Text.E_CONNECT_SUCCESS, callback.getTarget().getIdentity(), msg.token);
        }
    }

    private void internalOnMessage(ChannelContext context, Message msg, Identity msgFrom)
            throws LinkException {
        if (msg.messageType == MessageType.SENDACK) {
            this.endpoint.getMessageHandler().onMessage(msg.content, msgFrom);
            return;
        }

        EndpointContext endpointContext = new EndpointContext(context, this.endpoint, msgFrom, msg);

        try {
            this.endpoint.getMessageHandler().onMessage(endpointContext);
        } catch (Exception e) {
            this.logger.error(e);
            // onMessage error should be reply to client
            if (e instanceof LinkException) {
                endpointContext.error(((LinkException) e).getErrorCode(),
                        this.parseStatusPhase(((LinkException) e)));
            } else {
                endpointContext.error(0, this.parseStatusPhase(e));
            }
        }
    }

    private boolean isError(Message msg) {
        return (msg.statusCode > 0) || ((msg.statusPhase != null) && (msg.statusPhase != ""));
    }

    @Override
    public void onConnect(ChannelContext context) throws Exception {
    }

    @Override
    public void onError(ChannelContext context) throws Exception {
        this.logger.error(Text.E_CHANNEL_ERROR, context.getError());
    }

    @SuppressWarnings("unchecked")
    @Override
    public final void onMessage(ChannelContext context) throws Exception {
        Object msg = context.getMessage();

        if (msg instanceof ByteBuffer) {
            this.onMessage(context, (ByteBuffer) msg);
            return;
        }

        for (ByteBuffer buffer : (List<ByteBuffer>) msg) {
            this.onMessage(context, buffer);
        }
    }

    private void onMessage(ChannelContext context, ByteBuffer buffer) throws LinkException {
        Message msg = MessageIO.readMessage(buffer);

        if (msg.messageType == MessageType.CONNECT) {
            this.handleConnect(context, msg);
            return;
        }

        SendCallback callback = this.callbackByFlag.remove(msg.flag);

        if (msg.messageType == MessageType.CONNECTACK) {
            this.handleConnectAck(callback, msg);
            return;
        }

        Identity msgFrom = msg.token != null ? this.idByToken.get(msg.token) : null;
        // must CONNECT/CONNECTACK for got token before SEND
        if (msgFrom == null) {
            LinkException error = new LinkException(String.format(
                    "[%s] %s: v=%s, type=%s, token=%s, flag=%s, code=%s, phase=%s, content=%s",
                    this.endpoint.getIdentity(), Text.E_UNKNOWN_MSG_FROM, msg.protocolVersion,
                    msg.messageType, msg.token, msg.flag, msg.statusCode, msg.statusPhase,
                    msg.content));
            if (callback == null) {
                throw error;
            }
            callback.setError(error);
            return;
        }

        // raise callback of client
        if (callback != null) {
            this.handleCallback(callback, msg, msgFrom);
            return;
        } else if (this.isError(msg)) {
            this.logger.error(Text.E_GOT_ERROR, msgFrom, msg.statusCode, msg.statusPhase);
            return;
        }

        // raise onMessage for async receive mode
        if (this.endpoint.getMessageHandler() == null) {
            return;
        }
        // exec directly
        if (this.scheduler == null) {
            this.internalOnMessage(context, msg, msgFrom);
            return;
        }
        // dispatch
        this.scheduler.schedule(msgFrom, this.createTask(context, msg, msgFrom));
    }

    private String parseStatusPhase(Exception e) {
        return e.getMessage() == null ? e.getClass().getSimpleName() : e.getMessage();
    }

    private String parseStatusPhase(LinkException e) {
        return (e.getMessage() == null) && (e.getErrorCode() <= 0) ? Text.E_UNKNOWN_ERROR
                : e.getMessage();
    }

    protected final void pending(Message msg, ChannelSender sender) throws ChannelException {
        this.pending(msg, sender, null);
    }

    // all send in Endpoint module must call here
    protected final void pending(Message msg, ChannelSender sender, SendCallback callback)
            throws ChannelException {
        if (callback != null) {
            callback.flag = msg.flag = this.flag.incrementAndGet();
            this.callbackByFlag.put(msg.flag, callback);
        }
        ByteBuffer buffer = BufferManager.getBuffer();
        MessageIO.writeMessage(buffer, msg);
        sender.send(buffer, new InnerSendHandler(buffer));
    }

    protected void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    public void setScheduler(Scheduler<Identity> scheduler) {
        this.scheduler = scheduler;
    }

    public void setStateHandler(StateHandler stateHandler) {
        this.stateHandler = stateHandler;
    }
}
