package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 支付宝交易记录明细
 *
 * @author auto create
 * @since 1.0, null
 */
public class AlipayRecord extends TaobaoObject {

    private static final long serialVersionUID = 5737941814229914865L;

    /**
     * 支付宝订单号
     */
    @ApiField("alipay_order_no")
    private String alipayOrderNo;

    /**
     * 当时支付宝账户余额
     */
    @ApiField("balance")
    private String balance;

    /**
     * 子业务类型
     */
    @ApiField("business_type")
    private String businessType;

    /**
     * 创建时间
     */
    @ApiField("create_time")
    private String createTime;

    /**
     * 收入金额
     */
    @ApiField("in_amount")
    private String inAmount;

    /**
     * 账号备注
     */
    @ApiField("memo")
    private String memo;

    /**
     * 支付宝订单号
     */
    @ApiField("merchant_order_no")
    private String merchantOrderNo;

    /**
     * 对方的支付宝ID
     */
    @ApiField("opt_user_id")
    private String optUserId;

    /**
     * 支出金额
     */
    @ApiField("out_amount")
    private String outAmount;

    /**
     * 自己的支付宝ID
     */
    @ApiField("self_user_id")
    private String selfUserId;

    /**
     * 账务类型
     */
    @ApiField("type")
    private String type;

    public String getAlipayOrderNo() {
        return this.alipayOrderNo;
    }

    public String getBalance() {
        return this.balance;
    }

    public String getBusinessType() {
        return this.businessType;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getInAmount() {
        return this.inAmount;
    }

    public String getMemo() {
        return this.memo;
    }

    public String getMerchantOrderNo() {
        return this.merchantOrderNo;
    }

    public String getOptUserId() {
        return this.optUserId;
    }

    public String getOutAmount() {
        return this.outAmount;
    }

    public String getSelfUserId() {
        return this.selfUserId;
    }

    public String getType() {
        return this.type;
    }

    public void setAlipayOrderNo(String alipayOrderNo) {
        this.alipayOrderNo = alipayOrderNo;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setInAmount(String inAmount) {
        this.inAmount = inAmount;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public void setOptUserId(String optUserId) {
        this.optUserId = optUserId;
    }

    public void setOutAmount(String outAmount) {
        this.outAmount = outAmount;
    }

    public void setSelfUserId(String selfUserId) {
        this.selfUserId = selfUserId;
    }

    public void setType(String type) {
        this.type = type;
    }

}
