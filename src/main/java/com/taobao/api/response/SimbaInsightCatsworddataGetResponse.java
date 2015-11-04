package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.InsightWordDataUnderCatDTO;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.insight.catsworddata.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaInsightCatsworddataGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4232712747444444744L;

    /**
     * 关键词在类目下的数据
     */
    @ApiListField("catword_data_list")
    @ApiField("insight_word_data_under_cat_d_t_o")
    private List<InsightWordDataUnderCatDTO> catwordDataList;

    public void setCatwordDataList(List<InsightWordDataUnderCatDTO> catwordDataList) {
        this.catwordDataList = catwordDataList;
    }

    public List<InsightWordDataUnderCatDTO> getCatwordDataList() {
        return this.catwordDataList;
    }

}
