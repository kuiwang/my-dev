package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.items.list.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemsListGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4468293186421867964L;

    /**
     * 获取的商品 具体字段根据权限和设定的fields决定
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
