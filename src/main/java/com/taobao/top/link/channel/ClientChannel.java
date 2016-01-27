package com.taobao.top.link.channel;

import java.net.URI;

import com.taobao.top.link.ResetableTimer;

public interface ClientChannel extends ChannelSender {

    public ChannelHandler getChannelHandler();

    public URI getUri();

    public boolean isConnected();

    public void setChannelHandler(ChannelHandler handler);

    public void setHeartbeatTimer(ResetableTimer timer);

    public void setUri(URI uri);
}
