package com.taobao.top.link.remoting;

@SuppressWarnings("serial")
public class MethodReturn implements Message {

    public Throwable Exception;

    public Object ReturnValue;
}
