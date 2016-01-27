package com.scott.dev.taobao.api.diandiangd.domain;

/**
 * 淘点点店铺信息
 */
public class DianDianShop {

    /**
     * 店铺地址
     */
    private String address;

    /**
     * 别名
     */
    private String byname;

    /**
     * 城市
     */
    private String city;

    /**
     * 配送费
     */
    private String deliveryAmount;

    /**
     * 配送范围坐标
     */
    private String deliveryRange;

    /**
     * 营业时间（配送时间）
     */
    private String deliveryTime;

    /**
     * 菜品列表的h5页面
     */
    private String detailItemUrl;

    /**
     * 区域
     */
    private String district;

    /**
     * 是否减免，无：0，减：1
     */
    private String jian;

    /**
     * 维度
     */
    private String lat;

    /**
     * 店铺logo
     */
    private String logoUrl;

    /**
     * 经度
     */
    private String lon;

    /**
     * 起送金额
     */
    private String minimumAmount;

    /**
     * 多级配送属性
     */
    private String multiAreaRange;

    /**
     * 店铺名称
     */
    private String name;

    /**
     * 0:歇业，1:营业
     */
    private String status;

    /**
     * 店铺id
     */
    private String storeId;

    /**
     * 店铺子名称
     */
    private String subname;

    /**
     * 电话
     */
    private String tel;

    public String getAddress() {
        return this.address;
    }

    public String getByname() {
        return this.byname;
    }

    public String getCity() {
        return this.city;
    }

    public String getDeliveryAmount() {
        return this.deliveryAmount;
    }

    public String getDeliveryRange() {
        return this.deliveryRange;
    }

    public String getDeliveryTime() {
        return this.deliveryTime;
    }

    public String getDetailItemUrl() {
        return this.detailItemUrl;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getJian() {
        return this.jian;
    }

    public String getLat() {
        return this.lat;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public String getLon() {
        return this.lon;
    }

    public String getMinimumAmount() {
        return this.minimumAmount;
    }

    public String getMultiAreaRange() {
        return this.multiAreaRange;
    }

    public String getName() {
        return this.name;
    }

    public String getStatus() {
        return this.status;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public String getSubname() {
        return this.subname;
    }

    public String getTel() {
        return this.tel;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setByname(String byname) {
        this.byname = byname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDeliveryAmount(String deliveryAmount) {
        this.deliveryAmount = deliveryAmount;
    }

    public void setDeliveryRange(String deliveryRange) {
        this.deliveryRange = deliveryRange;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public void setDetailItemUrl(String detailItemUrl) {
        this.detailItemUrl = detailItemUrl;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setJian(String jian) {
        this.jian = jian;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public void setMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public void setMultiAreaRange(String multiAreaRange) {
        this.multiAreaRange = multiAreaRange;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}
