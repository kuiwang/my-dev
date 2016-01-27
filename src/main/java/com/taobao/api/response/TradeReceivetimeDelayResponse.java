package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Trade;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.trade.receivetime.delay response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TradeReceivetimeDelayResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2433222842826898969L;

    /**
     * 更新后的交易数据，只包括tid和modified两个字段。
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
