package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 优惠标签查询结果
 *
 * @author auto create
 * @since 1.0, null
 */
public class PromotionTagQuery extends TaobaoObject {

    private static final long serialVersionUID = 8391878394743475857L;

    /**
     * 标签结果列表
     */
    @ApiListField("tag_list")
    @ApiField("promotion_tag")
    private List<PromotionTag> tagList;

    /**
     * 总记录数
     */
    @ApiField("total_results")
    private Long totalResults;

    public List<PromotionTag> getTagList() {
        return this.tagList;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setTagList(List<PromotionTag> tagList) {
        this.tagList = tagList;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

}
