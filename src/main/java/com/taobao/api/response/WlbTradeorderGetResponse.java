package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbOrder;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wlb.tradeorder.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbTradeorderGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5824629214712584273L;

    /**
     * 物流宝订单列表信息
     */
    @ApiListField("wlb_order_list")
    @ApiField("wlb_order")
    private List<WlbOrder> wlbOrderList;

    public void setWlbOrderList(List<WlbOrder> wlbOrderList) {
        this.wlbOrderList = wlbOrderList;
    }

    public List<WlbOrder> getWlbOrderList() {
        return this.wlbOrderList;
    }

}
