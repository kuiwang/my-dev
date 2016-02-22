package com.taobao.top.link.endpoint;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.taobao.top.link.DefaultLoggerFactory;
import com.taobao.top.link.LinkException;
import com.taobao.top.link.Logger;
import com.taobao.top.link.LoggerFactory;
import com.taobao.top.link.Text;
import com.taobao.top.link.channel.ChannelException;
import com.taobao.top.link.channel.ChannelSender;
import com.taobao.top.link.channel.ClientChannelSelector;
import com.taobao.top.link.channel.ClientChannelSharedSelector;
import com.taobao.top.link.channel.ServerChannel;
import com.taobao.top.link.schedule.Scheduler;

// Abstract network model
// https://docs.google.com/drawings/d/1PRfzMVNGE4NKkpD9A_-QlH2PV47MFumZX8LbCwhzpQg/edit
public class Endpoint {

    protected static int TIMOUT = 5000;

    private EndpointChannelHandler channelHandler;

    private ClientChannelSelector channelSelector;

    // in/out endpoints
    private List<EndpointProxy> connected;

    private Identity identity;

    private Logger logger;

    private MessageHandler messageHandler;

    private List<ServerChannel> serverChannels;

    public Endpoint(Identity identity) {
        this(DefaultLoggerFactory.getDefault(), identity);
    }

    public Endpoint(LoggerFactory loggerFactory, Identity identity) {
        this.serverChannels = new ArrayList<ServerChannel>();
        this.connected = new ArrayList<EndpointProxy>();
        this.logger = loggerFactory.create(this);
        this.identity = identity;
        this.setClientChannelSelector(new ClientChannelSharedSelector(loggerFactory));
        this.setChannelHandler(new EndpointChannelHandler(loggerFactory));

        if (this.identity == null) {
            throw new NullPointerException("identity");
        }
    }

    public void bind(ServerChannel channel) {
        channel.setChannelHandler(this.channelHandler);
        channel.run();
        this.serverChannels.add(channel);
    }

    private EndpointProxy createProxy(String reason) {
        EndpointProxy e = new EndpointProxy(this);
        this.connected.add(e);
        if (this.logger.isDebugEnabled()) {
            this.logger.debug(Text.E_CREATE_NEW + ": " + reason);
        }
        return e;
    }

    public Iterator<EndpointProxy> getConnected() {
        return this.connected.iterator();
    }

    public synchronized EndpointProxy getEndpoint(Identity target) throws LinkException {
        if (target.equals(this.identity)) {
            throw new LinkException(Text.E_ID_DUPLICATE);
        }

        for (EndpointProxy e : this.connected) {
            if ((e.getIdentity() != null) && e.getIdentity().equals(target)) {
                return e;
            }
        }
        EndpointProxy e = this.createProxy(target.toString());
        e.setIdentity(target);
        return e;
    }

    public synchronized EndpointProxy getEndpoint(Identity target, URI uri) throws LinkException {
        return this.getEndpoint(target, uri, null);
    }

    // connect to target via special uri
    public synchronized EndpointProxy getEndpoint(Identity target, URI uri,
            Map<String, Object> extras) throws LinkException {
        // connect message
        Message msg = new Message();
        msg.messageType = MessageType.CONNECT;
        Map<String, Object> content = new HashMap<String, Object>();
        this.identity.render(content);
        // pass extra data
        if (extras != null) {
            content.putAll(extras);
        }
        msg.content = content;

        EndpointProxy e = this.getEndpoint(target);
        // always clear, cached proxy will have broken channel
        e.remove(uri);
        // always reget channel, make sure it's valid
        ClientChannelWrapper channel = new ClientChannelWrapper(
                // set default version on this channel
                this.channelSelector.getChannel(uri), msg.protocolVersion);
        channel.setChannelHandler(this.channelHandler);
        // send connect
        this.sendAndWait(e, channel, msg, TIMOUT);
        e.add(channel);
        return e;
    }

    public Identity getIdentity() {
        return this.identity;
    }

    public MessageHandler getMessageHandler() {
        return this.messageHandler;
    }

    protected void send(ChannelSender sender, Message message) throws ChannelException {
        this.channelHandler.pending(message, sender);
    }

    protected Map<String, Object> sendAndWait(EndpointProxy e, ChannelSender sender,
            Message message, int timeout) throws LinkException {
        SendCallback callback = new SendCallback(e);
        this.channelHandler.pending(message, sender, callback);
        try {
            callback.waitReturn(timeout);
        } finally {
            this.channelHandler.cancel(callback);
        }
        if (callback.getError() != null) {
            throw callback.getError();
        }
        return callback.getReturn();
    }

    protected boolean sendSync(ChannelSender sender, Message message, int timeout)
            throws ChannelException {
        return this.channelHandler.flush(message, sender, timeout);
    }

    public void setChannelHandler(EndpointChannelHandler channelHandler) {
        this.channelHandler = channelHandler;
        this.channelHandler.setEndpoint(this);
        for (ServerChannel channel : this.serverChannels) {
            channel.setChannelHandler(this.channelHandler);
        }
    }

    public void setClientChannelSelector(ClientChannelSelector selector) {
        this.channelSelector = selector;
    }

    public void setMessageHandler(MessageHandler handler) {
        this.messageHandler = handler;
    }

    public void setScheduler(Scheduler<Identity> scheduler) {
        this.channelHandler.setScheduler(scheduler);
    }

    public void unbindAll() {
        for (ServerChannel channel : this.serverChannels) {
            try {
                channel.stop();
            } catch (Exception e) {
                this.logger.error(Text.E_UNBIND_ERROR, e);
            }
        }
        this.serverChannels.clear();
    }
}
