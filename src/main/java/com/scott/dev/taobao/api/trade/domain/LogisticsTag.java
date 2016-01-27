package com.scott.dev.taobao.api.trade.domain;

/*
 * 物流的服务标签
 */
public class LogisticsTag {

    /*
     * 服务标签
     */
    private LogisticServiceTag[] logisticServiceTagList;

    /*
     * 主订单或子订单的订单号
     */
    private String orderId;

    public LogisticServiceTag[] getLogisticServiceTagList() {
        return logisticServiceTagList;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setLogisticServiceTagList(LogisticServiceTag[] logisticServiceTagList) {
        this.logisticServiceTagList = logisticServiceTagList;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
