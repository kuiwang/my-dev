package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.InsightRelatedWords;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.insight.relatedwords.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaInsightRelatedwordsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7312323676667997919L;

    /**
     * 相关词列表
     */
    @ApiListField("related_words_result_list")
    @ApiField("insight_related_words")
    private List<InsightRelatedWords> relatedWordsResultList;

    public List<InsightRelatedWords> getRelatedWordsResultList() {
        return this.relatedWordsResultList;
    }

    public void setRelatedWordsResultList(List<InsightRelatedWords> relatedWordsResultList) {
        this.relatedWordsResultList = relatedWordsResultList;
    }

}
