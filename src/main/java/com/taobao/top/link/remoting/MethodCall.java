package com.taobao.top.link.remoting;

@SuppressWarnings("serial")
public class MethodCall implements Message {

    public Object[] Args;

    public String MethodName;

    public Class<?>[] MethodSignature;

    public String TypeName;

    public String Uri;
}
