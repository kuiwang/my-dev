package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 商品资质信息校验结果
 *
 * @author auto create
 * @since 1.0, null
 */
public class RemoteResult extends TaobaoObject {

    private static final long serialVersionUID = 1497295843455979576L;

    /**
     * 校验结果信息
     */
    @ApiField("message")
    private String message;

    /**
     * 校验结果，true/false
     */
    @ApiField("result")
    private Boolean result;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getResult() {
        return this.result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

}
