package com.aliyun.api;

import java.io.Serializable;
import java.util.Map;

import com.taobao.api.internal.mapping.ApiField;

/**
 * aliyun sdk 相应信息。
 * 
 * @author lijie.ma
 * @since 1.0, May 19, 2014
 */
public abstract class AliyunResponse implements Serializable {

    private static final long serialVersionUID = 7294025168689095197L;

    private String body;

    @ApiField("Code")
    private String errorCode;

    @ApiField("Message")
    private String message;

    private Map<String, String> params;

    public String getBody() {
        return body;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public boolean isSuccess() {
        return this.errorCode == null;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

}
