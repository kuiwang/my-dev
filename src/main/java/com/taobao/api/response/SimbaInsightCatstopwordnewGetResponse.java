package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.InsightWordDataUnderCatDTO;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.insight.catstopwordnew.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaInsightCatstopwordnewGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7837962967643671274L;

    /**
     * 类目下热门词详细数据
     */
    @ApiListField("topword_data_list")
    @ApiField("insight_word_data_under_cat_d_t_o")
    private List<InsightWordDataUnderCatDTO> topwordDataList;

    public void setTopwordDataList(List<InsightWordDataUnderCatDTO> topwordDataList) {
        this.topwordDataList = topwordDataList;
    }

    public List<InsightWordDataUnderCatDTO> getTopwordDataList() {
        return this.topwordDataList;
    }

}
