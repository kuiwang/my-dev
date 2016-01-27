package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.insight.catstopword.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaInsightCatstopwordGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2575987952418392162L;

    /**
     * 类目TOP词查询
     */
    @ApiListField("top_words")
    @ApiField("string")
    private List<String> topWords;

    public List<String> getTopWords() {
        return this.topWords;
    }

    public void setTopWords(List<String> topWords) {
        this.topWords = topWords;
    }

}
