package com.taobao.top.link.remoting;

public interface Serializer {

    public MethodCall deserializeMethodCall(byte[] input) throws FormatterException;

    public MethodReturn deserializeMethodReturn(byte[] input, Class<?> returnType)
            throws FormatterException;

    public String getName();

    public byte[] serializeMethodCall(MethodCall methodCall) throws FormatterException;

    public byte[] serializeMethodReturn(MethodReturn methodReturn) throws FormatterException;
}
