package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.promotionmisc.activity.range.all.remove response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionmiscActivityRangeAllRemoveResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6235868583593249691L;

    /**
     * 清空活动参与商品是否成功。
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
