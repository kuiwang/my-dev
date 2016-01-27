package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SearchOrderResult;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.trip.jipiao.agent.order.find response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TripJipiaoAgentOrderFindResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3241151127228539713L;

    /**
     * 国内机票订单搜索返回结果对象
     */
    @ApiField("search_result")
    private SearchOrderResult searchResult;

    public SearchOrderResult getSearchResult() {
        return this.searchResult;
    }

    public void setSearchResult(SearchOrderResult searchResult) {
        this.searchResult = searchResult;
    }

}
