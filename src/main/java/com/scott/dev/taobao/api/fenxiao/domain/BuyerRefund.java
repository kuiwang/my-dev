package com.scott.dev.taobao.api.fenxiao.domain;

import java.util.Date;

/*
 * 下游买家退款信息
 */
public class BuyerRefund {

    //订单id
    private Number bizOrderId;

    //下游买家nick
    private String buyerNick;

    //货物的状态： 买家已收到货 买家已退货 买家未收到货
    private String goodsStatusDesc;

    //退款修改时间。格式:yyyy-MM-dd HH:mm:ss
    private Date modified;

    //买家是否退货
    private Boolean needReturnGoods;

    //退款创建时间
    private Date refundCreateTime;

    //退款说明
    private String refundDesc;

    //交易退款id
    private Number refundId;

    //退款原因
    private String refundReason;

    //退款状态
    private Number refundStatus;

    //退还买家的金额
    private Number returnFee;

    //采购单子单id
    private Number subOrderId;

    //支付分销商的金额
    private Number toSellerFee;

    public Number getBizOrderId() {
        return bizOrderId;
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public String getGoodsStatusDesc() {
        return goodsStatusDesc;
    }

    public Date getModified() {
        return modified;
    }

    public Boolean getNeedReturnGoods() {
        return needReturnGoods;
    }

    public Date getRefundCreateTime() {
        return refundCreateTime;
    }

    public String getRefundDesc() {
        return refundDesc;
    }

    public Number getRefundId() {
        return refundId;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public Number getRefundStatus() {
        return refundStatus;
    }

    public Number getReturnFee() {
        return returnFee;
    }

    public Number getSubOrderId() {
        return subOrderId;
    }

    public Number getToSellerFee() {
        return toSellerFee;
    }

    public void setBizOrderId(Number bizOrderId) {
        this.bizOrderId = bizOrderId;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public void setGoodsStatusDesc(String goodsStatusDesc) {
        this.goodsStatusDesc = goodsStatusDesc;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setNeedReturnGoods(Boolean needReturnGoods) {
        this.needReturnGoods = needReturnGoods;
    }

    public void setRefundCreateTime(Date refundCreateTime) {
        this.refundCreateTime = refundCreateTime;
    }

    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc;
    }

    public void setRefundId(Number refundId) {
        this.refundId = refundId;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public void setRefundStatus(Number refundStatus) {
        this.refundStatus = refundStatus;
    }

    public void setReturnFee(Number returnFee) {
        this.returnFee = returnFee;
    }

    public void setSubOrderId(Number subOrderId) {
        this.subOrderId = subOrderId;
    }

    public void setToSellerFee(Number toSellerFee) {
        this.toSellerFee = toSellerFee;
    }
}
