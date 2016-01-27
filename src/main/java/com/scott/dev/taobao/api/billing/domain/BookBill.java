package com.scott.dev.taobao.api.billing.domain;

import java.util.Date;

/**
 * 虚拟账户账单结构
 */
public class BookBill {

    /**
     * 虚拟账户科目编号
     */
    private Long accountId;

    /**
     * 操作金额
     */
    private Long amount;

    /**
     * 虚拟账户流水编号
     */
    private Long bid;

    /**
     * 记账时间
     */
    private Date bookTime;

    /**
     * 备注
     */
    private String description;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 流水类型:101-可用金充值;102-可用金扣除;103-冻结;104-解冻;105-冻结金充值;106-冻结金扣除
     */
    private Long journalType;

    /**
     * 流水的商家支付宝id
     */
    private String otherAlipayId;

    /**
     * 流水的淘宝支付宝id
     */
    private String taobaoAlipayId;

    public Long getAccountId() {
        return this.accountId;
    }

    public Long getAmount() {
        return this.amount;
    }

    public Long getBid() {
        return this.bid;
    }

    public Date getBookTime() {
        return this.bookTime;
    }

    public String getDescription() {
        return this.description;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public Long getJournalType() {
        return this.journalType;
    }

    public String getOtherAlipayId() {
        return this.otherAlipayId;
    }

    public String getTaobaoAlipayId() {
        return this.taobaoAlipayId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public void setBookTime(Date bookTime) {
        this.bookTime = bookTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setJournalType(Long journalType) {
        this.journalType = journalType;
    }

    public void setOtherAlipayId(String otherAlipayId) {
        this.otherAlipayId = otherAlipayId;
    }

    public void setTaobaoAlipayId(String taobaoAlipayId) {
        this.taobaoAlipayId = taobaoAlipayId;
    }

}
