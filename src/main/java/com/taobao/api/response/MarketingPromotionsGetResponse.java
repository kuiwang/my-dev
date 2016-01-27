package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Promotion;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.marketing.promotions.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class MarketingPromotionsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7862459692588625741L;

    /**
     * 商品对应的所有优惠列表
     */
    @ApiListField("promotions")
    @ApiField("promotion")
    private List<Promotion> promotions;

    /**
     * 结果总数
     */
    @ApiField("total_results")
    private Long totalResults;

    public List<Promotion> getPromotions() {
        return this.promotions;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

}
