package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Order;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.trade.ordersku.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TradeOrderskuUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2474759987116665647L;

    /**
     * 只返回oid和modified
     */
    @ApiField("order")
    private Order order;

    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
