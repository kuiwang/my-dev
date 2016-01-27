package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 描述一个词的所有相关词的对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class InsightRelatedWords extends TaobaoObject {

    private static final long serialVersionUID = 6336658743683658742L;

    /**
     * 原词
     */
    @ApiField("bidword")
    private String bidword;

    /**
     * 相关词信息列表
     */
    @ApiListField("related_word_items_list")
    @ApiField("insight_related_word")
    private List<InsightRelatedWord> relatedWordItemsList;

    public String getBidword() {
        return this.bidword;
    }

    public List<InsightRelatedWord> getRelatedWordItemsList() {
        return this.relatedWordItemsList;
    }

    public void setBidword(String bidword) {
        this.bidword = bidword;
    }

    public void setRelatedWordItemsList(List<InsightRelatedWord> relatedWordItemsList) {
        this.relatedWordItemsList = relatedWordItemsList;
    }

}
