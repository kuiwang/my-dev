package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.quantity.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemQuantityUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2218111784947287916L;

    /**
     * iid、numIid、num和modified，skus中每个sku的skuId、quantity和modified
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
