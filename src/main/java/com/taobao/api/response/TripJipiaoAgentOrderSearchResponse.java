package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SearchOrderResult;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.trip.jipiao.agent.order.search response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TripJipiaoAgentOrderSearchResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6231752122476812118L;

    /**
     * 国内机票订单搜索返回结果对象
     */
    @ApiField("search_result")
    private SearchOrderResult searchResult;

    public void setSearchResult(SearchOrderResult searchResult) {
        this.searchResult = searchResult;
    }

    public SearchOrderResult getSearchResult() {
        return this.searchResult;
    }

}
