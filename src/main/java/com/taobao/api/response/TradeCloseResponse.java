package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Trade;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.trade.close response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TradeCloseResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7147325687987294634L;

    /**
     * 关闭交易时返回的Trade信息，可用字段有tid和modified
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
