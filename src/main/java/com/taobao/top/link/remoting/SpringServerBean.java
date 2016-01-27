package com.taobao.top.link.remoting;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.taobao.top.link.BufferManager;
import com.taobao.top.link.LoggerFactory;
import com.taobao.top.link.logging.LogUtil;

public class SpringServerBean implements InitializingBean, BeanFactoryAware,
        ApplicationContextAware {

    private ListableBeanFactory beanFactory;

    private HandshakerBean handshaker;

    private int maxMessageSize;

    private int maxThreadCount = 200;

    private int minThreadCount = 20;

    private String path;

    private int port;

    @Override
    public void afterPropertiesSet() throws Exception {
        if (this.maxMessageSize > 0) {
            BufferManager.setBufferSize(this.maxMessageSize);
        }

        LoggerFactory loggerFactory = LogUtil.getLoggerFactory(this);

        RemotingConfiguration
                .configure()
                .loggerFactory(loggerFactory)
                .SerializationFactory(SerializerUtil.getSerializationFactory(this))
                .defaultServerChannelHandler(
                        new SpringRemotingServerChannelHandler(loggerFactory, this.handshaker))
                .websocket(this.port)
                .addProcessor(this.path, new SpringMethodCallProcessor(this.beanFactory))
                .businessThreadPool(
                        new ThreadPoolExecutor(this.minThreadCount, this.maxThreadCount, 300,
                                TimeUnit.SECONDS, new SynchronousQueue<Runnable>()));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.beanFactory = applicationContext;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = (ListableBeanFactory) beanFactory;
    }

    public void setHandshaker(HandshakerBean handshaker) {
        this.handshaker = handshaker;
    }

    public void setMaxBusinessThreadCount(int value) {
        this.maxThreadCount = value;
    }

    public void setMaxMessageSize(int value) {
        this.maxMessageSize = value;
    }

    public void setMinBusinessThreadCount(int value) {
        this.minThreadCount = value;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setPort(int value) {
        this.port = value;
    }
}
