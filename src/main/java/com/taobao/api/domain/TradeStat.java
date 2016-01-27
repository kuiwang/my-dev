package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 订单全链路中的订单状态统计
 *
 * @author auto create
 * @since 1.0, null
 */
public class TradeStat extends TaobaoObject {

    private static final long serialVersionUID = 8349372573936153616L;

    /**
     * 数量
     */
    @ApiField("count")
    private Long count;

    /**
     * 状态名称
     */
    @ApiField("status")
    private String status;

    public Long getCount() {
        return this.count;
    }

    public String getStatus() {
        return this.status;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
