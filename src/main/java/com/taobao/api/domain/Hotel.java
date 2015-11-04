package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * Hotel（酒店）结构。各字段详细说明可参考接口定义，如：酒店发布接口。
 *
 * @author auto create
 * @since 1.0, null
 */
public class Hotel extends TaobaoObject {

    private static final long serialVersionUID = 8338194372536281134L;

    /**
     * 酒店地址
     */
    @ApiField("address")
    private String address;

    /**
     * 某个卖家发布的酒店的别名(注：该字段将要废弃)
     */
    @ApiField("alias_name")
    private String aliasName;

    /**
     * 酒店审核被否决的原因
     */
    @ApiField("audit_deny_reason")
    private String auditDenyReason;

    /**
     * 城市编码
     */
    @ApiField("city")
    private Long city;

    /**
     * 城市中文名称
     */
    @ApiField("city_str")
    private String cityStr;

    /**
     * 国家编码
     */
    @ApiField("country")
    private String country;

    /**
     * 国家中文名称
     */
    @ApiField("country_str")
    private String countryStr;

    /**
     * 创建时间
     */
    @ApiField("created")
    private Date created;

    /**
     * 装修时间
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
     * 区域中文名称
     */
    @ApiField("district_str")
    private String districtStr;

    /**
     * 酒店id
     */
    @ApiField("hid")
    private Long hid;

    /**
     * 酒店级别
     */
    @ApiField("level")
    private String level;

    /**
     * 修改时间
     */
    @ApiField("modified")
    private Date modified;

    /**
     * 酒店名称
     */
    @ApiField("name")
    private String name;

    /**
     * 开业时间
     */
    @ApiField("opening_time")
    private String openingTime;

    /**
     * 酒店定位
     */
    @ApiField("orientation")
    private String orientation;

    /**
     * 酒店图片url
     */
    @ApiField("pic_url")
    private String picUrl;

    /**
     * 省份编码
     */
    @ApiField("province")
    private Long province;

    /**
     * 省份中文名称
     */
    @ApiField("province_str")
    private String provinceStr;

    /**
     * 房型列表
     */
    @ApiListField("room_types")
    @ApiField("room_type")
    private List<RoomType> roomTypes;

    /**
     * 房间数
     */
    @ApiField("rooms")
    private Long rooms;

    /**
     * 交通距离与设施服务。JSON格式串。
     */
    @ApiField("service")
    private String service;

    /**
     * 状态。0：待审核，1：正常（审核通过），2：审核否决，3：停售
     */
    @ApiField("status")
    private Long status;

    /**
     * 楼层数
     */
    @ApiField("storeys")
    private Long storeys;

    /**
     * 酒店电话
     */
    @ApiField("tel")
    private String tel;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAliasName() {
        return this.aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getAuditDenyReason() {
        return this.auditDenyReason;
    }

    public void setAuditDenyReason(String auditDenyReason) {
        this.auditDenyReason = auditDenyReason;
    }

    public Long getCity() {
        return this.city;
    }

    public void setCity(Long city) {
        this.city = city;
    }

    public String getCityStr() {
        return this.cityStr;
    }

    public void setCityStr(String cityStr) {
        this.cityStr = cityStr;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryStr() {
        return this.countryStr;
    }

    public void setCountryStr(String countryStr) {
        this.countryStr = countryStr;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDecorateTime() {
        return this.decorateTime;
    }

    public void setDecorateTime(String decorateTime) {
        this.decorateTime = decorateTime;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Long getDistrict() {
        return this.district;
    }

    public void setDistrict(Long district) {
        this.district = district;
    }

    public String getDistrictStr() {
        return this.districtStr;
    }

    public void setDistrictStr(String districtStr) {
        this.districtStr = districtStr;
    }

    public Long getHid() {
        return this.hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpeningTime() {
        return this.openingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public String getOrientation() {
        return this.orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Long getProvince() {
        return this.province;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    public String getProvinceStr() {
        return this.provinceStr;
    }

    public void setProvinceStr(String provinceStr) {
        this.provinceStr = provinceStr;
    }

    public List<RoomType> getRoomTypes() {
        return this.roomTypes;
    }

    public void setRoomTypes(List<RoomType> roomTypes) {
        this.roomTypes = roomTypes;
    }

    public Long getRooms() {
        return this.rooms;
    }

    public void setRooms(Long rooms) {
        this.rooms = rooms;
    }

    public String getService() {
        return this.service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStoreys() {
        return this.storeys;
    }

    public void setStoreys(Long storeys) {
        this.storeys = storeys;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}
