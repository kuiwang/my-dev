package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6633832666661589512L;

    /**
     * 获取的商品 具体字段根据权限和设定的fields决定
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
