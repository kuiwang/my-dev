package com.scott.dev.taobao.api.fenxiao.domain;

import java.util.Date;

import com.scott.dev.taobao.api.Price;

/*
 * 采购单子单退款详情
 */
public class RefundDetail {

    /*
     * 子单id
     */
    private Number subOrderId;

    /*
     * 是否退货
     */
    private Boolean isReturnGoods;

    /*
     * 退款创建时间
     */
    private Date refundCreateTime;

    /*
     * 退款状态 1：买家已经申请退款，等待卖家同意 2：卖家已经同意退款，等待买家退货
     * 3：买家已经退货，等待卖家确认收货 4：退款关闭 5：退款成功 6：卖家拒绝退款 
     * 12：同意退款，待打款 9：没有申请退款 10：卖家拒绝确认收货
     */
    private Number refundStatus;

    /*
     * 退款的金额
     */
    private Price refundFee;

    /*
     * 支付给供应商的金额
     */
    private Price paySupFee;

    /*
     * 退款原因
     */
    private String refundReason;

    /*
     * 退款说明
     */
    private String refundDesc;

    /*
     * 下游买家的退款信息
     */
    private BuyerRefund buyerRefund;

    /*
     * 供应商nick
     */
    private String supplierNick;

    /*
     * 分销商nick
     */
    private String distributorNick;

    /*
     * 退款修改时间。格式:yyyy-MM-dd HH:mm:ss
     */
    private Date modified;

    /*
     * 主采购单id
     */
    private Number purchaseOrderId;

    /*
     * 退款流程类型： 4：发货前退款； 1：发货后退款不退货； 2：发货后退款退货
     */
    private Number refundFlowType;

    /*
     * 超时时间
     */
    private Date timeout;

    /*
     * 超时类型： 1：供应商同意退款/同意退货超时； 2：供应商确认收货超时
     */
    private Number toType;

    public Number getSubOrderId() {
        return subOrderId;
    }

    public void setSubOrderId(Number subOrderId) {
        this.subOrderId = subOrderId;
    }

    public Boolean getIsReturnGoods() {
        return isReturnGoods;
    }

    public void setIsReturnGoods(Boolean isReturnGoods) {
        this.isReturnGoods = isReturnGoods;
    }

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

    public Price getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(Price refundFee) {
        this.refundFee = refundFee;
    }

    public Price getPaySupFee() {
        return paySupFee;
    }

    public void setPaySupFee(Price paySupFee) {
        this.paySupFee = paySupFee;
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

    public BuyerRefund getBuyerRefund() {
        return buyerRefund;
    }

    public void setBuyerRefund(BuyerRefund buyerRefund) {
        this.buyerRefund = buyerRefund;
    }

    public String getSupplierNick() {
        return supplierNick;
    }

    public void setSupplierNick(String supplierNick) {
        this.supplierNick = supplierNick;
    }

    public String getDistributorNick() {
        return distributorNick;
    }

    public void setDistributorNick(String distributorNick) {
        this.distributorNick = distributorNick;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Number getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(Number purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public Number getRefundFlowType() {
        return refundFlowType;
    }

    public void setRefundFlowType(Number refundFlowType) {
        this.refundFlowType = refundFlowType;
    }

    public Date getTimeout() {
        return timeout;
    }

    public void setTimeout(Date timeout) {
        this.timeout = timeout;
    }

    public Number getToType() {
        return toType;
    }

    public void setToType(Number toType) {
        this.toType = toType;
    }
}
