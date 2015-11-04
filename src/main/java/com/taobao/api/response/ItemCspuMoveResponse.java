package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.cspu.move response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemCspuMoveResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4416153968896355767L;

    /**
     * 商品结构里的num_iid，modified
     */
    @ApiField("item")
    private Item item;

    public void setItem(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return this.item;
    }

}
