package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.KeywordQscore;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.keywords.qscore.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaKeywordsQscoreGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2236984641557933134L;

    /**
     * 取得的关键词质量得分列表
     */
    @ApiListField("keyword_qscore_list")
    @ApiField("keyword_qscore")
    private List<KeywordQscore> keywordQscoreList;

    public List<KeywordQscore> getKeywordQscoreList() {
        return this.keywordQscoreList;
    }

    public void setKeywordQscoreList(List<KeywordQscore> keywordQscoreList) {
        this.keywordQscoreList = keywordQscoreList;
    }

}
