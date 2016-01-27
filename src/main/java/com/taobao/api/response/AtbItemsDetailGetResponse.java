package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AitaobaoItemDetail;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.atb.items.detail.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AtbItemsDetailGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7722721674345916574L;

    /**
     * 爱淘宝商品详情列表
     */
    @ApiListField("atb_item_details")
    @ApiField("aitaobao_item_detail")
    private List<AitaobaoItemDetail> atbItemDetails;

    /**
     * 搜索到符合条件的结果总数
     */
    @ApiField("total_results")
    private Long totalResults;

    public List<AitaobaoItemDetail> getAtbItemDetails() {
        return this.atbItemDetails;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setAtbItemDetails(List<AitaobaoItemDetail> atbItemDetails) {
        this.atbItemDetails = atbItemDetails;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

}
