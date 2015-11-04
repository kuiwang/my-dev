package com.scott.dev.taobao.api.alipay.domain;

import java.util.Date;

/**
 * 小额支付单笔支付
 */
public class SinglePayDetail {

    /**
     * 支付宝冻结订单号
     */
    private String alipayOrderNo;

    /**
     * 本次支付金额
     */
    private String amount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最近修改时间
     */
    private Date modifiedTime;

    /**
     * 本次支付url地址
     */
    private String payUrl;

    /**
     * 收款人的userId
     */
    private String receiveUserId;

    /**
     * 本次支付的支付宝流水号
     */
    private String transferOrderNo;

    /**
     * 本次支付的外部单据号
     */
    private String transferOutOrderNo;

    public String getAlipayOrderNo() {
        return this.alipayOrderNo;
    }

    public void setAlipayOrderNo(String alipayOrderNo) {
        this.alipayOrderNo = alipayOrderNo;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getPayUrl() {
        return this.payUrl;
    }

    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }

    public String getReceiveUserId() {
        return this.receiveUserId;
    }

    public void setReceiveUserId(String receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    public String getTransferOrderNo() {
        return this.transferOrderNo;
    }

    public void setTransferOrderNo(String transferOrderNo) {
        this.transferOrderNo = transferOrderNo;
    }

    public String getTransferOutOrderNo() {
        return this.transferOutOrderNo;
    }

    public void setTransferOutOrderNo(String transferOutOrderNo) {
        this.transferOutOrderNo = transferOutOrderNo;
    }

}
