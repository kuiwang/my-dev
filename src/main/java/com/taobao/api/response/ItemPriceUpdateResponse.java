package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.price.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemPriceUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6475246545264536374L;

    /**
     * 商品结构里的num_iid，modified
     */
    @ApiField("item")
    private Item item;

    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}
