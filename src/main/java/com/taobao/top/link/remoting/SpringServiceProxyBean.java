package com.taobao.top.link.remoting;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import com.taobao.top.link.BufferManager;
import com.taobao.top.link.LoggerFactory;
import com.taobao.top.link.channel.ClientChannelSelector;
import com.taobao.top.link.channel.ClientChannelSharedSelector;
import com.taobao.top.link.logging.LogUtil;

// easy support spring bean
public class SpringServiceProxyBean implements FactoryBean, InitializingBean {

    private static RemotingClientChannelHandler channelHandler;

    private static ClientChannelSelector channelSelector;

    private static Object initObject;

    private synchronized static void init(Object obj) {
        if (initObject != null) {
            return;
        }
        // default set 2M max message size for client
        // TODO:change to growing buffer
        BufferManager.setBufferSize(1024 * 1024 * 2);
        LoggerFactory loggerFactory = LogUtil.getLoggerFactory(obj);
        channelSelector = new ClientChannelSharedSelector(loggerFactory);
        channelHandler = new RemotingClientChannelHandler(loggerFactory, new AtomicInteger(0));
        channelHandler.setSerializationFactory(SerializerUtil.getSerializationFactory(obj));
        initObject = new Object();
    }

    private int executionTimeout;

    private String format;

    private Class<?> interfaceType;

    private URI uri;

    @Override
    public void afterPropertiesSet() throws Exception {
        init(this);
    }

    @Override
    public Object getObject() throws Exception {
        DynamicProxy proxy = new DynamicProxy(this.uri, channelSelector, channelHandler);
        proxy.setSerializationFormat(this.format);
        proxy.setExecutionTimeout(this.executionTimeout);
        return proxy.create(this.interfaceType, this.uri);
    }

    @Override
    public Class<?> getObjectType() {
        return this.interfaceType;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public void setExecutionTimeout(String executionTimeout) {
        this.executionTimeout = Integer.parseInt(executionTimeout);
    }

    public void setHeaders(HandshakingHeadersBean headersBean) {
        headersBean.setUri(this.uri);
    }

    public void setInterfaceName(String interfaceName) throws ClassNotFoundException {
        this.interfaceType = Class.forName(interfaceName);
    }

    public void setSerialization(String format) {
        this.format = format;
    }

    public void setUri(String uri) throws URISyntaxException {
        this.uri = new URI(uri);
    }
}
