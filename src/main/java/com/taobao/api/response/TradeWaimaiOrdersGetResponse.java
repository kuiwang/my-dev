package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ListResult;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.trade.waimai.orders.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TradeWaimaiOrdersGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7483875712261431459L;

    /**
     * 查询到的订单列表对象
     */
    @ApiField("result")
    private ListResult result;

    public void setResult(ListResult result) {
        this.result = result;
    }

    public ListResult getResult() {
        return this.result;
    }

}
