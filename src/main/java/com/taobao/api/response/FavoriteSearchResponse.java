package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CollectItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.favorite.search response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FavoriteSearchResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8114444156621253966L;

    /**
     * 返回查询到的商品或店铺的数字id列表
     */
    @ApiListField("collect_items")
    @ApiField("collect_item")
    private List<CollectItem> collectItems;

    /**
     * 查询到的宝贝的收藏总数
     */
    @ApiField("total_results")
    private Long totalResults;

    public void setCollectItems(List<CollectItem> collectItems) {
        this.collectItems = collectItems;
    }

    public List<CollectItem> getCollectItems() {
        return this.collectItems;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

}
