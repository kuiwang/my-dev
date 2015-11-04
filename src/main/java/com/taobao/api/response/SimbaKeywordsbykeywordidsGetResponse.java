package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Keyword;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.keywordsbykeywordids.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaKeywordsbykeywordidsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8567175865721825833L;

    /**
     * 取得的关键词列表
     */
    @ApiListField("keywords")
    @ApiField("keyword")
    private List<Keyword> keywords;

    public void setKeywords(List<Keyword> keywords) {
        this.keywords = keywords;
    }

    public List<Keyword> getKeywords() {
        return this.keywords;
    }

}
