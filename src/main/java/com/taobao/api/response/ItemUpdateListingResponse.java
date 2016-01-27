package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.update.listing response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemUpdateListingResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8815435282861583186L;

    /**
     * 上架后返回的商品信息：返回的结果就是:num_iid和modified
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
