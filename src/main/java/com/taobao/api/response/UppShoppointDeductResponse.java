package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.upp.shoppoint.deduct response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UppShoppointDeductResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3835126519859492321L;

    /**
     * 是否调用成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

}
