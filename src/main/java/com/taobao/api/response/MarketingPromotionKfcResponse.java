package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.marketing.promotion.kfc response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class MarketingPromotionKfcResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6197645751875318465L;

    /**
     * 是否成功
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
