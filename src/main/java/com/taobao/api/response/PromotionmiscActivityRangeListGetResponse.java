package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.PromotionRange;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.promotionmisc.activity.range.list.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionmiscActivityRangeListGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8643433458926556826L;

    /**
     * 活动参与的商品列表
     */
    @ApiListField("promotion_range_list")
    @ApiField("promotion_range")
    private List<PromotionRange> promotionRangeList;

    public void setPromotionRangeList(List<PromotionRange> promotionRangeList) {
        this.promotionRangeList = promotionRangeList;
    }

    public List<PromotionRange> getPromotionRangeList() {
        return this.promotionRangeList;
    }

}
