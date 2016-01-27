package com.scott.dev.taobao.api.alipay.domain;

import java.util.Date;

/**
 * 支付宝交易明细
 */
public class TradeRecord {

    /**
     * 支付宝订单号
     */
    private String alipayOrderNo;

    /**
     * 订单创建时间
     */
    private Date createTime;

    /**
     * 资金流入流程类型,in表示收入,out表示支出
     */
    private String inOutType;

    /**
     * 商户订单号
     */
    private String merchantOrderNo;

    /**
     * 订单最后修改时间
     */
    private Date modifiedTime;

    /**
     * 对方支付宝登录号，需要隐藏
     */
    private String oppositeLogonId;

    /**
     * 对方姓名，需要隐藏
     */
    private String oppositeName;

    /**
     * 对方支付宝账号
     */
    private String oppositeUserId;

    /**
     * 订单来源，为空查询所有来源。淘宝(taobao)，支付宝(alipay)，其它(other)
     */
    private String orderFrom;

    /**
     * 订单状态
     */
    private String orderStatus;

    /**
     * 订单的名称，描述订单的摘要信息，如交易的商品名称
     */
    private String orderTitle;

    /**
     * 订单类型
     */
    private String orderType;

    /**
     * 本方支付宝登录号，需要隐藏
     */
    private String ownerLogonId;

    /**
     * 本方姓名，需要隐藏
     */
    private String ownerName;

    /**
     * 本方支付宝账号
     */
    private String ownerUserId;

    /**
     * 订单服务费
     */
    private String serviceCharge;

    /**
     * 订单总金额
     */
    private String totalAmount;

    public String getAlipayOrderNo() {
        return this.alipayOrderNo;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public String getInOutType() {
        return this.inOutType;
    }

    public String getMerchantOrderNo() {
        return this.merchantOrderNo;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public String getOppositeLogonId() {
        return this.oppositeLogonId;
    }

    public String getOppositeName() {
        return this.oppositeName;
    }

    public String getOppositeUserId() {
        return this.oppositeUserId;
    }

    public String getOrderFrom() {
        return this.orderFrom;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public String getOrderTitle() {
        return this.orderTitle;
    }

    public String getOrderType() {
        return this.orderType;
    }

    public String getOwnerLogonId() {
        return this.ownerLogonId;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    public String getServiceCharge() {
        return this.serviceCharge;
    }

    public String getTotalAmount() {
        return this.totalAmount;
    }

    public void setAlipayOrderNo(String alipayOrderNo) {
        this.alipayOrderNo = alipayOrderNo;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setInOutType(String inOutType) {
        this.inOutType = inOutType;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public void setOppositeLogonId(String oppositeLogonId) {
        this.oppositeLogonId = oppositeLogonId;
    }

    public void setOppositeName(String oppositeName) {
        this.oppositeName = oppositeName;
    }

    public void setOppositeUserId(String oppositeUserId) {
        this.oppositeUserId = oppositeUserId;
    }

    public void setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setOrderTitle(String orderTitle) {
        this.orderTitle = orderTitle;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setOwnerLogonId(String ownerLogonId) {
        this.ownerLogonId = ownerLogonId;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public void setServiceCharge(String serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

}
