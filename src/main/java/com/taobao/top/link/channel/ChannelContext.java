package com.taobao.top.link.channel;

import java.nio.ByteBuffer;

import com.taobao.top.link.channel.ChannelSender.SendHandler;

public class ChannelContext {

    private Throwable error;

    private Object message;

    private ChannelSender sender;

    public Throwable getError() {
        return this.error;
    }

    public Object getMessage() {
        return this.message;
    }

    public ChannelSender getSender() {
        return this.sender;
    }

    public void reply(byte[] data, int offset, int length) throws ChannelException {
        this.sender.send(data, offset, length);
    }

    public void reply(ByteBuffer dataBuffer) throws ChannelException {
        this.sender.send(dataBuffer, null);
    }

    public void reply(ByteBuffer dataBuffer, SendHandler sendHandler) throws ChannelException {
        this.sender.send(dataBuffer, sendHandler);
    }

    public void setError(Throwable e) {
        this.error = e;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public void setSender(ChannelSender sender) {
        this.sender = sender;
    }
}
