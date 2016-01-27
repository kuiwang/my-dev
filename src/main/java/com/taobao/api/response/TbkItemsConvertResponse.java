package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TbkItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.tbk.items.convert response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TbkItemsConvertResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7145615316517635658L;

    /**
     * 淘宝客商品对象列表
     */
    @ApiListField("tbk_items")
    @ApiField("tbk_item")
    private List<TbkItem> tbkItems;

    /**
     * 返回的结果总数
     */
    @ApiField("total_results")
    private Long totalResults;

    public List<TbkItem> getTbkItems() {
        return this.tbkItems;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setTbkItems(List<TbkItem> tbkItems) {
        this.tbkItems = tbkItems;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

}
