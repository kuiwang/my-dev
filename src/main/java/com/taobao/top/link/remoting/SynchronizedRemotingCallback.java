package com.taobao.top.link.remoting;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import com.taobao.top.link.Text;

public class SynchronizedRemotingCallback extends RemotingCallback {

    private Throwable failure;

    private CountDownLatch latch;

    private MethodReturn methodReturn;

    private boolean sucess;

    public SynchronizedRemotingCallback() {
        this.latch = new CountDownLatch(1);
    }

    public Throwable getFailure() {
        return this.failure;
    }

    public MethodReturn getMethodReturn() {
        return this.methodReturn;
    }

    public boolean isSucess() {
        return this.sucess;
    }

    private void nofityCall() {
        this.latch.countDown();
    }

    @Override
    public void onException(Throwable exception) {
        this.sucess = false;
        this.failure = exception;
        this.nofityCall();
    }

    @Override
    public void onMethodReturn(MethodReturn methodReturn) {
        this.sucess = true;
        this.methodReturn = methodReturn;
        this.nofityCall();
    }

    public void waitReturn(int timeout) throws RemotingException {
        try {
            if (timeout > 0) {
                if (!this.latch.await(timeout, TimeUnit.MILLISECONDS)) {
                    throw new RemotingException(
                            Text.RPC_EXECUTE_TIMEOUT);
                }
            } else {
                this.latch.await();
            }
        } catch (InterruptedException e) {
            throw new RemotingException(Text.RPC_WAIT_INTERRUPTED, e);
        }
    }
}
