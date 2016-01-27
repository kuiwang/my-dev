package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 关键词分页对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class KeywordPage extends TaobaoObject {

    private static final long serialVersionUID = 2647848234954266135L;

    /**
     * 关键词列表
     */
    @ApiListField("keyword_list")
    @ApiField("keyword")
    private List<Keyword> keywordList;

    /**
     * 返回第几页的数据从1开始
     */
    @ApiField("page_no")
    private Long pageNo;

    /**
     * 每页数据大小
     */
    @ApiField("page_size")
    private Long pageSize;

    /**
     * 所查询的数据总数，只有当返回第一页数据时有值，当要求返回的数据非第一页时，此返回值无效
     */
    @ApiField("total_item")
    private Long totalItem;

    public List<Keyword> getKeywordList() {
        return this.keywordList;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public Long getTotalItem() {
        return this.totalItem;
    }

    public void setKeywordList(List<Keyword> keywordList) {
        this.keywordList = keywordList;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotalItem(Long totalItem) {
        this.totalItem = totalItem;
    }

}
