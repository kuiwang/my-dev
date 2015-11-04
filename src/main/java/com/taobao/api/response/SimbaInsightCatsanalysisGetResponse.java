package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.INCategoryAnalysis;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.insight.catsanalysis.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaInsightCatsanalysisGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3322657177922913268L;

    /**
     * 词分析数据列表
     */
    @ApiListField("in_category_analyses")
    @ApiField("i_n_category_analysis")
    private List<INCategoryAnalysis> inCategoryAnalyses;

    public void setInCategoryAnalyses(List<INCategoryAnalysis> inCategoryAnalyses) {
        this.inCategoryAnalyses = inCategoryAnalyses;
    }

    public List<INCategoryAnalysis> getInCategoryAnalyses() {
        return this.inCategoryAnalyses;
    }

}
