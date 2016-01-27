/*
 * The MIT License
 * 
 * Copyright (c) 2011 Takahiro Hashimoto
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.taobao.top.link.embedded.websocket.frame.rfc6455;

import java.nio.ByteBuffer;

import com.taobao.top.link.embedded.websocket.frame.FrameHeader;
import com.taobao.top.link.embedded.websocket.frame.rfc6455.FrameBuilderRfc6455.Opcode;
import com.taobao.top.link.embedded.websocket.frame.rfc6455.FrameBuilderRfc6455.PayloadLengthType;

/**
 * The Class FrameHeaderRfc6455.
 *
 * @author Takahiro Hashimoto
 */
public class FrameHeaderRfc6455 implements FrameHeader {

    /** The fragmented. */
    protected final boolean fragmented;

    /** The header length. */
    protected final int headerLength;

    /** The mask */
    protected boolean mask;

    /** The opcode. */
    protected final Opcode opcode;

    /** The payload length. */
    protected final long payloadLength;

    /** The payload length type. */
    protected final PayloadLengthType payloadLengthType;

    /** The real opcode. */
    protected Opcode realOpcode;

    /**
     * Instantiates a new frame header draft06.
     *
     * @param fragmented the fragmented
     * @param headerLength the header length
     * @param payloadLengthType the payload length type
     * @param payloadLength the payload length
     * @param opcode the opcode
     */
    public FrameHeaderRfc6455(boolean fragmented, int headerLength,
            PayloadLengthType payloadLengthType, long payloadLength, Opcode opcode) {
        this.headerLength = headerLength + payloadLengthType.offset();
        this.payloadLengthType = payloadLengthType;
        this.payloadLength = payloadLength;
        this.fragmented = fragmented;
        this.opcode = opcode;
    }

    /**
     * Instantiates a new frame header draft06.
     *
     * @param fragmented the fragmented
     * @param headerLength the header length
     * @param payloadLengthType the payload length type
     * @param payloadLength the payload length
     * @param opcode the opcode
     * @param realOpcode the real opcode
     */
    public FrameHeaderRfc6455(boolean fragmented, int headerLength,
            PayloadLengthType payloadLengthType, long payloadLength, Opcode opcode,
            Opcode realOpcode) {
        this.headerLength = headerLength + payloadLengthType.offset();
        this.payloadLengthType = payloadLengthType;
        this.payloadLength = payloadLength;
        this.fragmented = fragmented;
        this.opcode = opcode;
        this.realOpcode = realOpcode;
    }

    /* (non-Javadoc)
     * @see jp.a840.websocket.frame.FrameHeader#getContentsLength()
     */
    @Override
    public long getContentsLength() {
        return payloadLength;
    }

    /* (non-Javadoc)
     * @see jp.a840.websocket.frame.FrameHeader#getFrameLength()
     */
    @Override
    public long getFrameLength() {
        return headerLength + payloadLength;
    }

    /**
     * Gets the header length.
     *
     * @return the header length
     */
    public int getHeaderLength() {
        return headerLength;
    }

    /**
     * Gets the opcode.
     *
     * @return the opcode
     */
    public Opcode getOpcode() {
        return opcode;
    }

    /**
     * If opcode is CONTINUATION, real opcode has previous non-CONTINUATION
     * opcode or not real opcode is null.
     *
     * @return previous non-CONTINUATION opcode
     */
    public Opcode getRealOpcode() {
        return realOpcode;
    }

    /**
     * Checks if is continuation.
     *
     * @return true, if is continuation
     */
    public boolean isContinuation() {
        return Opcode.CONTINUATION.equals(opcode);
    }

    /**
     * Checks if is fragmented.
     *
     * @return true, if is fragmented
     */
    public boolean isFragmented() {
        return fragmented;
    }

    /**
     * set mask
     * 
     * @param mask
     */
    public void setMask(boolean mask) {
        this.mask = mask;
    }

    /* (non-Javadoc)
     * @see jp.a840.websocket.frame.FrameHeader#toByteBuffer()
     */
    @Override
    public ByteBuffer toByteBuffer() {
        ByteBuffer buf = ByteBuffer.allocate(2 + payloadLengthType.offset());
        buf.put((byte) ((fragmented ? 0 : 0x80) | opcode.intValue()));
        byte maskBit = (byte) (mask ? 1 << 7 : 0);
        switch (payloadLengthType) {
            case LEN_SHORT:
                buf.put((byte) (payloadLength | maskBit));
                break;
            case LEN_16:
                buf.put((byte) (payloadLengthType.byteValue() | maskBit));
                buf.putShort((short) payloadLength);
                break;
            case LEN_63:
                buf.put((byte) (payloadLengthType.byteValue() | maskBit));
                buf.putLong(payloadLength);
                break;
        }
        buf.flip();
        return buf;
    }
}
