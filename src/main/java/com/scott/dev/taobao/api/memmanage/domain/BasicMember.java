package com.scott.dev.taobao.api.memmanage.domain;

import java.util.Date;

import com.scott.dev.taobao.api.Price;

//表示会员关系的基本信息字段，用于会员列表的基本查询
public class BasicMember {

    //最后一次交易的订单号. 注:该字段从2014.4.23之后不再返回.
    private Number bizOrderId;

    //买家会员ID
    private Number buyerId;

    //会员昵称
    private String buyerNick;

    //交易关闭金额
    private Price closeTradeAmount;

    //交易关闭的笔数
    private Number closeTradeCount;

    //会员等级，0：店铺客户，1：普通会员，2：高级会员，3：VIP会员， 4：至尊VIP会员
    private Number grade;

    //分组的id集合字符串
    private String groupIds;

    //购买的宝贝件数
    private Number itemNum;

    //最后交易的日期
    private Date lastTradeTime;

    //关系来源，1交易成功，2未交易成功 ,3 卖家主动吸纳
    private Number relationSource;

    //显示会员的状态，normal正常，blacklist黑名单
    private String status;

    //交易的金额
    private Price tradeAmount;

    //交易成功的次数
    private Number tradeCount;

    public Number getBizOrderId() {
        return bizOrderId;
    }

    public Number getBuyerId() {
        return buyerId;
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public Price getCloseTradeAmount() {
        return closeTradeAmount;
    }

    public Number getCloseTradeCount() {
        return closeTradeCount;
    }

    public Number getGrade() {
        return grade;
    }

    public String getGroupIds() {
        return groupIds;
    }

    public Number getItemNum() {
        return itemNum;
    }

    public Date getLastTradeTime() {
        return lastTradeTime;
    }

    public Number getRelationSource() {
        return relationSource;
    }

    public String getStatus() {
        return status;
    }

    public Price getTradeAmount() {
        return tradeAmount;
    }

    public Number getTradeCount() {
        return tradeCount;
    }

    public void setBizOrderId(Number bizOrderId) {
        this.bizOrderId = bizOrderId;
    }

    public void setBuyerId(Number buyerId) {
        this.buyerId = buyerId;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public void setCloseTradeAmount(Price closeTradeAmount) {
        this.closeTradeAmount = closeTradeAmount;
    }

    public void setCloseTradeCount(Number closeTradeCount) {
        this.closeTradeCount = closeTradeCount;
    }

    public void setGrade(Number grade) {
        this.grade = grade;
    }

    public void setGroupIds(String groupIds) {
        this.groupIds = groupIds;
    }

    public void setItemNum(Number itemNum) {
        this.itemNum = itemNum;
    }

    public void setLastTradeTime(Date lastTradeTime) {
        this.lastTradeTime = lastTradeTime;
    }

    public void setRelationSource(Number relationSource) {
        this.relationSource = relationSource;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTradeAmount(Price tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public void setTradeCount(Number tradeCount) {
        this.tradeCount = tradeCount;
    }

}
