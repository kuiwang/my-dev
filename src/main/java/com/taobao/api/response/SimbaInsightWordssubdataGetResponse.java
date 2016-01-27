package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.InsightWordSubDataDTO;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.insight.wordssubdata.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaInsightWordssubdataGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5845636726251237199L;

    /**
     * 关键词按流量细分的数据
     */
    @ApiListField("word_subdata_list")
    @ApiField("insight_word_sub_data_d_t_o")
    private List<InsightWordSubDataDTO> wordSubdataList;

    public List<InsightWordSubDataDTO> getWordSubdataList() {
        return this.wordSubdataList;
    }

    public void setWordSubdataList(List<InsightWordSubDataDTO> wordSubdataList) {
        this.wordSubdataList = wordSubdataList;
    }

}
