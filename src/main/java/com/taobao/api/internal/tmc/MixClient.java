package com.taobao.api.internal.tmc;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import com.taobao.top.link.LinkException;
import com.taobao.top.link.Logger;
import com.taobao.top.link.LoggerFactory;
import com.taobao.top.link.channel.ChannelException;
import com.taobao.top.link.channel.ClientChannel;
import com.taobao.top.link.channel.ClientChannelSharedSelector;
import com.taobao.top.link.channel.embedded.EmbeddedClientChannelSharedSelector;
import com.taobao.top.link.endpoint.Endpoint;
import com.taobao.top.link.endpoint.EndpointChannelHandler;
import com.taobao.top.link.endpoint.EndpointProxy;
import com.taobao.top.link.endpoint.Identity;
import com.taobao.top.link.endpoint.MessageHandler;
import com.taobao.top.link.logging.LogUtil;

/**
 * 消息服务-推拉客户端
 */
class MixClient {

    public class ServerIdentity implements Identity {

        @Override
        public boolean equals(Identity id) {
            return id instanceof ServerIdentity;
        }

        @Override
        public Identity parse(Object data) throws LinkException {
            return null;
        }

        @Override
        public void render(Object to) {
        }

        @Override
        public String toString() {
            return id.toString();
        }
    }

    private Endpoint endpoint;

    protected Identity id;

    protected Logger logger;

    private int reconnectInterval = 30000;

    private Timer reconnectTimer;

    private ClientChannelSharedSelector selector;

    private EndpointProxy server;

    private URI serverUri;

    public MixClient(Identity id) {
        // whatever, log first
        LoggerFactory loggerFactory = LogUtil.getLoggerFactory(this);
        this.logger = loggerFactory.create(this);

        // sharedpool with heartbeat 60s
        this.selector = new EmbeddedClientChannelSharedSelector(loggerFactory);
        this.selector.setHeartbeat(60000);

        // custom scheduler
        EndpointChannelHandler channelHandler = new EndpointChannelHandler(loggerFactory);
        // client do not need complex scheduler, only one io-thread
        // channelHandler.setScheduler(scheduler);

        this.endpoint = new Endpoint(loggerFactory, this.id = id);
        this.endpoint.setClientChannelSelector(this.selector);
        this.endpoint.setChannelHandler(channelHandler);
    }

    protected void connect(String uri) throws LinkException {
        try {
            this.connect(new URI(uri));
        } catch (URISyntaxException e) {
            this.logger.error(e);
        }
        this.startReconnect();
    }

    private void connect(URI uri) throws LinkException {
        this.server = this.endpoint.getEndpoint(new ServerIdentity(), uri,
                this.createConnectHeaders());
        this.serverUri = uri;
        this.logger.warn("%s connected to tmc server: %s", this.id, this.serverUri);
    }

    protected Map<String, Object> createConnectHeaders() {
        return null;
    }

    protected void disconnect(String reason) {
        this.stopReconnect();

        if (!this.server.hasValidSender()) {
            return;
        }

        try {
            ClientChannel channel = this.selector.getChannel(this.serverUri);
            if (channel != null) {
                channel.close(reason);
            }
        } catch (ChannelException e) {
            this.logger.error(e);
        }
    }

    protected Identity getIdentity() {
        return this.id;
    }

    protected boolean isOnline() {
        return (this.server != null) && this.server.hasValidSender();
    }

    protected final void send(Map<String, Object> message) throws ChannelException {
        this.server.send(message);
    }

    protected final void sendAndWait(Map<String, Object> message, int timeout) throws LinkException {
        this.server.sendAndWait(message, timeout);
    }

    protected void setMessageHandler(MessageHandler handler) {
        this.endpoint.setMessageHandler(handler);
    }

    private void startReconnect() {
        this.reconnectTimer = new Timer("tmc-reconnect", true);
        this.reconnectTimer.schedule(new TimerTask() {

            @Override
            public void run() {
                try {
                    if (!isOnline()) {
                        logger.warn(String.format("%s reconnecting...", id));
                        connect(serverUri);
                    }
                } catch (Exception e) {
                    logger.warn("reconnect error", e);
                }
            }
        }, this.reconnectInterval, this.reconnectInterval);
    }

    private void stopReconnect() {
        if (this.reconnectTimer != null) {
            this.reconnectTimer.cancel();
            this.reconnectTimer = null;
        }
    }
}
