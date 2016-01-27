package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 表示会员关系的基本信息字段，用于会员列表的基本查询
 *
 * @author auto create
 * @since 1.0, null
 */
public class BasicMember extends TaobaoObject {

    private static final long serialVersionUID = 2548234653726975296L;

    /**
     * 最后一次交易的订单号. 注:该字段从2014.4.23之后不再返回.
     */
    @ApiField("biz_order_id")
    private Long bizOrderId;

    /**
     * 买家会员ID
     */
    @ApiField("buyer_id")
    private Long buyerId;

    /**
     * 会员昵称
     */
    @ApiField("buyer_nick")
    private String buyerNick;

    /**
     * 交易关闭金额
     */
    @ApiField("close_trade_amount")
    private String closeTradeAmount;

    /**
     * 交易关闭的笔数
     */
    @ApiField("close_trade_count")
    private Long closeTradeCount;

    /**
     * 会员等级，0：店铺客户，1：普通会员，2：高级会员，3：VIP会员， 4：至尊VIP会员
     */
    @ApiField("grade")
    private Long grade;

    /**
     * 分组的id集合字符串
     */
    @ApiField("group_ids")
    private String groupIds;

    /**
     * 购买的宝贝件数
     */
    @ApiField("item_num")
    private Long itemNum;

    /**
     * 最后交易的日期
     */
    @ApiField("last_trade_time")
    private Date lastTradeTime;

    /**
     * 关系来源，1交易成功，2未交易成功 ,3 卖家主动吸纳
     */
    @ApiField("relation_source")
    private Long relationSource;

    /**
     * 显示会员的状态，normal正常，blacklist黑名单
     */
    @ApiField("status")
    private String status;

    /**
     * 交易的金额
     */
    @ApiField("trade_amount")
    private String tradeAmount;

    /**
     * 交易成功的次数
     */
    @ApiField("trade_count")
    private Long tradeCount;

    public Long getBizOrderId() {
        return this.bizOrderId;
    }

    public Long getBuyerId() {
        return this.buyerId;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public String getCloseTradeAmount() {
        return this.closeTradeAmount;
    }

    public Long getCloseTradeCount() {
        return this.closeTradeCount;
    }

    public Long getGrade() {
        return this.grade;
    }

    public String getGroupIds() {
        return this.groupIds;
    }

    public Long getItemNum() {
        return this.itemNum;
    }

    public Date getLastTradeTime() {
        return this.lastTradeTime;
    }

    public Long getRelationSource() {
        return this.relationSource;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTradeAmount() {
        return this.tradeAmount;
    }

    public Long getTradeCount() {
        return this.tradeCount;
    }

    public void setBizOrderId(Long bizOrderId) {
        this.bizOrderId = bizOrderId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public void setCloseTradeAmount(String closeTradeAmount) {
        this.closeTradeAmount = closeTradeAmount;
    }

    public void setCloseTradeCount(Long closeTradeCount) {
        this.closeTradeCount = closeTradeCount;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public void setGroupIds(String groupIds) {
        this.groupIds = groupIds;
    }

    public void setItemNum(Long itemNum) {
        this.itemNum = itemNum;
    }

    public void setLastTradeTime(Date lastTradeTime) {
        this.lastTradeTime = lastTradeTime;
    }

    public void setRelationSource(Long relationSource) {
        this.relationSource = relationSource;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public void setTradeCount(Long tradeCount) {
        this.tradeCount = tradeCount;
    }

}
