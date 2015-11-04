package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.DealerOrder;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.fenxiao.dealer.requisitionorder.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoDealerRequisitionorderGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7242271563995474579L;

    /**
     * 采购申请/经销采购单结果列表
     */
    @ApiListField("dealer_orders")
    @ApiField("dealer_order")
    private List<DealerOrder> dealerOrders;

    /**
     * 按查询条件查到的记录总数
     */
    @ApiField("total_results")
    private Long totalResults;

    public void setDealerOrders(List<DealerOrder> dealerOrders) {
        this.dealerOrders = dealerOrders;
    }

    public List<DealerOrder> getDealerOrders() {
        return this.dealerOrders;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

}
