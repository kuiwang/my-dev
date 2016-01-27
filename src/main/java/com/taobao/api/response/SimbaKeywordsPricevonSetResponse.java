package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Keyword;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.keywords.pricevon.set response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaKeywordsPricevonSetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1458596687654482118L;

    /**
     * 成功设置关键词价格的关键词列表
     */
    @ApiListField("keywords")
    @ApiField("keyword")
    private List<Keyword> keywords;

    public List<Keyword> getKeywords() {
        return this.keywords;
    }

    public void setKeywords(List<Keyword> keywords) {
        this.keywords = keywords;
    }

}
