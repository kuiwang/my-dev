package com.scott.dev.taobao.api.fenxiao.domain;

import java.util.Date;

/*
 * 下游买家退款信息
 */
public class BuyerRefund {

    //退款创建时间
    private Date refundCreateTime;

    //退款状态
    private Number refundStatus;

    //货物的状态： 买家已收到货 买家已退货 买家未收到货
    private String goodsStatusDesc;

    //买家是否退货
    private Boolean needReturnGoods;

    //退还买家的金额
    private Number returnFee;

    //支付分销商的金额
    private Number toSellerFee;

    //退款原因
    private String refundReason;

    //退款说明
    private String refundDesc;

    //交易退款id
    private Number refundId;

    //采购单子单id
    private Number subOrderId;

    //订单id
    private Number bizOrderId;

    //下游买家nick
    private String buyerNick;

    //退款修改时间。格式:yyyy-MM-dd HH:mm:ss
    private Date modified;

    public Date getRefundCreateTime() {
        return refundCreateTime;
    }

    public void setRefundCreateTime(Date refundCreateTime) {
        this.refundCreateTime = refundCreateTime;
    }

    public Number getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Number refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getGoodsStatusDesc() {
        return goodsStatusDesc;
    }

    public void setGoodsStatusDesc(String goodsStatusDesc) {
        this.goodsStatusDesc = goodsStatusDesc;
    }

    public Boolean getNeedReturnGoods() {
        return needReturnGoods;
    }

    public void setNeedReturnGoods(Boolean needReturnGoods) {
        this.needReturnGoods = needReturnGoods;
    }

    public Number getReturnFee() {
        return returnFee;
    }

    public void setReturnFee(Number returnFee) {
        this.returnFee = returnFee;
    }

    public Number getToSellerFee() {
        return toSellerFee;
    }

    public void setToSellerFee(Number toSellerFee) {
        this.toSellerFee = toSellerFee;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getRefundDesc() {
        return refundDesc;
    }

    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc;
    }

    public Number getRefundId() {
        return refundId;
    }

    public void setRefundId(Number refundId) {
        this.refundId = refundId;
    }

    public Number getSubOrderId() {
        return subOrderId;
    }

    public void setSubOrderId(Number subOrderId) {
        this.subOrderId = subOrderId;
    }

    public Number getBizOrderId() {
        return bizOrderId;
    }

    public void setBizOrderId(Number bizOrderId) {
        this.bizOrderId = bizOrderId;
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}
