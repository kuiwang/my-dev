package com.taobao.top.link.channel;

public interface ServerChannelSender extends ChannelSender {

    public Object getContext(Object key);

    public boolean isOpen();

    public void setContext(Object key, Object value);
}
