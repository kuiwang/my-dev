package com.scott.dev.taobao.api.memmanage.domain;

import java.util.Date;

import com.scott.dev.taobao.api.Price;

//会员信息对象
public class CrmMember {

    //平均客单价.
    private Price avgPrice;

    //会员买家id
    private Number buyerId;

    //买家昵称
    private String buyerNick;

    /*
     * 城市. 请注意:从2014.4.23之后,省市将采用地区标准码,
     * 请通过物流API taobao.areas.get接口获取,
     * 参考:http://api.taobao.com/apidoc/api.htm?spm=0.0.0.0.nOOF9g&path=cid:7-apiId:59.API对于老的省市代码兼容会逐步下线.
     */
    private String city;

    //交易关闭的金额
    private Price closeTradeAmount;

    //交易关闭的的笔数
    private Number closeTradeCount;

    //会员等级，0:店铺客户，1：普通会员，2：高级会员，3：VIP会员， 4：至尊VIP会员
    private Number grade;

    //会员拥有的所有分组
    private String groupIds;

    //交易关闭的宝贝件数
    private Number itemCloseCount;

    //购买的宝贝件数
    private Number itemNum;

    //最后交易时间
    private Date lastTradeTime;

    /*
     * 北京=1,天津=2,河北省=3,山西省=4,内蒙古自治区=5,辽宁省=6,吉林省=7,
     * 黑龙江省=8,上海=9,江苏省=10,浙江省=11,安徽省=12,福建省=13,江西省=14,
     * 山东省=15,河南省=16,湖北省=17,湖南省=18, 广东省=19,广西壮族自治区=20,
     * 海南省=21,重庆=22,四川省=23,贵州省=24,云南省=25,西藏自治区26,陕西省=27,
     * 甘肃省=28,青海省=29,宁夏回族自治区=30,新疆维吾尔自治区=31,台湾省=32,
     * 香港特别行政区=33,澳门特别行政区=34,海外=35. 
     * 注:请注意:从2014.4.23之后,省市将采用地区标准码,
     * 请通过物流API taobao.areas.get接口获取,
     * 参考:http://api.taobao.com/apidoc/api.htm?spm=0.0.0.0.nOOF9g&path=cid:7-apiId:59.API对于老的省市代码兼容会逐步下线.
     */
    private Number province;

    //关系来源，1交易成功，2未成交，3卖家主动吸纳
    private Number relationSource;

    //显示会员的状态，normal正常，blacklist黑名单
    private String status;

    //交易成功的金额
    private Price tradeAmount;

    //交易成功笔数
    private Number tradeCount;

    public Price getAvgPrice() {
        return avgPrice;
    }

    public Number getBuyerId() {
        return buyerId;
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public String getCity() {
        return city;
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

    public Number getItemCloseCount() {
        return itemCloseCount;
    }

    public Number getItemNum() {
        return itemNum;
    }

    public Date getLastTradeTime() {
        return lastTradeTime;
    }

    public Number getProvince() {
        return province;
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

    public void setAvgPrice(Price avgPrice) {
        this.avgPrice = avgPrice;
    }

    public void setBuyerId(Number buyerId) {
        this.buyerId = buyerId;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public void setCity(String city) {
        this.city = city;
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

    public void setItemCloseCount(Number itemCloseCount) {
        this.itemCloseCount = itemCloseCount;
    }

    public void setItemNum(Number itemNum) {
        this.itemNum = itemNum;
    }

    public void setLastTradeTime(Date lastTradeTime) {
        this.lastTradeTime = lastTradeTime;
    }

    public void setProvince(Number province) {
        this.province = province;
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
