package com.taobao.api.internal.util.json;

public class JSONValidatingWriter extends JSONWriter {

    private JSONValidator validator;

    public JSONValidatingWriter() {
        this(new StdoutStreamErrorListener());
    }

    public JSONValidatingWriter(boolean emitClassName) {
        this(new StdoutStreamErrorListener(), emitClassName);
    }

    public JSONValidatingWriter(JSONErrorListener listener) {
        this(new JSONValidator(listener));
    }

    public JSONValidatingWriter(JSONErrorListener listener, boolean emitClassName) {
        this(new JSONValidator(listener), emitClassName);
    }

    public JSONValidatingWriter(JSONValidator validator) {
        this.validator = validator;
    }

    public JSONValidatingWriter(JSONValidator validator, boolean emitClassName) {
        super(emitClassName);
        this.validator = validator;
    }

    private String validate(String text) {
        validator.validate(text);
        return text;
    }

    @Override
    public String write(boolean b) {
        return validate(super.write(b));
    }

    @Override
    public String write(char c) {
        return validate(super.write(c));
    }

    @Override
    public String write(double d) {
        return validate(super.write(d));
    }

    @Override
    public String write(long n) {
        return validate(super.write(n));
    }

    @Override
    public String write(Object object) {
        return validate(super.write(object));
    }
}
