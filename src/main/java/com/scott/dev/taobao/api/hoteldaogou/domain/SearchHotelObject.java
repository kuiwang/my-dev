package com.scott.dev.taobao.api.hoteldaogou.domain;

import java.util.List;

/**
 * 酒店搜索返回的酒店对象
 */
public class SearchHotelObject {

    /**
     * 酒店地址
     */
    private String address;

    /**
     * 酒店距离搜索中心点的距离，单位：米。注意：在设置了搜索中心点的情况下，才会计算出有效的距离；如果没有设置搜索中心点，
     * 则distance的值置为-1。
     */
    private Long distance;

    /**
     * H5的detail页面的URL
     */
    private String h5DetailUrl;

    /**
     * 酒店detail页面的url
     */
    private String hotelDetailUrl;

    /**
     * 纬度
     */
    private String lat;

    /**
     * 星级/档次
     */
    private NameValuePair level;

    /**
     * 纬度
     */
    private String lng;

    /**
     * 酒店名称
     */
    private String name;

    /**
     * 图片url，多张图片使用","隔开
     */
    private String picUrls;

    /**
     * 酒店价格，注意：单位为分。如果price的值为-1，则表示此酒店下无可售的报价。
     */
    private Long price;

    /**
     * 评论数
     */
    private Long rateNumber;

    /**
     * 评分
     */
    private String rateScore;

    /**
     * 销量
     */
    private Long sell;

    /**
     * 服务设施
     */
    private List<NameValuePair> services;

    /**
     * 标准酒店ID
     */
    private Long shid;

    /**
     * 电话，包括三种类型： 1.固定电话，例如：0086-010-85322688 2.移动电话，例如：13869696363
     * 3.400或800电话，例如：0086-4006123928
     */
    private String tel;

    public String getAddress() {
        return this.address;
    }

    public Long getDistance() {
        return this.distance;
    }

    public String getH5DetailUrl() {
        return this.h5DetailUrl;
    }

    public String getHotelDetailUrl() {
        return this.hotelDetailUrl;
    }

    public String getLat() {
        return this.lat;
    }

    public NameValuePair getLevel() {
        return this.level;
    }

    public String getLng() {
        return this.lng;
    }

    public String getName() {
        return this.name;
    }

    public String getPicUrls() {
        return this.picUrls;
    }

    public Long getPrice() {
        return this.price;
    }

    public Long getRateNumber() {
        return this.rateNumber;
    }

    public String getRateScore() {
        return this.rateScore;
    }

    public Long getSell() {
        return this.sell;
    }

    public List<NameValuePair> getServices() {
        return this.services;
    }

    public Long getShid() {
        return this.shid;
    }

    public String getTel() {
        return this.tel;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public void setH5DetailUrl(String h5DetailUrl) {
        this.h5DetailUrl = h5DetailUrl;
    }

    public void setHotelDetailUrl(String hotelDetailUrl) {
        this.hotelDetailUrl = hotelDetailUrl;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLevel(NameValuePair level) {
        this.level = level;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPicUrls(String picUrls) {
        this.picUrls = picUrls;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setRateNumber(Long rateNumber) {
        this.rateNumber = rateNumber;
    }

    public void setRateScore(String rateScore) {
        this.rateScore = rateScore;
    }

    public void setSell(Long sell) {
        this.sell = sell;
    }

    public void setServices(List<NameValuePair> services) {
        this.services = services;
    }

    public void setShid(Long shid) {
        this.shid = shid;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}
