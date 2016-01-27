package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 翻页数据对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class DdTopPagination extends TaobaoObject {

    private static final long serialVersionUID = 4273316714687143769L;

    /**
     * 结果列表
     */
    @ApiListField("list")
    @ApiField("dd_top_reserved_v_o")
    private List<DdTopReservedVO> list;

    /**
     * 翻页游码
     */
    @ApiField("page_num")
    private Long pageNum;

    /**
     * 页面大小
     */
    @ApiField("page_size")
    private Long pageSize;

    /**
     * 总记录数
     */
    @ApiField("total_count")
    private Long totalCount;

    /**
     * 可返回的记录数
     */
    @ApiField("view_count")
    private Long viewCount;

    public List<DdTopReservedVO> getList() {
        return this.list;
    }

    public Long getPageNum() {
        return this.pageNum;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public Long getViewCount() {
        return this.viewCount;
    }

    public void setList(List<DdTopReservedVO> list) {
        this.list = list;
    }

    public void setPageNum(Long pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
    }

}
