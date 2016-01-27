package com.taobao.top.link.endpoint;

import java.net.SocketAddress;
import java.nio.ByteBuffer;

import com.taobao.top.link.channel.ChannelException;
import com.taobao.top.link.channel.ChannelSender;
import com.taobao.top.link.channel.ClientChannel;
import com.taobao.top.link.channel.ServerChannelSender;

public class ChannelSenderWrapper implements ChannelSender {

    private int protocolVersion;

    private ChannelSender sender;

    public ChannelSenderWrapper(ChannelSender sender, int protocolVersion) {
        this.sender = sender;
        this.protocolVersion = protocolVersion;
    }

    @Override
    public void close(String reason) {
        this.sender.close(reason);
    }

    public ChannelSender getChannelSender() {
        return this.sender;
    }

    @Override
    public SocketAddress getLocalAddress() {
        return this.sender.getLocalAddress();
    }

    public int getProtocolVersion() {
        return this.protocolVersion;
    }

    @Override
    public SocketAddress getRemoteAddress() {
        return this.sender.getRemoteAddress();
    }

    public boolean isValid() {
        return ((this.sender instanceof ClientChannel) && ((ClientChannel) this.sender).isConnected())
                || ((this.sender instanceof ServerChannelSender) && ((ServerChannelSender) this.sender)
                        .isOpen());
    }

    @Override
    public void send(byte[] data, int offset, int length) throws ChannelException {
        this.sender.send(data, offset, length);
    }

    @Override
    public void send(ByteBuffer dataBuffer, SendHandler sendHandler) throws ChannelException {
        this.sender.send(dataBuffer, sendHandler);
    }

    @Override
    public boolean sendSync(ByteBuffer dataBuffer, SendHandler sendHandler, int timeoutMilliseconds)
            throws ChannelException {
        return this.sender.sendSync(dataBuffer, sendHandler, timeoutMilliseconds);
    }
}
