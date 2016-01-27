package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 确认收货费用结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class TradeConfirmFee extends TaobaoObject {

    private static final long serialVersionUID = 1779891777643974175L;

    /**
     * 确认收货的金额(不包含邮费)。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    @ApiField("confirm_fee")
    private String confirmFee;

    /**
     * 需确认收货的邮费，当不是最后一笔收货或者没有邮费时是0.00。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    @ApiField("confirm_post_fee")
    private String confirmPostFee;

    /**
     * 是否是最后一笔订单（只对子订单有效，当其他子订单都是交易完成时，返回true，否则false）
     */
    @ApiField("is_last_order")
    private Boolean isLastOrder;

    public String getConfirmFee() {
        return this.confirmFee;
    }

    public String getConfirmPostFee() {
        return this.confirmPostFee;
    }

    public Boolean getIsLastOrder() {
        return this.isLastOrder;
    }

    public void setConfirmFee(String confirmFee) {
        this.confirmFee = confirmFee;
    }

    public void setConfirmPostFee(String confirmPostFee) {
        this.confirmPostFee = confirmPostFee;
    }

    public void setIsLastOrder(Boolean isLastOrder) {
        this.isLastOrder = isLastOrder;
    }

}
