package com.scott.dev.taobao.api.trade.domain;

import com.scott.dev.taobao.api.Price;

/*
 * 确认收货费用结构
 */
public class TradeConfirmFee {

    /*
     * 确认收货的金额(不包含邮费)。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    private Price confirmFee;

    /*
     * 需确认收货的邮费，当不是最后一笔收货或者没有邮费时是0.00。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    private Price confirmPostFee;

    /*
     * 是否是最后一笔订单（只对子订单有效，当其他子订单都是交易完成时，返回true，否则false）
     */
    private Boolean isLastOrder;

    public Price getConfirmFee() {
        return confirmFee;
    }

    public Price getConfirmPostFee() {
        return confirmPostFee;
    }

    public Boolean getIsLastOrder() {
        return isLastOrder;
    }

    public void setConfirmFee(Price confirmFee) {
        this.confirmFee = confirmFee;
    }

    public void setConfirmPostFee(Price confirmPostFee) {
        this.confirmPostFee = confirmPostFee;
    }

    public void setIsLastOrder(Boolean isLastOrder) {
        this.isLastOrder = isLastOrder;
    }
}
