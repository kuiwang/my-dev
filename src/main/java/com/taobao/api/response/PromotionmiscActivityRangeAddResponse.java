package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.promotionmisc.activity.range.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionmiscActivityRangeAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1584317984172598725L;

    /**
     * 增加商品范围是否成功。
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
