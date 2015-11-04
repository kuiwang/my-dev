package com.taobao.top.link.netcat;

import java.util.Map;

public interface CommandProcessor {

    public String getName();

    public void process(Map<String, String> input, NetCatOuputWriter writer) throws Exception;
}
