package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.XItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.tae.items.list response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TaeItemsListResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4661935865925859218L;

    /**
     * 商品数据
     */
    @ApiListField("items")
    @ApiField("x_item")
    private List<XItem> items;

    public void setItems(List<XItem> items) {
        this.items = items;
    }

    public List<XItem> getItems() {
        return this.items;
    }

}
