package com.scott.dev.taobao.api.hoteldaogou.domain;

import java.util.List;

/**
 * 标准酒店信息
 */
public class SHotelInfoObject {

    /**
     * 酒店地址
     */
    private String address;

    /**
     * 酒店品牌
     */
    private String brand;

    /**
     * 市的code
     */
    private Long city;

    /**
     * 酒店装修时间
     */
    private String decorateTime;

    /**
     * 酒店描述
     */
    private String description;

    /**
     * 地区的值
     */
    private Long district;

    /**
     * H5的detail页面的URL
     */
    private String h5DetailUrl;

    /**
     * 酒店设施
     */
    private String hotelFacilities;

    /**
     * 纬度
     */
    private String lat;

    /**
     * 纬度
     */
    private String lng;

    /**
     * 酒店名称
     */
    private String name;

    /**
     * 酒店开业时间
     */
    private String openingTime;

    /**
     * 酒店detail页面的url
     */
    private String pcDetailUrl;

    /**
     * 图片url，多张图片使用","隔开
     */
    private String picUrls;

    /**
     * 省的code
     */
    private Long province;

    /**
     * 评论数
     */
    private Long rateNumber;

    /**
     * 评分
     */
    private String rateScore;

    /**
     * 房型信息
     */
    private List<SRoomType> rooms;

    /**
     * 服务设施
     */
    private String services;

    /**
     * 标准酒店ID
     */
    private Long shid;

    /**
     * 酒店星级，1-5星，0是客栈
     */
    private String star;

    /**
     * 酒店状态,0,营业中；-1，筹建中；-2，暂停营业；-3，已停业；
     */
    private Long status;

    /**
     * 电话，包括三种类型： 1.固定电话，例如：0086-010-85322688 2.移动电话，例如：13869696363
     * 3.400或800电话，例如：0086-4006123928
     */
    private String tel;

    /**
     * 酒店类型
     */
    private String type;

    public String getAddress() {
        return this.address;
    }

    public String getBrand() {
        return this.brand;
    }

    public Long getCity() {
        return this.city;
    }

    public String getDecorateTime() {
        return this.decorateTime;
    }

    public String getDescription() {
        return this.description;
    }

    public Long getDistrict() {
        return this.district;
    }

    public String getH5DetailUrl() {
        return this.h5DetailUrl;
    }

    public String getHotelFacilities() {
        return this.hotelFacilities;
    }

    public String getLat() {
        return this.lat;
    }

    public String getLng() {
        return this.lng;
    }

    public String getName() {
        return this.name;
    }

    public String getOpeningTime() {
        return this.openingTime;
    }

    public String getPcDetailUrl() {
        return this.pcDetailUrl;
    }

    public String getPicUrls() {
        return this.picUrls;
    }

    public Long getProvince() {
        return this.province;
    }

    public Long getRateNumber() {
        return this.rateNumber;
    }

    public String getRateScore() {
        return this.rateScore;
    }

    public List<SRoomType> getRooms() {
        return this.rooms;
    }

    public String getServices() {
        return this.services;
    }

    public Long getShid() {
        return this.shid;
    }

    public String getStar() {
        return this.star;
    }

    public Long getStatus() {
        return this.status;
    }

    public String getTel() {
        return this.tel;
    }

    public String getType() {
        return this.type;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCity(Long city) {
        this.city = city;
    }

    public void setDecorateTime(String decorateTime) {
        this.decorateTime = decorateTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDistrict(Long district) {
        this.district = district;
    }

    public void setH5DetailUrl(String h5DetailUrl) {
        this.h5DetailUrl = h5DetailUrl;
    }

    public void setHotelFacilities(String hotelFacilities) {
        this.hotelFacilities = hotelFacilities;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public void setPcDetailUrl(String pcDetailUrl) {
        this.pcDetailUrl = pcDetailUrl;
    }

    public void setPicUrls(String picUrls) {
        this.picUrls = picUrls;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    public void setRateNumber(Long rateNumber) {
        this.rateNumber = rateNumber;
    }

    public void setRateScore(String rateScore) {
        this.rateScore = rateScore;
    }

    public void setRooms(List<SRoomType> rooms) {
        this.rooms = rooms;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public void setShid(Long shid) {
        this.shid = shid;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setType(String type) {
        this.type = type;
    }

}
