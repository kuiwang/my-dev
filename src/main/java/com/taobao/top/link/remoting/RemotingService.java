package com.taobao.top.link.remoting;

import java.net.URI;
import java.util.concurrent.atomic.AtomicInteger;

import com.taobao.top.link.DefaultLoggerFactory;
import com.taobao.top.link.LoggerFactory;
import com.taobao.top.link.channel.ClientChannelPooledSelector;
import com.taobao.top.link.channel.ClientChannelSelector;

public class RemotingService {

    private static RemotingClientChannelHandler channelHandler;

    private static ClientChannelSelector channelSelector;

    private static LoggerFactory loggerFactory = DefaultLoggerFactory.getDefault();

    private static SerializationFactory serializationFactory;

    public static DynamicProxy connect(URI remoteUri) {
        return new DynamicProxy(remoteUri, getChannelSelector(), getChannelHandler());
    }

    public static Object connect(URI remoteUri, Class<?> interfaceClass) {
        return connect(remoteUri, interfaceClass, null);
    }

    public static Object connect(URI remoteUri, Class<?> interfaceClass, String serializationFormat) {
        DynamicProxy proxy = connect(remoteUri);
        proxy.setSerializationFormat(serializationFormat);
        return proxy.create(interfaceClass, remoteUri);
    }

    private synchronized static RemotingClientChannelHandler getChannelHandler() {
        if (channelHandler == null) {
            channelHandler = new RemotingClientChannelHandler(
                    loggerFactory, new AtomicInteger(0));
        }
        if (serializationFactory != null) {
            channelHandler
                    .setSerializationFactory(serializationFactory);
        }
        return channelHandler;
    }

    private synchronized static ClientChannelSelector getChannelSelector() {
        if (channelSelector == null) {
            channelSelector = new ClientChannelPooledSelector(
                    loggerFactory);
        }
        return channelSelector;
    }

    protected static void setChannelSelector(ClientChannelSelector selector) {
        channelSelector = selector;
    }

    protected static void setLoggerFactory(LoggerFactory loggerFactory) {
        RemotingService.loggerFactory = loggerFactory;
    }

    protected static void setSerializationFactory(SerializationFactory serializationFactory) {
        RemotingService.serializationFactory = serializationFactory;
    }
}
