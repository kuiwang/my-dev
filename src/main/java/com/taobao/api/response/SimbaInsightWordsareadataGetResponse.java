package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.InsightWordsAreaDistributeDataDTO;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.insight.wordsareadata.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaInsightWordsareadataGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7513469388392656933L;

    /**
     * 地域细分数据
     */
    @ApiListField("word_areadata_list")
    @ApiField("insight_words_area_distribute_data_d_t_o")
    private List<InsightWordsAreaDistributeDataDTO> wordAreadataList;

    public void setWordAreadataList(List<InsightWordsAreaDistributeDataDTO> wordAreadataList) {
        this.wordAreadataList = wordAreadataList;
    }

    public List<InsightWordsAreaDistributeDataDTO> getWordAreadataList() {
        return this.wordAreadataList;
    }

}
