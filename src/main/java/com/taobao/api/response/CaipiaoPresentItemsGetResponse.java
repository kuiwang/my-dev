package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.LotteryWangcaiPresent;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.caipiao.present.items.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CaipiaoPresentItemsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5163779646155875832L;

    /**
     * 查询的结果列表
     */
    @ApiListField("results")
    @ApiField("lottery_wangcai_present")
    private List<LotteryWangcaiPresent> results;

    /**
     * 返回列表的大小
     */
    @ApiField("total_results")
    private Long totalResults;

    public void setResults(List<LotteryWangcaiPresent> results) {
        this.results = results;
    }

    public List<LotteryWangcaiPresent> getResults() {
        return this.results;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

}
