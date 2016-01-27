package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.fenxiao.dealer.requisitionorder.create response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoDealerRequisitionorderCreateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2233624712746757798L;

    /**
     * 经销采购申请编号
     */
    @ApiField("dealer_order_id")
    private Long dealerOrderId;

    public Long getDealerOrderId() {
        return this.dealerOrderId;
    }

    public void setDealerOrderId(Long dealerOrderId) {
        this.dealerOrderId = dealerOrderId;
    }

}
