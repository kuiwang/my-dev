package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.rp.returngoods.refill response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class RpReturngoodsRefillResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7252661355347232343L;

    /**
     * 验货操作是否成功
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
