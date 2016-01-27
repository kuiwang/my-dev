package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.sp.content.deletebyids response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SpContentDeletebyidsResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8265596677231392759L;

    /**
     * 是否成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

}
