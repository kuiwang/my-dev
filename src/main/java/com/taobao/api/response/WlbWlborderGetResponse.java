package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbOrder;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.wlb.wlborder.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbWlborderGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8127629831884435752L;

    /**
     * 物流宝订单详情
     */
    @ApiField("wlb_order")
    private WlbOrder wlbOrder;

    public void setWlbOrder(WlbOrder wlbOrder) {
        this.wlbOrder = wlbOrder;
    }

    public WlbOrder getWlbOrder() {
        return this.wlbOrder;
    }

}
