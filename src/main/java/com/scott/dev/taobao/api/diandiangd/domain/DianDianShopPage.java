package com.scott.dev.taobao.api.diandiangd.domain;

import java.util.List;

/**
 * 点点店铺分页结构
 */
public class DianDianShopPage {

    /**
     * 淘点点店铺数据列表
     */
    private List<DianDianShop> dianDianShopList;

    /**
     * 下一页页码
     */
    private Long nextPage;

    /**
     * 页码
     */
    private Long pageNo;

    /**
     * 每页大小
     */
    private Long pageSize;

    /**
     * 上一页页码
     */
    private Long prevPage;

    /**
     * 总条数
     */
    private Long totalCount;

    /**
     * 总页数
     */
    private Long totalPage;

    public List<DianDianShop> getDianDianShopList() {
        return this.dianDianShopList;
    }

    public void setDianDianShopList(List<DianDianShop> dianDianShopList) {
        this.dianDianShopList = dianDianShopList;
    }

    public Long getNextPage() {
        return this.nextPage;
    }

    public void setNextPage(Long nextPage) {
        this.nextPage = nextPage;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
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
