package com.taobao.api.internal.util.json;

public interface JSONErrorListener {

    void end();

    void error(String message, int column);

    void start(String text);
}
