package com.taobao.top.link.remoting;

@SuppressWarnings("serial")
public class MethodCall implements Message {

    public String Uri;

    public String MethodName;

    public String TypeName;

    public Class<?>[] MethodSignature;

    public Object[] Args;
}
