package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Trade;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.trade.postage.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TradePostageUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5434175787544654713L;

    /**
     * 返回trade类型，其中包含修改时间modified，修改邮费post_fee，
     * 修改后的总费用total_fee和买家实付款payment
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
