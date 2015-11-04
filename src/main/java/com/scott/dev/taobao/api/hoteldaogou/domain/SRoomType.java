package com.scott.dev.taobao.api.hoteldaogou.domain;

import java.util.Date;

/**
 * 酒店的标准房型信息
 */
public class SRoomType {

    /**
     * 面积
     */
    private String area;

    /**
     * 床型。json格式：[{"bedType":"大床","bedSize":"1.5m"},{"bedType":"双床",
     * "bedSize":"1.2m"}]
     */
    private String bed;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 扩展字段
     */
    private String extend;

    /**
     * facility
     */
    private String facility;

    /**
     * 楼层
     */
    private String floor;

    /**
     * 宽带服务 "0","有线上网(免费), "1","有线上网(无)", "2","有线上网(收费)",
     * "3","有线上网(部分有且免费)", "4","有线上网(部分有且收费)"
     */
    private String internet;

    /**
     * 最大入住人数
     */
    private Long maxOccupancy;

    /**
     * 修改时间
     */
    private Date modifiedTime;

    /**
     * 房型名
     */
    private String name;

    /**
     * pic_url
     */
    private String picUrl;

    /**
     * shid
     */
    private Long shid;

    /**
     * 匹配的标准房型
     */
    private Long srid;

    /**
     * 状态。0:正常;-1:删除
     */
    private Long status;

    /**
     * 窗型，枚举类型 0, 无窗, 1, 有窗;
     */
    private String windowType;

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBed() {
        return this.bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public Date getCreatedTime() {
        return this.createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getExtend() {
        return this.extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getFacility() {
        return this.facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getFloor() {
        return this.floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getInternet() {
        return this.internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public Long getMaxOccupancy() {
        return this.maxOccupancy;
    }

    public void setMaxOccupancy(Long maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Long getShid() {
        return this.shid;
    }

    public void setShid(Long shid) {
        this.shid = shid;
    }

    public Long getSrid() {
        return this.srid;
    }

    public void setSrid(Long srid) {
        this.srid = srid;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getWindowType() {
        return this.windowType;
    }

    public void setWindowType(String windowType) {
        this.windowType = windowType;
    }

}
