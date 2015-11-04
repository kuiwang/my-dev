package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 返回结果
 *
 * @author auto create
 * @since 1.0, null
 */
public class XItem extends TaobaoObject {

    private static final long serialVersionUID = 6627517355155285925L;

    /**
     * 商品叶子类目
     */
    @ApiField("cid")
    private Long cid;

    /**
     * 是否淘客商品
     */
    @ApiField("istk")
    private Boolean istk;

    /**
     * 位置信息
     */
    @ApiField("location")
    private XLocation location;

    /**
     * 是否天猫宝贝. true 是, false 不是
     */
    @ApiField("mall")
    private Boolean mall;

    /**
     * 店铺名称
     */
    @ApiField("nick")
    private String nick;

    /**
     * 库存数量
     */
    @ApiField("num")
    private Long num;

    /**
     * 混淆的商品ID
     */
    @ApiField("open_auction_iid")
    private String openAuctionIid;

    /**
     * 商品ID.. 请使用 open_auction_iid 作为商品id请求商品详情, 这个字段将废弃掉
     */
    @ApiField("open_id")
    private Long openId;

    /**
     * 主图链接
     */
    @ApiField("pic_url")
    private String picUrl;

    /**
     * 平邮邮费. 单位:元,精确到分
     */
    @ApiField("post_fee")
    private String postFee;

    /**
     * 商品优惠价格(PC端),可能为空.
     * 单位:元,精确到分。当PC端访问,且当前时间落在price_start_time到price_end_time区间内时使用该价格
     */
    @ApiField("price")
    private String price;

    /**
     * PC端商品优惠价格开始时间。如果当前没有PC端优惠，该字段为空
     */
    @ApiField("price_end_time")
    private String priceEndTime;

    /**
     * PC端商品优惠价格结束时间。如果当前没有PC端优惠，该字段为空
     */
    @ApiField("price_start_time")
    private String priceStartTime;

    /**
     * 手机端商品优惠价格. 可能为空。单位:元,精确到分。
     * 当手机端访问且当前时间落在price_wap_start_time到price_wap_end_time之间的话
     * ，使用该价格。如果改价格为空，请使用reserve_price.
     */
    @ApiField("price_wap")
    private String priceWap;

    /**
     * 手机端商品优惠价格结束时间。如果当前没有手机端优惠，该字段为空
     */
    @ApiField("price_wap_end_time")
    private String priceWapEndTime;

    /**
     * 手机端商品优惠价格开始时间。如果当前没有手机端优惠，该字段为空
     */
    @ApiField("price_wap_start_time")
    private String priceWapStartTime;

    /**
     * 消保类型，多个类型以,分割。可取以下值： 2：假一赔三；4：7天无理由退换货；
     */
    @ApiField("promoted_service")
    private String promotedService;

    /**
     * 商品的一口价
     */
    @ApiField("reserve_price")
    private String reservePrice;

    /**
     * 商品标题
     */
    @ApiField("title")
    private String title;

    /**
     * 淘客佣金比例
     */
    @ApiField("tk_rate")
    private String tkRate;

    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Boolean getIstk() {
        return this.istk;
    }

    public void setIstk(Boolean istk) {
        this.istk = istk;
    }

    public XLocation getLocation() {
        return this.location;
    }

    public void setLocation(XLocation location) {
        this.location = location;
    }

    public Boolean getMall() {
        return this.mall;
    }

    public void setMall(Boolean mall) {
        this.mall = mall;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Long getNum() {
        return this.num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getOpenAuctionIid() {
        return this.openAuctionIid;
    }

    public void setOpenAuctionIid(String openAuctionIid) {
        this.openAuctionIid = openAuctionIid;
    }

    public Long getOpenId() {
        return this.openId;
    }

    public void setOpenId(Long openId) {
        this.openId = openId;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPostFee() {
        return this.postFee;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPriceEndTime() {
        return this.priceEndTime;
    }

    public void setPriceEndTime(String priceEndTime) {
        this.priceEndTime = priceEndTime;
    }

    public String getPriceStartTime() {
        return this.priceStartTime;
    }

    public void setPriceStartTime(String priceStartTime) {
        this.priceStartTime = priceStartTime;
    }

    public String getPriceWap() {
        return this.priceWap;
    }

    public void setPriceWap(String priceWap) {
        this.priceWap = priceWap;
    }

    public String getPriceWapEndTime() {
        return this.priceWapEndTime;
    }

    public void setPriceWapEndTime(String priceWapEndTime) {
        this.priceWapEndTime = priceWapEndTime;
    }

    public String getPriceWapStartTime() {
        return this.priceWapStartTime;
    }

    public void setPriceWapStartTime(String priceWapStartTime) {
        this.priceWapStartTime = priceWapStartTime;
    }

    public String getPromotedService() {
        return this.promotedService;
    }

    public void setPromotedService(String promotedService) {
        this.promotedService = promotedService;
    }

    public String getReservePrice() {
        return this.reservePrice;
    }

    public void setReservePrice(String reservePrice) {
        this.reservePrice = reservePrice;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTkRate() {
        return this.tkRate;
    }

    public void setTkRate(String tkRate) {
        this.tkRate = tkRate;
    }

}
