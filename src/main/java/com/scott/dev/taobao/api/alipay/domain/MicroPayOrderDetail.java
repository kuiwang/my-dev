package com.scott.dev.taobao.api.alipay.domain;

import java.util.Date;

/**
 * 小额支付冻结订单详情
 */
public class MicroPayOrderDetail {

    /**
     * 支付宝订单号，此订单号作为后续支付冻结金以及转账的订单标识
     */
    private String alipayOrderNo;

    /**
     * 支付方的支付宝userId
     */
    private String alipayUserId;

    /**
     * 可用于支付的金额（除去服务费）
     */
    private String availableAmount;

    /**
     * 订单创建时间
     */
    private Date createTime;

    /**
     * 冻结资金的到期自动解冻时间
     */
    private Date expireTime;

    /**
     * 冻结金额（不包含服务费）
     */
    private String freezeAmount;

    /**
     * 备注
     */
    private String memo;

    /**
     * 商户订单号,这个是调用传入的
     */
    private String merchantOrderNo;

    /**
     * 订单的最近修改时间
     */
    private Date modifiedTime;

    /**
     * 订单状态：I：初始，S：成功
     */
    private String orderStatus;

    /**
     * 支付的金额（含服务费）
     */
    private String payAmount;

    /**
     * 冻结资金支付确认方式， NO_CONFIRM：不需要付款确认，调用接口直接扣款 PAY_PASSWORD:
     * 在转账需要付款方用支付密码确认，才可以转账成功
     */
    private String payConfirm;

    public String getAlipayOrderNo() {
        return this.alipayOrderNo;
    }

    public void setAlipayOrderNo(String alipayOrderNo) {
        this.alipayOrderNo = alipayOrderNo;
    }

    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public void setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
    }

    public String getAvailableAmount() {
        return this.availableAmount;
    }

    public void setAvailableAmount(String availableAmount) {
        this.availableAmount = availableAmount;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String getFreezeAmount() {
        return this.freezeAmount;
    }

    public void setFreezeAmount(String freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMerchantOrderNo() {
        return this.merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPayAmount() {
        return this.payAmount;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }

    public String getPayConfirm() {
        return this.payConfirm;
    }

    public void setPayConfirm(String payConfirm) {
        this.payConfirm = payConfirm;
    }

}
