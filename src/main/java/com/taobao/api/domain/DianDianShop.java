package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 淘点点店铺信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class DianDianShop extends TaobaoObject {

    private static final long serialVersionUID = 5139582833243198919L;

    /**
     * 店铺地址
     */
    @ApiField("address")
    private String address;

    /**
     * 别名
     */
    @ApiField("byname")
    private String byname;

    /**
     * 城市
     */
    @ApiField("city")
    private String city;

    /**
     * 配送费
     */
    @ApiField("delivery_amount")
    private String deliveryAmount;

    /**
     * 配送范围坐标
     */
    @ApiField("delivery_range")
    private String deliveryRange;

    /**
     * 营业时间（配送时间）
     */
    @ApiField("delivery_time")
    private String deliveryTime;

    /**
     * 菜品列表的h5页面
     */
    @ApiField("detail_item_url")
    private String detailItemUrl;

    /**
     * 区域
     */
    @ApiField("district")
    private String district;

    /**
     * 是否减免，无：0，减：1
     */
    @ApiField("jian")
    private String jian;

    /**
     * 维度
     */
    @ApiField("lat")
    private String lat;

    /**
     * 店铺logo
     */
    @ApiField("logo_url")
    private String logoUrl;

    /**
     * 经度
     */
    @ApiField("lon")
    private String lon;

    /**
     * 起送金额
     */
    @ApiField("minimum_amount")
    private String minimumAmount;

    /**
     * 多级配送属性
     */
    @ApiField("multi_area_range")
    private String multiAreaRange;

    /**
     * 店铺名称
     */
    @ApiField("name")
    private String name;

    /**
     * 0:歇业，1:营业
     */
    @ApiField("status")
    private String status;

    /**
     * 店铺id
     */
    @ApiField("store_id")
    private String storeId;

    /**
     * 店铺子名称
     */
    @ApiField("subname")
    private String subname;

    /**
     * 电话
     */
    @ApiField("tel")
    private String tel;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getByname() {
        return this.byname;
    }

    public void setByname(String byname) {
        this.byname = byname;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDeliveryAmount() {
        return this.deliveryAmount;
    }

    public void setDeliveryAmount(String deliveryAmount) {
        this.deliveryAmount = deliveryAmount;
    }

    public String getDeliveryRange() {
        return this.deliveryRange;
    }

    public void setDeliveryRange(String deliveryRange) {
        this.deliveryRange = deliveryRange;
    }

    public String getDeliveryTime() {
        return this.deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDetailItemUrl() {
        return this.detailItemUrl;
    }

    public void setDetailItemUrl(String detailItemUrl) {
        this.detailItemUrl = detailItemUrl;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getJian() {
        return this.jian;
    }

    public void setJian(String jian) {
        this.jian = jian;
    }

    public String getLat() {
        return this.lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getLon() {
        return this.lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getMinimumAmount() {
        return this.minimumAmount;
    }

    public void setMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public String getMultiAreaRange() {
        return this.multiAreaRange;
    }

    public void setMultiAreaRange(String multiAreaRange) {
        this.multiAreaRange = multiAreaRange;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getSubname() {
        return this.subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}
