package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.jds.trades.statistics.diff response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JdsTradesStatisticsDiffResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3797957492147157442L;

    /**
     * pre_status比post_status多的tid列表
     */
    @ApiListField("tids")
    @ApiField("number")
    private List<Long> tids;

    /**
     * 总记录数
     */
    @ApiField("total_results")
    private Long totalResults;

    public List<Long> getTids() {
        return this.tids;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setTids(List<Long> tids) {
        this.tids = tids;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

}
