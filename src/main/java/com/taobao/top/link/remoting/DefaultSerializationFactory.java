package com.taobao.top.link.remoting;

public class DefaultSerializationFactory implements SerializationFactory {

    private Serializer serializer = new DefaultSerializer();

    @Override
    public Serializer get(Object format) {
        return this.serializer;
    }
}
