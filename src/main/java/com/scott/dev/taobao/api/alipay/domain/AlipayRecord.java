package com.scott.dev.taobao.api.alipay.domain;

/**
 * 支付宝交易记录明细
 */
public class AlipayRecord {

    /**
     * 支付宝订单号
     */
    private String alipayOrderNo;

    /**
     * 当时支付宝账户余额
     */
    private String balance;

    /**
     * 子业务类型
     */
    private String businessType;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 收入金额
     */
    private String inAmount;

    /**
     * 账号备注
     */
    private String memo;

    /**
     * 支付宝订单号
     */
    private String merchantOrderNo;

    /**
     * 对方的支付宝ID
     */
    private String optUserId;

    /**
     * 支出金额
     */
    private String outAmount;

    /**
     * 自己的支付宝ID
     */
    private String selfUserId;

    /**
     * 账务类型
     */
    private String type;

    public String getAlipayOrderNo() {
        return this.alipayOrderNo;
    }

    public void setAlipayOrderNo(String alipayOrderNo) {
        this.alipayOrderNo = alipayOrderNo;
    }

    public String getBalance() {
        return this.balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getBusinessType() {
        return this.businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getInAmount() {
        return this.inAmount;
    }

    public void setInAmount(String inAmount) {
        this.inAmount = inAmount;
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

    public String getOptUserId() {
        return this.optUserId;
    }

    public void setOptUserId(String optUserId) {
        this.optUserId = optUserId;
    }

    public String getOutAmount() {
        return this.outAmount;
    }

    public void setOutAmount(String outAmount) {
        this.outAmount = outAmount;
    }

    public String getSelfUserId() {
        return this.selfUserId;
    }

    public void setSelfUserId(String selfUserId) {
        this.selfUserId = selfUserId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
