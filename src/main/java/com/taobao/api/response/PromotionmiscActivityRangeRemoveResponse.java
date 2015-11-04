package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.promotionmisc.activity.range.remove response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionmiscActivityRangeRemoveResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4388766633473397114L;

    /**
     * 去除活动参与的商品是否成功。
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
