package com.taobao.top.link.endpoint;

import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import com.taobao.top.link.LinkException;
import com.taobao.top.link.Text;

public class SendCallback {

    private Map<String, Object> _return;

    private EndpointProxy endpointProxy;

    private LinkException error;

    public Integer flag;

    private CountDownLatch latch;

    public SendCallback(EndpointProxy endpointProxy) {
        this.endpointProxy = endpointProxy;
        this.latch = new CountDownLatch(1);
    }

    public LinkException getError() {
        return this.error;
    }

    public Map<String, Object> getReturn() {
        return this._return;
    }

    public EndpointProxy getTarget() {
        return this.endpointProxy;
    }

    private void nofityReturn() {
        this.latch.countDown();
    }

    public void setComplete() {
        this.nofityReturn();
    }

    public void setError(LinkException error) {
        this.error = error;
        this.setComplete();
    }

    public void setReturn(Map<String, Object> _return) {
        this._return = _return;
        this.setComplete();
    }

    public void waitReturn(int timeout) throws LinkException {
        try {
            if (timeout > 0) {
                if (!this.latch.await(timeout, TimeUnit.MILLISECONDS)) {
                    throw new LinkException(
                            Text.E_EXECUTE_TIMEOUT);
                }
            } else {
                this.latch.await();
            }
        } catch (InterruptedException e) {
            throw new LinkException(Text.E_UNKNOWN_ERROR, e);
        }
    }
}
