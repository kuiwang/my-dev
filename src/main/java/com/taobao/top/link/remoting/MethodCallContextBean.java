package com.taobao.top.link.remoting;

public class MethodCallContextBean {

    private static ThreadLocal<MethodCallContext> currentContext = new ThreadLocal<MethodCallContext>();

    protected static void setCurrentContext(MethodCallContext context) {
        currentContext.set(context);
    }

    public Object get(Object key) {
        return currentContext.get().get(key);
    }
}
