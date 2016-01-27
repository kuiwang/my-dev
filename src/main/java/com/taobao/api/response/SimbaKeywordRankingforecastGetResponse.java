package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Rankingforecast;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.keyword.rankingforecast.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaKeywordRankingforecastGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3323251366368154799L;

    /**
     * 词预估结果信息
     * 
     * 预测数据皆为估算结果，以实际发生为准
     */
    @ApiListField("keyword_ranking_forecast")
    @ApiField("rankingforecast")
    private List<Rankingforecast> keywordRankingForecast;

    public List<Rankingforecast> getKeywordRankingForecast() {
        return this.keywordRankingForecast;
    }

    public void setKeywordRankingForecast(List<Rankingforecast> keywordRankingForecast) {
        this.keywordRankingForecast = keywordRankingForecast;
    }

}
