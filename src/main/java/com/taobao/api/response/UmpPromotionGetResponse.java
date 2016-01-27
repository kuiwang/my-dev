package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.PromotionDisplayTop;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ump.promotion.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UmpPromotionGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7589567327874765471L;

    /**
     * 优惠详细信息
     */
    @ApiField("promotions")
    private PromotionDisplayTop promotions;

    public PromotionDisplayTop getPromotions() {
        return this.promotions;
    }

    public void setPromotions(PromotionDisplayTop promotions) {
        this.promotions = promotions;
    }

}
