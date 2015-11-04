package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 代理商订单搜索接口返回数据对象【订单优化】
 *
 * @author auto create
 * @since 1.0, null
 */
public class SearchOrderResult extends TaobaoObject {

    private static final long serialVersionUID = 2191266395678859488L;

    /**
     * 是否还有下一页，即满足搜索条件的订单数是否还有下一个分页
     */
    @ApiField("has_next")
    private Boolean hasNext;

    /**
     * 淘宝机票订单列表
     */
    @ApiListField("order_ids")
    @ApiField("number")
    private List<Long> orderIds;

    /**
     * 当前淘宝系统设定的搜索结果页大小，即支持一次最多返回订单条数
     */
    @ApiField("page_size")
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
