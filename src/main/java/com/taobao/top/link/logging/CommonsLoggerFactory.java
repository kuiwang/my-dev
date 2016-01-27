package com.taobao.top.link.logging;

import org.apache.commons.logging.LogFactory;

import com.taobao.top.link.Logger;
import com.taobao.top.link.LoggerFactory;

public class CommonsLoggerFactory implements LoggerFactory {

    @Override
    public Logger create(Class<?> type) {
        return new CommonsLogger(LogFactory.getLog(type));
    }

    @Override
    public Logger create(Object object) {
        return new CommonsLogger(LogFactory.getLog(object.getClass()));
    }

    @Override
    public Logger create(String type) {
        return new CommonsLogger(LogFactory.getLog(type));
    }
}
