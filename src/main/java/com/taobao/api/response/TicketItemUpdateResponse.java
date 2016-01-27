package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TicketItemProcessResult;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ticket.item.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TicketItemUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3596642999792571989L;

    /**
     * 门票商品操作结果，具体请参见TicketItemProcessResult数据结构
     */
    @ApiField("ticket_item_process_result")
    private TicketItemProcessResult ticketItemProcessResult;

    public TicketItemProcessResult getTicketItemProcessResult() {
        return this.ticketItemProcessResult;
    }

    public void setTicketItemProcessResult(TicketItemProcessResult ticketItemProcessResult) {
        this.ticketItemProcessResult = ticketItemProcessResult;
    }

}
