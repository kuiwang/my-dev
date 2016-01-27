package com.taobao.top.link.endpoint;

import java.nio.ByteBuffer;

import com.taobao.top.link.endpoint.protocol.DefaultMessageDecoderFactory;
import com.taobao.top.link.endpoint.protocol.DefaultMessageEncoderFactory;
import com.taobao.top.link.endpoint.protocol.MessageDecoderFactory;
import com.taobao.top.link.endpoint.protocol.MessageEncoderFactory;

// simple protocol impl
// care about Endian
// https://github.com/wsky/RemotingProtocolParser/issues/3
public class MessageIO {

    public interface MessageDecoder {

        public Message readMessage(ByteBuffer buffer);
    }

    public interface MessageEncoder {

        public void writeMessage(ByteBuffer buffer, Message message);
    }

    public static MessageDecoderFactory decoderFactory = new DefaultMessageDecoderFactory();

    // TODO codec will rewrite in v2.0, current design just for compatible
    public static MessageEncoderFactory encoderFactory = new DefaultMessageEncoderFactory();

    public static Message readMessage(ByteBuffer buffer) {
        return decoderFactory.get(buffer).readMessage(buffer);
    }

    public static void writeMessage(ByteBuffer buffer, Message message) {
        encoderFactory.get(message).writeMessage(buffer, message);
    }
}
