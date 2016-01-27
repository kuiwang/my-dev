package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ArticleSub;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.vas.subsc.search response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class VasSubscSearchResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6363693688398271386L;

    /**
     * 订购关系对象
     */
    @ApiListField("article_subs")
    @ApiField("article_sub")
    private List<ArticleSub> articleSubs;

    /**
     * 总记录数
     */
    @ApiField("total_item")
    private Long totalItem;

    public List<ArticleSub> getArticleSubs() {
        return this.articleSubs;
    }

    public Long getTotalItem() {
        return this.totalItem;
    }

    public void setArticleSubs(List<ArticleSub> articleSubs) {
        this.articleSubs = articleSubs;
    }

    public void setTotalItem(Long totalItem) {
        this.totalItem = totalItem;
    }

}
