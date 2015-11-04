package com.scott.dev.taobao.api.airticket.domain;

import java.util.List;

/**
 * 代理商订单搜索接口返回数据对象【订单优化】
 */
public class SearchOrderResult {

    /**
     * 是否还有下一页，即满足搜索条件的订单数是否还有下一个分页
     */
    private Boolean hasNext;

    /**
     * 淘宝机票订单列表
     */
    private List<Long> orderIds;

    /**
     * 当前淘宝系统设定的搜索结果页大小，即支持一次最多返回订单条数
     */
    private Long pageSize;

    public Boolean getHasNext() {
        return this.hasNext;
    }

    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }

    public List<Long> getOrderIds() {
        return this.orderIds;
    }

    public void setOrderIds(List<Long> orderIds) {
        this.orderIds = orderIds;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

}
