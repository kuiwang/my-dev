package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 酒店搜索返回的酒店对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class SearchHotelObject extends TaobaoObject {

    private static final long serialVersionUID = 5676792645334765282L;

    /**
     * 酒店地址
     */
    @ApiField("address")
    private String address;

    /**
     * 酒店距离搜索中心点的距离，单位：米。注意：在设置了搜索中心点的情况下，才会计算出有效的距离；如果没有设置搜索中心点，
     * 则distance的值置为-1。
     */
    @ApiField("distance")
    private Long distance;

    /**
     * H5的detail页面的URL
     */
    @ApiField("h5_detail_url")
    private String h5DetailUrl;

    /**
     * 酒店detail页面的url
     */
    @ApiField("hotel_detail_url")
    private String hotelDetailUrl;

    /**
     * 纬度
     */
    @ApiField("lat")
    private String lat;

    /**
     * 星级/档次
     */
    @ApiField("level")
    private NameValuePair level;

    /**
     * 纬度
     */
    @ApiField("lng")
    private String lng;

    /**
     * 酒店名称
     */
    @ApiField("name")
    private String name;

    /**
     * 图片url，多张图片使用","隔开
     */
    @ApiField("pic_urls")
    private String picUrls;

    /**
     * 酒店价格，注意：单位为分。如果price的值为-1，则表示此酒店下无可售的报价。
     */
    @ApiField("price")
    private Long price;

    /**
     * 评论数
     */
    @ApiField("rate_number")
    private Long rateNumber;

    /**
     * 评分
     */
    @ApiField("rate_score")
    private String rateScore;

    /**
     * 销量
     */
    @ApiField("sell")
    private Long sell;

    /**
     * 服务设施
     */
    @ApiListField("services")
    @ApiField("name_value_pair")
    private List<NameValuePair> services;

    /**
     * 标准酒店ID
     */
    @ApiField("shid")
    private Long shid;

    /**
     * 电话，包括三种类型： 1.固定电话，例如：0086-010-85322688 2.移动电话，例如：13869696363
     * 3.400或800电话，例如：0086-4006123928
     */
    @ApiField("tel")
    private String tel;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getDistance() {
        return this.distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public String getH5DetailUrl() {
        return this.h5DetailUrl;
    }

    public void setH5DetailUrl(String h5DetailUrl) {
        this.h5DetailUrl = h5DetailUrl;
    }

    public String getHotelDetailUrl() {
        return this.hotelDetailUrl;
    }

    public void setHotelDetailUrl(String hotelDetailUrl) {
        this.hotelDetailUrl = hotelDetailUrl;
    }

    public String getLat() {
        return this.lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public NameValuePair getLevel() {
        return this.level;
    }

    public void setLevel(NameValuePair level) {
        this.level = level;
    }

    public String getLng() {
        return this.lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicUrls() {
        return this.picUrls;
    }

    public void setPicUrls(String picUrls) {
        this.picUrls = picUrls;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getRateNumber() {
        return this.rateNumber;
    }

    public void setRateNumber(Long rateNumber) {
        this.rateNumber = rateNumber;
    }

    public String getRateScore() {
        return this.rateScore;
    }

    public void setRateScore(String rateScore) {
        this.rateScore = rateScore;
    }

    public Long getSell() {
        return this.sell;
    }

    public void setSell(Long sell) {
        this.sell = sell;
    }

    public List<NameValuePair> getServices() {
        return this.services;
    }

    public void setServices(List<NameValuePair> services) {
        this.services = services;
    }

    public Long getShid() {
        return this.shid;
    }

    public void setShid(Long shid) {
        this.shid = shid;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}
