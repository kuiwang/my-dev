package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.rp.returngoods.agree response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class RpReturngoodsAgreeResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7116311151236596613L;

    /**
     * 操作成功
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
