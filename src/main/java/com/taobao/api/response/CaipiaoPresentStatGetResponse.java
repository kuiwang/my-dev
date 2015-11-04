package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.LotteryWangcaiPresentStat;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.caipiao.present.stat.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CaipiaoPresentStatGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2858157238594744619L;

    /**
     * 查询的结果集
     */
    @ApiListField("results")
    @ApiField("lottery_wangcai_present_stat")
    private List<LotteryWangcaiPresentStat> results;

    /**
     * 查询的结果集大小
     */
    @ApiField("total_results")
    private Long totalResults;

    public void setResults(List<LotteryWangcaiPresentStat> results) {
        this.results = results;
    }

    public List<LotteryWangcaiPresentStat> getResults() {
        return this.results;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

}
