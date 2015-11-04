package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TicketItem;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ticket.item.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TicketItemGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5745633563873721662L;

    /**
     * 参见TicketItem数据结构文档
     */
    @ApiField("ticket_item")
    private TicketItem ticketItem;

    public void setTicketItem(TicketItem ticketItem) {
        this.ticketItem = ticketItem;
    }

    public TicketItem getTicketItem() {
        return this.ticketItem;
    }

}
