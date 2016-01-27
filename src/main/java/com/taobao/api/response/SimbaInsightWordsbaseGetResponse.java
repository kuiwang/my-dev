package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.INWordBase;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.insight.wordsbase.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaInsightWordsbaseGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2777691561138659691L;

    /**
     * 词基础数据对象列表
     */
    @ApiListField("in_word_bases")
    @ApiField("i_n_word_base")
    private List<INWordBase> inWordBases;

    public List<INWordBase> getInWordBases() {
        return this.inWordBases;
    }

    public void setInWordBases(List<INWordBase> inWordBases) {
        this.inWordBases = inWordBases;
    }

}
