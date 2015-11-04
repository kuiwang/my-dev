package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.upp.shoppoint.send response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UppShoppointSendResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1296498213386647856L;

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
