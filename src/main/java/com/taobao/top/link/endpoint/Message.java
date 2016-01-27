package com.taobao.top.link.endpoint;

import java.util.Map;

// just simple version
public class Message {

    public Map<String, Object> content;

    public int flag;

    public short messageType;

    // version upgrade to 2 at 20130801
    public int protocolVersion = 2;

    public int statusCode;

    public String statusPhase;

    public String token;
}
