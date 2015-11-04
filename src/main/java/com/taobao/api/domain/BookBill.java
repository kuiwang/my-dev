package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 虚拟账户账单结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class BookBill extends TaobaoObject {

    private static final long serialVersionUID = 6829984834862249292L;

    /**
     * 虚拟账户科目编号
     */
    @ApiField("account_id")
    private Long accountId;

    /**
     * 操作金额
     */
    @ApiField("amount")
    private Long amount;

    /**
     * 虚拟账户流水编号
     */
    @ApiField("bid")
    private Long bid;

    /**
     * 记账时间
     */
    @ApiField("book_time")
    private Date bookTime;

    /**
     * 备注
     */
    @ApiField("description")
    private String description;

    /**
     * 创建时间
     */
    @ApiField("gmt_create")
    private Date gmtCreate;

    /**
     * 流水类型:101-可用金充值;102-可用金扣除;103-冻结;104-解冻;105-冻结金充值;106-冻结金扣除
     */
    @ApiField("journal_type")
    private Long journalType;

    /**
     * 流水的商家支付宝id
     */
    @ApiField("other_alipay_id")
    private String otherAlipayId;

    /**
     * 流水的淘宝支付宝id
     */
    @ApiField("taobao_alipay_id")
    private String taobaoAlipayId;

    public Long getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
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

    public Date getBookTime() {
        return this.bookTime;
    }

    public void setBookTime(Date bookTime) {
        this.bookTime = bookTime;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getJournalType() {
        return this.journalType;
    }

    public void setJournalType(Long journalType) {
        this.journalType = journalType;
    }

    public String getOtherAlipayId() {
        return this.otherAlipayId;
    }

    public void setOtherAlipayId(String otherAlipayId) {
        this.otherAlipayId = otherAlipayId;
    }

    public String getTaobaoAlipayId() {
        return this.taobaoAlipayId;
    }

    public void setTaobaoAlipayId(String taobaoAlipayId) {
        this.taobaoAlipayId = taobaoAlipayId;
    }

}
