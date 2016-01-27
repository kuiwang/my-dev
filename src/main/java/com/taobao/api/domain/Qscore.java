package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 质量得分类
 *
 * @author auto create
 * @since 1.0, null
 */
public class Qscore extends TaobaoObject {

    private static final long serialVersionUID = 5271136224597144427L;

    /**
     * 类目出价质量得分
     */
    @ApiField("catmatch_qscore")
    private String catmatchQscore;

    /**
     * 词质量得分列表
     */
    @ApiListField("keyword_qscore_list")
    @ApiField("keyword_qscore")
    private List<KeywordQscore> keywordQscoreList;

    public String getCatmatchQscore() {
        return this.catmatchQscore;
    }

    public List<KeywordQscore> getKeywordQscoreList() {
        return this.keywordQscoreList;
    }

    public void setCatmatchQscore(String catmatchQscore) {
        this.catmatchQscore = catmatchQscore;
    }

    public void setKeywordQscoreList(List<KeywordQscore> keywordQscoreList) {
        this.keywordQscoreList = keywordQscoreList;
    }

}
