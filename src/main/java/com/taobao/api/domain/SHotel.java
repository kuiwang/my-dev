package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 酒店的标准酒店信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class SHotel extends TaobaoObject {

    private static final long serialVersionUID = 6134921747937915975L;

    /**
     * 酒店地址
     */
    @ApiField("address")
    private String address;

    /**
     * brand
     */
    @ApiField("brand")
    private String brand;

    /**
     * business
     */
    @ApiField("business")
    private String business;

    /**
     * 城市编码
     */
    @ApiField("city")
    private Long city;

    /**
     * 地区标签
     */
    @ApiField("city_tag")
    private String cityTag;

    /**
     * 国家编码
     */
    @ApiField("country")
    private String country;

    /**
     * 创建时间
     */
    @ApiField("created_time")
    private Date createdTime;

    /**
     * 装修年份
     */
    @ApiField("decorate_time")
    private String decorateTime;

    /**
     * 酒店介绍
     */
    @ApiField("desc")
    private String desc;

    /**
     * 区域编码
     */
    @ApiField("district")
    private Long district;

    /**
     * 0:国内;1:国外
     */
    @ApiField("domestic")
    private Long domestic;

    /**
     * 扩展信息的JSON
     */
    @ApiField("extend")
    private String extend;

    /**
     * 传真
     */
    @ApiField("fax")
    private String fax;

    /**
     * 酒店设施
     */
    @ApiField("hotel_facilities")
    private String hotelFacilities;

    /**
     * latitude
     */
    @ApiField("latitude")
    private String latitude;

    /**
     * 酒店级别
     */
    @ApiField("level")
    private String level;

    /**
     * longitude
     */
    @ApiField("longitude")
    private String longitude;

    /**
     * 修改时间
     */
    @ApiField("modified_time")
    private Date modifiedTime;

    /**
     * name
     */
    @ApiField("name")
    private String name;

    /**
     * 开业年份
     */
    @ApiField("opening_time")
    private String openingTime;

    /**
     * 酒店图片url
     */
    @ApiField("pic_url")
    private String picUrl;

    /**
     * position_type
     */
    @ApiField("position_type")
    private Long positionType;

    /**
     * 邮编
     */
    @ApiField("postal_code")
    private String postalCode;

    /**
     * 省份编码
     */
    @ApiField("province")
    private Long province;

    /**
     * 房间设施
     */
    @ApiField("room_facilities")
    private String roomFacilities;

    /**
     * 房间数
     */
    @ApiField("rooms")
    private Long rooms;

    /**
     * 交通距离与设施服务。JSON格式。
     */
    @ApiField("service")
    private String service;

    /**
     * 酒店ID
     */
    @ApiField("shid")
    private Long shid;

    /**
     * 状态: 0：待系统匹配 1：已系统匹配，匹配成功，待卖家确认 2：已系统匹配，匹配失败，待人工匹配 3：已人工匹配，匹配成功，待卖家确认
     * 4：已人工匹配，匹配失败 5：卖家已确认，确认“YES” 6：卖家已确认，确认“NO” 7：停售
     */
    @ApiField("status")
    private Long status;

    /**
     * 楼层数
     */
    @ApiField("storeys")
    private String storeys;

    /**
     * 酒店电话
     */
    @ApiField("tel")
    private String tel;

    /**
     * 酒店类型
     */
    @ApiField("type")
    private String type;

    /**
     * used_name
     */
    @ApiField("used_name")
    private String usedName;

    public String getAddress() {
        return this.address;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getBusiness() {
        return this.business;
    }

    public Long getCity() {
        return this.city;
    }

    public String getCityTag() {
        return this.cityTag;
    }

    public String getCountry() {
        return this.country;
    }

    public Date getCreatedTime() {
        return this.createdTime;
    }

    public String getDecorateTime() {
        return this.decorateTime;
    }

    public String getDesc() {
        return this.desc;
    }

    public Long getDistrict() {
        return this.district;
    }

    public Long getDomestic() {
        return this.domestic;
    }

    public String getExtend() {
        return this.extend;
    }

    public String getFax() {
        return this.fax;
    }

    public String getHotelFacilities() {
        return this.hotelFacilities;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLevel() {
        return this.level;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public String getName() {
        return this.name;
    }

    public String getOpeningTime() {
        return this.openingTime;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public Long getPositionType() {
        return this.positionType;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public Long getProvince() {
        return this.province;
    }

    public String getRoomFacilities() {
        return this.roomFacilities;
    }

    public Long getRooms() {
        return this.rooms;
    }

    public String getService() {
        return this.service;
    }

    public Long getShid() {
        return this.shid;
    }

    public Long getStatus() {
        return this.status;
    }

    public String getStoreys() {
        return this.storeys;
    }

    public String getTel() {
        return this.tel;
    }

    public String getType() {
        return this.type;
    }

    public String getUsedName() {
        return this.usedName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public void setCity(Long city) {
        this.city = city;
    }

    public void setCityTag(String cityTag) {
        this.cityTag = cityTag;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public void setDecorateTime(String decorateTime) {
        this.decorateTime = decorateTime;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setDistrict(Long district) {
        this.district = district;
    }

    public void setDomestic(Long domestic) {
        this.domestic = domestic;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setHotelFacilities(String hotelFacilities) {
        this.hotelFacilities = hotelFacilities;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public void setPositionType(Long positionType) {
        this.positionType = positionType;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    public void setRoomFacilities(String roomFacilities) {
        this.roomFacilities = roomFacilities;
    }

    public void setRooms(Long rooms) {
        this.rooms = rooms;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setShid(Long shid) {
        this.shid = shid;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public void setStoreys(String storeys) {
        this.storeys = storeys;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUsedName(String usedName) {
        this.usedName = usedName;
    }

}
