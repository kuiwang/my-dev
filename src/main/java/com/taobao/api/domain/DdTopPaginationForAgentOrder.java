package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 代送商订单展示模型
 *
 * @author auto create
 * @since 1.0, null
 */
public class DdTopPaginationForAgentOrder extends TaobaoObject {

    private static final long serialVersionUID = 3465746986255849529L;

    /**
     * 代送商订单列表
     */
    @ApiListField("list")
    @ApiField("top_delivery_agent_order_v_o")
    private List<TopDeliveryAgentOrderVO> list;

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

    public List<TopDeliveryAgentOrderVO> getList() {
        return this.list;
    }

    public void setList(List<TopDeliveryAgentOrderVO> list) {
        this.list = list;
    }

    public Long getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Long pageNum) {
        this.pageNum = pageNum;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getViewCount() {
        return this.viewCount;
    }

    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
    }

}
