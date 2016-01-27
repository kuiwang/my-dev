package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.InsightWordDataDTO;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.insight.wordsdata.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaInsightWordsdataGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8217254365334251179L;

    /**
     * 关键词大盘数据列表
     */
    @ApiListField("word_data_list")
    @ApiField("insight_word_data_d_t_o")
    private List<InsightWordDataDTO> wordDataList;

    public List<InsightWordDataDTO> getWordDataList() {
        return this.wordDataList;
    }

    public void setWordDataList(List<InsightWordDataDTO> wordDataList) {
        this.wordDataList = wordDataList;
    }

}
