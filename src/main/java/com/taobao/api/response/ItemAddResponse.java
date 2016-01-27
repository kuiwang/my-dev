package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1113542182152962915L;

    /**
     * 商品结构,仅有numIid和created返回
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
