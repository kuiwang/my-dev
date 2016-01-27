package com.taobao.api;

import java.io.Serializable;
import java.util.Map;

import com.taobao.api.internal.mapping.ApiField;

/**
 * TOPAPI基础响应信息。
 * 
 * @author fengsheng
 */
public abstract class TaobaoResponse implements Serializable {

    private static final long serialVersionUID = 5014379068811962022L;

    private String body;

    @ApiField("code")
    private String errorCode;

    @ApiField("msg")
    private String msg;

    private Map<String, String> params;

    @ApiField("sub_code")
    private String subCode;

    @ApiField("sub_msg")
    private String subMsg;

    @ApiField("top_forbidden_fields")
    private String topForbiddenFields;

    public String getBody() {
        return body;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public String getSubCode() {
        return this.subCode;
    }

    public String getSubMsg() {
        return this.subMsg;
    }

    public String getTopForbiddenFields() {
        return this.topForbiddenFields;
    }

    public boolean isSuccess() {
        return (this.errorCode == null) && (this.subCode == null);
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public void setSubMsg(String subMsg) {
        this.subMsg = subMsg;
    }

    public void setTopForbiddenFields(String topForbiddenFields) {
        this.topForbiddenFields = topForbiddenFields;
    }

}
