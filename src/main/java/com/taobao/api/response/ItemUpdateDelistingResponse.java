package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.update.delisting response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemUpdateDelistingResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5416778281851495623L;

    /**
     * 返回商品更新信息：返回的结果是:num_iid和modified
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
