package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 外卖分页
 *
 * @author auto create
 * @since 1.0, null
 */
public class TakeoutShopPage extends TaobaoObject {

    private static final long serialVersionUID = 6681923353527984962L;

    /**
     * 下一页页码
     */
    @ApiField("next_page")
    private Long nextPage;

    /**
     * 当前页码
     */
    @ApiField("page")
    private Long page;

    /**
     * 每页条数
     */
    @ApiField("page_size")
    private Long pageSize;

    /**
     * 上一页页码
     */
    @ApiField("prev_page")
    private Long prevPage;

    /**
     * 店铺信息列表
     */
    @ApiListField("takeout_summary_infos")
    @ApiField("takeout_shop_summary_info")
    private List<TakeoutShopSummaryInfo> takeoutSummaryInfos;

    /**
     * 总条数
     */
    @ApiField("total_count")
    private Long totalCount;

    /**
     * 总页数
     */
    @ApiField("total_page")
    private Long totalPage;

    public Long getNextPage() {
        return this.nextPage;
    }

    public void setNextPage(Long nextPage) {
        this.nextPage = nextPage;
    }

    public Long getPage() {
        return this.page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPrevPage() {
        return this.prevPage;
    }

    public void setPrevPage(Long prevPage) {
        this.prevPage = prevPage;
    }

    public List<TakeoutShopSummaryInfo> getTakeoutSummaryInfos() {
        return this.takeoutSummaryInfos;
    }

    public void setTakeoutSummaryInfos(List<TakeoutShopSummaryInfo> takeoutSummaryInfos) {
        this.takeoutSummaryInfos = takeoutSummaryInfos;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalPage() {
        return this.totalPage;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

}
