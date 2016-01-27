package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 爱淘宝商品
 *
 * @author auto create
 * @since 1.0, null
 */
public class AitaobaoItem extends TaobaoObject {

    private static final long serialVersionUID = 6788981422566758293L;

    /**
     * 推广点击url
     */
    @ApiField("click_url")
    private String clickUrl;

    /**
     * 淘宝客佣金
     */
    @ApiField("commission")
    private String commission;

    /**
     * 累计成交量.注：返回的数据是30天内累计推广量
     */
    @ApiField("commission_num")
    private String commissionNum;

    /**
     * 淘宝客佣金比率，比如：1234.00代表12.34%
     */
    @ApiField("commission_rate")
    private String commissionRate;

    /**
     * 累计总支出佣金量
     */
    @ApiField("commission_volume")
    private String commissionVolume;

    /**
     * 折扣活动结束时间
     */
    @ApiField("coupon_end_time")
    private String couponEndTime;

    /**
     * 折扣价格
     */
    @ApiField("coupon_price")
    private String couponPrice;

    /**
     * 折扣比率
     */
    @ApiField("coupon_rate")
    private String couponRate;

    /**
     * 折扣活动开始时间
     */
    @ApiField("coupon_start_time")
    private String couponStartTime;

    /**
     * 商品所在地
     */
    @ApiField("item_location")
    private String itemLocation;

    /**
     * 卖家昵称
     */
    @ApiField("nick")
    private String nick;

    /**
     * 淘宝客商品数字id
     */
    @ApiField("num_iid")
    private Long numIid;

    /**
     * 开放商品id
     */
    @ApiField("open_iid")
    private String openIid;

    /**
     * 图片url
     */
    @ApiField("pic_url")
    private String picUrl;

    /**
     * 商品价格
     */
    @ApiField("price")
    private String price;

    /**
     * 促销价格
     */
    @ApiField("promotion_price")
    private String promotionPrice;

    /**
     * 卖家信用等级
     */
    @ApiField("seller_credit_score")
    private Long sellerCreditScore;

    /**
     * 卖家id
     */
    @ApiField("seller_id")
    private Long sellerId;

    /**
     * 店铺类型:B(商城),C(集市)
     */
    @ApiField("shop_type")
    private String shopType;

    /**
     * 商品title 宝贝名称
     */
    @ApiField("title")
    private String title;

    /**
     * 30天内交易量
     */
    @ApiField("volume")
    private Long volume;

    public String getClickUrl() {
        return this.clickUrl;
    }

    public String getCommission() {
        return this.commission;
    }

    public String getCommissionNum() {
        return this.commissionNum;
    }

    public String getCommissionRate() {
        return this.commissionRate;
    }

    public String getCommissionVolume() {
        return this.commissionVolume;
    }

    public String getCouponEndTime() {
        return this.couponEndTime;
    }

    public String getCouponPrice() {
        return this.couponPrice;
    }

    public String getCouponRate() {
        return this.couponRate;
    }

    public String getCouponStartTime() {
        return this.couponStartTime;
    }

    public String getItemLocation() {
        return this.itemLocation;
    }

    public String getNick() {
        return this.nick;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public String getOpenIid() {
        return this.openIid;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public String getPrice() {
        return this.price;
    }

    public String getPromotionPrice() {
        return this.promotionPrice;
    }

    public Long getSellerCreditScore() {
        return this.sellerCreditScore;
    }

    public Long getSellerId() {
        return this.sellerId;
    }

    public String getShopType() {
        return this.shopType;
    }

    public String getTitle() {
        return this.title;
    }

    public Long getVolume() {
        return this.volume;
    }

    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public void setCommissionNum(String commissionNum) {
        this.commissionNum = commissionNum;
    }

    public void setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setCommissionVolume(String commissionVolume) {
        this.commissionVolume = commissionVolume;
    }

    public void setCouponEndTime(String couponEndTime) {
        this.couponEndTime = couponEndTime;
    }

    public void setCouponPrice(String couponPrice) {
        this.couponPrice = couponPrice;
    }

    public void setCouponRate(String couponRate) {
        this.couponRate = couponRate;
    }

    public void setCouponStartTime(String couponStartTime) {
        this.couponStartTime = couponStartTime;
    }

    public void setItemLocation(String itemLocation) {
        this.itemLocation = itemLocation;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public void setOpenIid(String openIid) {
        this.openIid = openIid;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPromotionPrice(String promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public void setSellerCreditScore(Long sellerCreditScore) {
        this.sellerCreditScore = sellerCreditScore;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

}
