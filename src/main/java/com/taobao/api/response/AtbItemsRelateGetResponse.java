package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AitaobaoItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.atb.items.relate.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AtbItemsRelateGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3178785193153941262L;

    /**
     * 爱淘宝商品列表
     */
    @ApiListField("items")
    @ApiField("aitaobao_item")
    private List<AitaobaoItem> items;

    /**
     * 搜索到符合条件的结果总数
     */
    @ApiField("total_results")
    private Long totalResults;

    public void setItems(List<AitaobaoItem> items) {
        this.items = items;
    }

    public List<AitaobaoItem> getItems() {
        return this.items;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

}
