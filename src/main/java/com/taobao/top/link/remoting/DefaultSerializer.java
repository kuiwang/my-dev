package com.taobao.top.link.remoting;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// java build-in object read/write
public class DefaultSerializer implements Serializer {

    @Override
    public MethodCall deserializeMethodCall(byte[] input) throws FormatterException {
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(input);
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (MethodCall) ois.readObject();
        } catch (Exception e) {
            throw new FormatterException("deserialize MethodCall error", e);
        }
    }

    @Override
    public MethodReturn deserializeMethodReturn(byte[] input, Class<?> returnType)
            throws FormatterException {
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(input);
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (MethodReturn) ois.readObject();
        } catch (Exception e) {
            throw new FormatterException("deserialize MethodReturn error", e);
        }
    }

    @Override
    public String getName() {
        return "java";
    }

    @Override
    public byte[] serializeMethodCall(MethodCall methodCall) throws FormatterException {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(methodCall);
            return bos.toByteArray();
        } catch (Exception e) {
            throw new FormatterException("serialize MethodCall error", e);
        }
    }

    @Override
    public byte[] serializeMethodReturn(MethodReturn methodReturn) throws FormatterException {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(methodReturn);
            return bos.toByteArray();
        } catch (Exception e) {
            throw new FormatterException("serialize MethodReturn error", e);
        }
    }
}
