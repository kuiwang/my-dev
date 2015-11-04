package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 会员信息对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class CrmMember extends TaobaoObject {

    private static final long serialVersionUID = 5628493963365953796L;

    /**
     * 平均客单价.
     */
    @ApiField("avg_price")
    private String avgPrice;

    /**
     * 会员买家id
     */
    @ApiField("buyer_id")
    private Long buyerId;

    /**
     * 买家昵称
     */
    @ApiField("buyer_nick")
    private String buyerNick;

    /**
     * 城市. 请注意:从2014.4.23之后,省市将采用地区标准码,请通过物流API
     * taobao.areas.get接口获取,参考:http
     * ://api.taobao.com/apidoc/api.htm?spm=0.0.0
     * .0.nOOF9g&path=cid:7-apiId:59.API对于老的省市代码兼容会逐步下线.
     */
    @ApiField("city")
    private String city;

    /**
     * 交易关闭的金额
     */
    @ApiField("close_trade_amount")
    private String closeTradeAmount;

    /**
     * 交易关闭的的笔数
     */
    @ApiField("close_trade_count")
    private Long closeTradeCount;

    /**
     * 会员等级，0:店铺客户，1：普通会员，2：高级会员，3：VIP会员， 4：至尊VIP会员
     */
    @ApiField("grade")
    private Long grade;

    /**
     * 会员拥有的所有分组
     */
    @ApiField("group_ids")
    private String groupIds;

    /**
     * 交易关闭的宝贝件数
     */
    @ApiField("item_close_count")
    private Long itemCloseCount;

    /**
     * 购买的宝贝件数
     */
    @ApiField("item_num")
    private Long itemNum;

    /**
     * 最后交易时间
     */
    @ApiField("last_trade_time")
    private Date lastTradeTime;

    /**
     * 北京=1,天津=2,河北省=3,山西省=4,内蒙古自治区=5,辽宁省=6,吉林省=7,黑龙江省=8,上海=9,江苏省=10,浙江省=11
     * ,安徽省=12,福建省=13,江西省=14,山东省=15,河南省=16,湖北省=17,湖南省=18,
     * 广东省=19,广西壮族自治区=20,
     * 海南省=21,重庆=22,四川省=23,贵州省=24,云南省=25,西藏自治区26,陕西省=27,甘肃省
     * =28,青海省=29,宁夏回族自治区
     * =30,新疆维吾尔自治区=31,台湾省=32,香港特别行政区=33,澳门特别行政区=34,海外=35.
     * 注:请注意:从2014.4.23之后,省市将采用地区标准码,请通过物流API
     * taobao.areas.get接口获取,参考:http:/
     * /api.taobao.com/apidoc/api.htm?spm=0.0.0
     * .0.nOOF9g&path=cid:7-apiId:59.API对于老的省市代码兼容会逐步下线.
     */
    @ApiField("province")
    private Long province;

    /**
     * 关系来源，1交易成功，2未成交，3卖家主动吸纳
     */
    @ApiField("relation_source")
    private Long relationSource;

    /**
     * 显示会员的状态，normal正常，blacklist黑名单
     */
    @ApiField("status")
    private String status;

    /**
     * 交易成功的金额
     */
    @ApiField("trade_amount")
    private String tradeAmount;

    /**
     * 交易成功笔数
     */
    @ApiField("trade_count")
    private Long tradeCount;

    public String getAvgPrice() {
        return this.avgPrice;
    }

    public void setAvgPrice(String avgPrice) {
        this.avgPrice = avgPrice;
    }

    public Long getBuyerId() {
        return this.buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCloseTradeAmount() {
        return this.closeTradeAmount;
    }

    public void setCloseTradeAmount(String closeTradeAmount) {
        this.closeTradeAmount = closeTradeAmount;
    }

    public Long getCloseTradeCount() {
        return this.closeTradeCount;
    }

    public void setCloseTradeCount(Long closeTradeCount) {
        this.closeTradeCount = closeTradeCount;
    }

    public Long getGrade() {
        return this.grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public String getGroupIds() {
        return this.groupIds;
    }

    public void setGroupIds(String groupIds) {
        this.groupIds = groupIds;
    }

    public Long getItemCloseCount() {
        return this.itemCloseCount;
    }

    public void setItemCloseCount(Long itemCloseCount) {
        this.itemCloseCount = itemCloseCount;
    }

    public Long getItemNum() {
        return this.itemNum;
    }

    public void setItemNum(Long itemNum) {
        this.itemNum = itemNum;
    }

    public Date getLastTradeTime() {
        return this.lastTradeTime;
    }

    public void setLastTradeTime(Date lastTradeTime) {
        this.lastTradeTime = lastTradeTime;
    }

    public Long getProvince() {
        return this.province;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    public Long getRelationSource() {
        return this.relationSource;
    }

    public void setRelationSource(Long relationSource) {
        this.relationSource = relationSource;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTradeAmount() {
        return this.tradeAmount;
    }

    public void setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public Long getTradeCount() {
        return this.tradeCount;
    }

    public void setTradeCount(Long tradeCount) {
        this.tradeCount = tradeCount;
    }

}
