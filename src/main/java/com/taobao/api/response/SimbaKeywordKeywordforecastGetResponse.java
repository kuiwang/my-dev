package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.KeywordForecast;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.keyword.keywordforecast.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaKeywordKeywordforecastGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8515212266855431237L;

    /**
     * 词预估结果信息
     * 
     * 预测数据皆为估算结果，以实际发生为准
     */
    @ApiField("keyword_forecast")
    private KeywordForecast keywordForecast;

    public KeywordForecast getKeywordForecast() {
        return this.keywordForecast;
    }

    public void setKeywordForecast(KeywordForecast keywordForecast) {
        this.keywordForecast = keywordForecast;
    }

}
