package com.scott.dev.taobao.api.alipay.domain;

/**
 * 支付宝用户冻结明细信息
 */
public class AccountFreeze {

    /**
     * 冻结金额
     */
    private String freezeAmount;

    /**
     * 冻结类型名称
     */
    private String freezeName;

    /**
     * 冻结类型值
     */
    private String freezeType;

    public String getFreezeAmount() {
        return this.freezeAmount;
    }

    public void setFreezeAmount(String freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    public String getFreezeName() {
        return this.freezeName;
    }

    public void setFreezeName(String freezeName) {
        this.freezeName = freezeName;
    }

    public String getFreezeType() {
        return this.freezeType;
    }

    public void setFreezeType(String freezeType) {
        this.freezeType = freezeType;
    }

}
