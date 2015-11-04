package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Discount;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.fenxiao.discounts.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoDiscountsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2678178975628914124L;

    /**
     * 折扣数据结构
     */
    @ApiListField("discounts")
    @ApiField("discount")
    private List<Discount> discounts;

    /**
     * 记录数
     */
    @ApiField("total_results")
    private Long totalResults;

    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

    public List<Discount> getDiscounts() {
        return this.discounts;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

}
