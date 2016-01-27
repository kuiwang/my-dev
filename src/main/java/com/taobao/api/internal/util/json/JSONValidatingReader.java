package com.taobao.api.internal.util.json;

public class JSONValidatingReader extends JSONReader {

    public static final Object INVALID = new Object();

    private JSONValidator validator;

    public JSONValidatingReader() {
        this(new StdoutStreamErrorListener());
    }

    public JSONValidatingReader(JSONErrorListener listener) {
        this(new JSONValidator(listener));
    }

    public JSONValidatingReader(JSONValidator validator) {
        this.validator = validator;
    }

    @Override
    public Object read(String string) {
        if (!validator.validate(string)) {
            return INVALID;
        }
        return super.read(string);
    }
}
