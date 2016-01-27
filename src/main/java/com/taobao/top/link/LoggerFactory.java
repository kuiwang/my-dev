package com.taobao.top.link;

public interface LoggerFactory {

    public Logger create(Class<?> type);

    public Logger create(Object object);

    public Logger create(String type);
}
