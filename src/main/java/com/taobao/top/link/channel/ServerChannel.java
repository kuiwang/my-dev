package com.taobao.top.link.channel;

import com.taobao.top.link.Logger;
import com.taobao.top.link.LoggerFactory;

public abstract class ServerChannel {

    protected ChannelHandler channelHandler;

    protected Logger logger;

    protected LoggerFactory loggerFactory;

    protected int maxIdleTimeSeconds = 0;

    protected int port;

    public ServerChannel(LoggerFactory factory, int port) {
        this.loggerFactory = factory;
        this.logger = factory.create(this);
        this.port = port;
    }

    public abstract void run();

    public void setChannelHandler(ChannelHandler channelHandler) {
        this.channelHandler = channelHandler;
    }

    public void setMaxIdleTimeSeconds(int value) {
        this.maxIdleTimeSeconds = value;
    }

    public abstract void stop();
}
