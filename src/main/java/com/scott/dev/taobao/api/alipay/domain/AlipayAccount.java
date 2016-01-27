package com.scott.dev.taobao.api.alipay.domain;

/**
 * 支付宝用户账户信息
 */
public class AlipayAccount {

    /**
     * 支付宝用户ID
     */
    private String alipayUserId;

    /**
     * 可用余额
     */
    private String availableAmount;

    /**
     * 不可用余额
     */
    private String freezeAmount;

    /**
     * 余额总额
     */
    private String totalAmount;

    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public String getAvailableAmount() {
        return this.availableAmount;
    }

    public String getFreezeAmount() {
        return this.freezeAmount;
    }

    public String getTotalAmount() {
        return this.totalAmount;
    }

    public void setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
    }

    public void setAvailableAmount(String availableAmount) {
        this.availableAmount = availableAmount;
    }

    public void setFreezeAmount(String freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

}
