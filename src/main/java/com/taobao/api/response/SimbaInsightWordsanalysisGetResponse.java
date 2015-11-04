package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.INWordAnalysis;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.insight.wordsanalysis.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaInsightWordsanalysisGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7824287626725244919L;

    /**
     * 词分析列表
     */
    @ApiListField("in_word_analyses")
    @ApiField("i_n_word_analysis")
    private List<INWordAnalysis> inWordAnalyses;

    public void setInWordAnalyses(List<INWordAnalysis> inWordAnalyses) {
        this.inWordAnalyses = inWordAnalyses;
    }

    public List<INWordAnalysis> getInWordAnalyses() {
        return this.inWordAnalyses;
    }

}
