package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.items.onsale.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemsOnsaleGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6114465871722622199L;

    /**
     * 搜索到的商品列表，具体字段根据设定的fields决定，不包括desc字段
     */
    @ApiListField("items")
    @ApiField("item")
    private List<Item> items;

    /**
     * 搜索到符合条件的结果总数
     */
    @ApiField("total_results")
    private Long totalResults;

    public List<Item> getItems() {
        return this.items;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

}
