package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.wangwang.abstract.initialize response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WangwangAbstractInitializeResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1321785322289719986L;

    /**
     * 当ret_code=-1时这个变量才有
     */
    @ApiField("error_msg")
    private String errorMsg;

    /**
     * 0或-1表示成功或失败
     */
    @ApiField("ret_code")
    private Long retCode;

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public Long getRetCode() {
        return this.retCode;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setRetCode(Long retCode) {
        this.retCode = retCode;
    }

}
