package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.LotteryType;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.caipiao.lotterytypes.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CaipiaoLotterytypesGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7463427363123144515L;

    /**
     * 彩种的数据结构
     */
    @ApiListField("results")
    @ApiField("lottery_type")
    private List<LotteryType> results;

    /**
     * 彩种个数
     */
    @ApiField("total_results")
    private Long totalResults;

    public void setResults(List<LotteryType> results) {
        this.results = results;
    }

    public List<LotteryType> getResults() {
        return this.results;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

}
