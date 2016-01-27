package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.InsightWordPriceDistributeDataDTO;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.insight.wordspricedata.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaInsightWordspricedataGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3868189786875345782L;

    /**
     * 竞价区间分布数据
     */
    @ApiListField("word_pricedata_list")
    @ApiField("insight_word_price_distribute_data_d_t_o")
    private List<InsightWordPriceDistributeDataDTO> wordPricedataList;

    public List<InsightWordPriceDistributeDataDTO> getWordPricedataList() {
        return this.wordPricedataList;
    }

    public void setWordPricedataList(List<InsightWordPriceDistributeDataDTO> wordPricedataList) {
        this.wordPricedataList = wordPricedataList;
    }

}
