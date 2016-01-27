package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.items.custom.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemsCustomGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8832929481714569372L;

    /**
     * 商品列表，具体返回字段以fields决定
     */
    @ApiListField("items")
    @ApiField("item")
    private List<Item> items;

    public List<Item> getItems() {
        return this.items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
