package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TicketItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.ticket.items.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TicketItemsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5457921781375487929L;

    /**
     * 商品信息
     */
    @ApiListField("ticket_items")
    @ApiField("ticket_item")
    private List<TicketItem> ticketItems;

    public List<TicketItem> getTicketItems() {
        return this.ticketItems;
    }

    public void setTicketItems(List<TicketItem> ticketItems) {
        this.ticketItems = ticketItems;
    }

}
