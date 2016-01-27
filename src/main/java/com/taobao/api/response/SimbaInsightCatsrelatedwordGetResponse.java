package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.insight.catsrelatedword.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaInsightCatsrelatedwordGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8514136652974415355L;

    /**
     * 类目相关词对象列表
     */
    @ApiListField("related_words")
    @ApiField("string")
    private List<String> relatedWords;

    public List<String> getRelatedWords() {
        return this.relatedWords;
    }

    public void setRelatedWords(List<String> relatedWords) {
        this.relatedWords = relatedWords;
    }

}
