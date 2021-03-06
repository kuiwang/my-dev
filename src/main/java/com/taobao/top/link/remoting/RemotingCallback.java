package com.taobao.top.link.remoting;

// one callback per rpc-call
public abstract class RemotingCallback {

    public Integer flag;

    public Class<?> returnType;

    public String serializationFormat;

    public abstract void onException(Throwable exception);

    public abstract void onMethodReturn(MethodReturn methodReturn);
}
