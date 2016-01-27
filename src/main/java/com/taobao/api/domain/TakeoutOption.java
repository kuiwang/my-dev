package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 外卖店铺信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class TakeoutOption extends TaobaoObject {

    private static final long serialVersionUID = 3164219174128249173L;

    /**
     * 配送范围地图坐标
     */
    @ApiField("area_range")
    private String areaRange;

    /**
     * 支持货到付款:1，不支持货到付款：0
     */
    @ApiField("cash_on_delivery")
    private Long cashOnDelivery;

    /**
     * 主营类目id
     */
    @ApiField("cateid")
    private Long cateid;

    /**
     * 配送费
     */
    @ApiField("delivery_amount")
    private String deliveryAmount;

    /**
     * 配送时间
     */
    @ApiField("delivery_time")
    private String deliveryTime;

    /**
     * 配送预留时间
     */
    @ApiField("early_minutes")
    private Long earlyMinutes;

    /**
     * 满多少免运费
     */
    @ApiField("full_amount")
    private String fullAmount;

    /**
     * 起送金额
     */
    @ApiField("minimum_amount")
    private String minimumAmount;

    /**
     * 外卖店手机号码
     */
    @ApiField("mobile")
    private String mobile;

    /**
     * 外卖店铺id
     */
    @ApiField("shopid")
    private Long shopid;

    /**
     * 外卖店铺名称
     */
    @ApiField("shop_name")
    private String shopName;

    /**
     * 预定，当天：1，三天内：3，七天内：7
     */
    @ApiField("support_days")
    private Long supportDays;

    public String getAreaRange() {
        return this.areaRange;
    }

    public Long getCashOnDelivery() {
        return this.cashOnDelivery;
    }

    public Long getCateid() {
        return this.cateid;
    }

    public String getDeliveryAmount() {
        return this.deliveryAmount;
    }

    public String getDeliveryTime() {
        return this.deliveryTime;
    }

    public Long getEarlyMinutes() {
        return this.earlyMinutes;
    }

    public String getFullAmount() {
        return this.fullAmount;
    }

    public String getMinimumAmount() {
        return this.minimumAmount;
    }

    public String getMobile() {
        return this.mobile;
    }

    public Long getShopid() {
        return this.shopid;
    }

    public String getShopName() {
        return this.shopName;
    }

    public Long getSupportDays() {
        return this.supportDays;
    }

    public void setAreaRange(String areaRange) {
        this.areaRange = areaRange;
    }

    public void setCashOnDelivery(Long cashOnDelivery) {
        this.cashOnDelivery = cashOnDelivery;
    }

    public void setCateid(Long cateid) {
        this.cateid = cateid;
    }

    public void setDeliveryAmount(String deliveryAmount) {
        this.deliveryAmount = deliveryAmount;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public void setEarlyMinutes(Long earlyMinutes) {
        this.earlyMinutes = earlyMinutes;
    }

    public void setFullAmount(String fullAmount) {
        this.fullAmount = fullAmount;
    }

    public void setMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setShopid(Long shopid) {
        this.shopid = shopid;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setSupportDays(Long supportDays) {
        this.supportDays = supportDays;
    }

}
