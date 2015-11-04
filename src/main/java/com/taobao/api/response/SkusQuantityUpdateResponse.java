package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.skus.quantity.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SkusQuantityUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7224758434152193156L;

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
