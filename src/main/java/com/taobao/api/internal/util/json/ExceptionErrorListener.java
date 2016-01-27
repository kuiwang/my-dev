package com.taobao.api.internal.util.json;

public class ExceptionErrorListener extends BufferErrorListener {

    @Override
    public void error(String type, int col) {
        super.error(type, col);
        throw new IllegalArgumentException(buffer.toString());
    }
}
