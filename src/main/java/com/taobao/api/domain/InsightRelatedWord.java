package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 相关词信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class InsightRelatedWord extends TaobaoObject {

    private static final long serialVersionUID = 7279345966357872537L;

    /**
     * 相关词
     */
    @ApiField("related_word")
    private String relatedWord;

    /**
     * 相关度
     */
    @ApiField("weight")
    private String weight;

    public String getRelatedWord() {
        return this.relatedWord;
    }

    public String getWeight() {
        return this.weight;
    }

    public void setRelatedWord(String relatedWord) {
        this.relatedWord = relatedWord;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

}
