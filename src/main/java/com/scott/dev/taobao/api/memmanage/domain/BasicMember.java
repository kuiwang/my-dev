package com.scott.dev.taobao.api.memmanage.domain;

import java.util.Date;

import com.scott.dev.taobao.api.Price;

//表示会员关系的基本信息字段，用于会员列表的基本查询
public class BasicMember {

    //会员昵称
    private String buyerNick;

    //显示会员的状态，normal正常，blacklist黑名单
    private String status;

    //会员等级，0：店铺客户，1：普通会员，2：高级会员，3：VIP会员， 4：至尊VIP会员
    private Number grade;

    //交易成功的次数
    private Number tradeCount;

    //交易的金额
    private Price tradeAmount;

    //最后交易的日期
    private Date lastTradeTime;

    //交易关闭的笔数
    private Number closeTradeCount;

    //交易关闭金额
    private Price closeTradeAmount;

    //购买的宝贝件数
    private Number itemNum;

    //分组的id集合字符串
    private String groupIds;

    //关系来源，1交易成功，2未交易成功 ,3 卖家主动吸纳
    private Number relationSource;

    //最后一次交易的订单号. 注:该字段从2014.4.23之后不再返回.
    private Number bizOrderId;

    //买家会员ID
    private Number buyerId;

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Number getGrade() {
        return grade;
    }

    public void setGrade(Number grade) {
        this.grade = grade;
    }

    public Number getTradeCount() {
        return tradeCount;
    }

    public void setTradeCount(Number tradeCount) {
        this.tradeCount = tradeCount;
    }

    public Price getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Price tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public Date getLastTradeTime() {
        return lastTradeTime;
    }

    public void setLastTradeTime(Date lastTradeTime) {
        this.lastTradeTime = lastTradeTime;
    }

    public Number getCloseTradeCount() {
        return closeTradeCount;
    }

    public void setCloseTradeCount(Number closeTradeCount) {
        this.closeTradeCount = closeTradeCount;
    }

    public Price getCloseTradeAmount() {
        return closeTradeAmount;
    }

    public void setCloseTradeAmount(Price closeTradeAmount) {
        this.closeTradeAmount = closeTradeAmount;
    }

    public Number getItemNum() {
        return itemNum;
    }

    public void setItemNum(Number itemNum) {
        this.itemNum = itemNum;
    }

    public String getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(String groupIds) {
        this.groupIds = groupIds;
    }

    public Number getRelationSource() {
        return relationSource;
    }

    public void setRelationSource(Number relationSource) {
        this.relationSource = relationSource;
    }

    public Number getBizOrderId() {
        return bizOrderId;
    }

    public void setBizOrderId(Number bizOrderId) {
        this.bizOrderId = bizOrderId;
    }

    public Number getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Number buyerId) {
        this.buyerId = buyerId;
    }

}
