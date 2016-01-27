package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Trade;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.trade.memo.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TradeMemoAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4214715186393956741L;

    /**
     * 对一笔交易添加备注后返回其对应的Trade，Trade中可用的返回字段有tid和created
     */
    @ApiField("trade")
    private Trade trade;

    public Trade getTrade() {
        return this.trade;
    }

    public void setTrade(Trade trade) {
        this.trade = trade;
    }

}
