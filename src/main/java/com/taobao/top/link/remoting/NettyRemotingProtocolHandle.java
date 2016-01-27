package com.taobao.top.link.remoting;

import java.util.HashMap;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;

import remoting.protocol.NotSupportedException;

import com.taobao.top.link.remoting.protocol.RemotingTcpProtocolHandle;

public class NettyRemotingProtocolHandle extends RemotingTcpProtocolHandle {

    // use netty's channelbuffer
    private ChannelBuffer buffer;

    public short contentDelimiter;

    public int majorVersion;

    public int minorVersion;

    public short operation;

    public String preamble;

    public HashMap<String, Object> transportHeaders;

    public NettyRemotingProtocolHandle(ChannelBuffer buffer) {
        super(null);
        this.setContentBuffer(buffer);
        this.majorVersion = this.minorVersion = -1;
        this.operation = this.contentDelimiter = -1;
    }

    @Override
    protected int ReadByte() {
        byte b = this.buffer.readByte();
        if (b > -1) {
            return b;
        } else {
            return -1;
        }
    }

    @Override
    protected byte[] ReadBytes(int length) {
        byte[] buffer = new byte[length];
        this.buffer.readBytes(buffer, 0, length);
        return buffer;
    }

    @Override
    public short ReadContentDelimiter() {
        return this.contentDelimiter > -1 ? this.contentDelimiter : super.ReadContentDelimiter();
    }

    @Override
    public int ReadContentLength() {
        return this._contentLength > -1 ? this._contentLength : super.ReadContentLength();
    }

    @Override
    protected int ReadInt32() {
        // care about big edian
        int value = ChannelBuffers.swapInt(this.buffer.readInt());
        return value;
    }

    @Override
    public int ReadMajorVersion() {
        return this.majorVersion > -1 ? this.majorVersion : super.ReadMajorVersion();
    }

    @Override
    public int ReadMinorVersion() {
        return this.minorVersion > -1 ? this.minorVersion : super.ReadMinorVersion();
    }

    @Override
    public short ReadOperation() {
        return this.operation > -1 ? this.operation : super.ReadOperation();
    }

    @Override
    public String ReadPreamble() {
        return this.preamble != null ? this.preamble : super.ReadPreamble();
    }

    @Override
    public HashMap<String, Object> ReadTransportHeaders() throws NotSupportedException {
        return this.transportHeaders != null ? this.transportHeaders : super.ReadTransportHeaders();
    }

    public void setContentBuffer(ChannelBuffer buffer) {
        this.buffer = buffer;
    }

    public void setContentLength(int l) {
        this._contentLength = l;
    }

    @Override
    protected void WriteByte(byte value) {
        this.buffer.writeByte(value);
    }

    @Override
    protected void WriteBytes(byte[] value) {
        this.buffer.writeBytes(value, 0, value.length);
    }

    @Override
    protected void WriteInt32(int value) {
        this.buffer.writeInt(ChannelBuffers.swapInt(value));
    }
}
