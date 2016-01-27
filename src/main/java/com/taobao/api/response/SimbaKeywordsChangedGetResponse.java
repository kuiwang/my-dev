package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.KeywordPage;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.keywords.changed.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaKeywordsChangedGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8644728793726355132L;

    /**
     * 关键词分页对象
     */
    @ApiField("keywords")
    private KeywordPage keywords;

    public KeywordPage getKeywords() {
        return this.keywords;
    }

    public void setKeywords(KeywordPage keywords) {
        this.keywords = keywords;
    }

}
