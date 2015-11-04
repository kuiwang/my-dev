package com.scott.dev.taobao.api.billing.domain;

import java.util.Date;

/**
 * 账单结构
 */
public class Bill {

    /**
     * 科目编号
     */
    private Long accountId;

    /**
     * 支付宝账户编号
     */
    private String alipayId;

    /**
     * 支付宝账户名称
     */
    private String alipayMail;

    /**
     * 支付宝交易号,暂不提供
     */
    private String alipayNo;

    /**
     * 支付宝备注
     */
    private String alipayNotice;

    /**
     * 支付宝商户订单号
     */
    private String alipayOutno;

    /**
     * 账单金额,退款时返回的是负数
     */
    private Long amount;

    /**
     * 账单编号
     */
    private Long bid;

    /**
     * 业务时间,订单交易完成的时间
     */
    private Date bizTime;

    /**
     * 记账时间
     */
    private Date bookTime;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private String gmtModified;

    /**
     * 所属商品编号
     */
    private String numIid;

    /**
     * 目标支付宝账户编号
     */
    private String objAlipayId;

    /**
     * 目标支付宝账户名称
     */
    private String objAlipayMail;

    /**
     * 交易子订单编号
     */
    private String orderId;

    /**
     * 支付时间,收取佣金时支付宝的扣款时间
     */
    private Date payTime;

    /**
     * 0-未支付,1-支付成功,2-支付失败
     */
    private Long status;

    /**
     * 交易金额
     */
    private Long totalAmount;

    /**
     * 交易订单编号
     */
    private String tradeId;

    public Long getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAlipayId() {
        return this.alipayId;
    }

    public void setAlipayId(String alipayId) {
        this.alipayId = alipayId;
    }

    public String getAlipayMail() {
        return this.alipayMail;
    }

    public void setAlipayMail(String alipayMail) {
        this.alipayMail = alipayMail;
    }

    public String getAlipayNo() {
        return this.alipayNo;
    }

    public void setAlipayNo(String alipayNo) {
        this.alipayNo = alipayNo;
    }

    public String getAlipayNotice() {
        return this.alipayNotice;
    }

    public void setAlipayNotice(String alipayNotice) {
        this.alipayNotice = alipayNotice;
    }

    public String getAlipayOutno() {
        return this.alipayOutno;
    }

    public void setAlipayOutno(String alipayOutno) {
        this.alipayOutno = alipayOutno;
    }

    public Long getAmount() {
        return this.amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getBid() {
        return this.bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public Date getBizTime() {
        return this.bizTime;
    }

    public void setBizTime(Date bizTime) {
        this.bizTime = bizTime;
    }

    public Date getBookTime() {
        return this.bookTime;
    }

    public void setBookTime(Date bookTime) {
        this.bookTime = bookTime;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getGmtModified() {
        return this.gmtModified;
    }

    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getNumIid() {
        return this.numIid;
    }

    public void setNumIid(String numIid) {
        this.numIid = numIid;
    }

    public String getObjAlipayId() {
        return this.objAlipayId;
    }

    public void setObjAlipayId(String objAlipayId) {
        this.objAlipayId = objAlipayId;
    }

    public String getObjAlipayMail() {
        return this.objAlipayMail;
    }

    public void setObjAlipayMail(String objAlipayMail) {
        this.objAlipayMail = objAlipayMail;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getPayTime() {
        return this.payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTradeId() {
        return this.tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

}
