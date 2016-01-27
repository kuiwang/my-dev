package com.taobao.api.internal.util.json;

public class BufferErrorListener implements JSONErrorListener {

    protected StringBuffer buffer;

    private String input;

    public BufferErrorListener() {
        this(new StringBuffer());
    }

    public BufferErrorListener(StringBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void end() {
    }

    @Override
    public void error(String type, int col) {
        buffer.append("expected ");
        buffer.append(type);
        buffer.append(" at column ");
        buffer.append(col);
        buffer.append("\n");
        buffer.append(input);
        buffer.append("\n");
        indent(col - 1, buffer);
        buffer.append("^");
    }

    private void indent(int n, StringBuffer ret) {
        for (int i = 0; i < n; ++i) {
            ret.append(' ');
        }
    }

    @Override
    public void start(String input) {
        this.input = input;
        buffer.setLength(0);
    }
}
