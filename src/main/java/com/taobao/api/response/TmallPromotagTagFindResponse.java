package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.PromotionTagQuery;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.promotag.tag.find response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallPromotagTagFindResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7667468439576745365L;

    /**
     * 查询结果类型
     */
    @ApiField("query_result")
    private PromotionTagQuery queryResult;

    public PromotionTagQuery getQueryResult() {
        return this.queryResult;
    }

    public void setQueryResult(PromotionTagQuery queryResult) {
        this.queryResult = queryResult;
    }

}
