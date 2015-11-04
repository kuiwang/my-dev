package com.taobao.api.internal.tdc;

import java.io.Serializable;

/**
 * TDC查询结果类
 * 
 * @author haofeng 2013-1-15
 */
public class TdcResponse implements Serializable {

    private static final long serialVersionUID = 9054363385540503918L;

    private String errorCode;

    private String msg;

    private String subCode;

    private String subMsg;

    private String body;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSubCode() {
        return this.subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public String getSubMsg() {
        return this.subMsg;
    }

    public void setSubMsg(String subMsg) {
        this.subMsg = subMsg;
    }

    public boolean isSuccess() {
        return this.errorCode == null && this.subCode == null;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
