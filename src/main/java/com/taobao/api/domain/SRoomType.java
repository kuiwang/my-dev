package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 酒店的标准房型信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class SRoomType extends TaobaoObject {

    private static final long serialVersionUID = 7222584579187423548L;

    /**
     * 面积
     */
    @ApiField("area")
    private String area;

    /**
     * 床型。json格式：[{"bedType":"大床","bedSize":"1.5m"},{"bedType":"双床",
     * "bedSize":"1.2m"}]
     */
    @ApiField("bed")
    private String bed;

    /**
     * 创建时间
     */
    @ApiField("created_time")
    private Date createdTime;

    /**
     * 扩展字段
     */
    @ApiField("extend")
    private String extend;

    /**
     * facility
     */
    @ApiField("facility")
    private String facility;

    /**
     * 楼层
     */
    @ApiField("floor")
    private String floor;

    /**
     * 宽带服务 "0","有线上网(免费), "1","有线上网(无)", "2","有线上网(收费)",
     * "3","有线上网(部分有且免费)", "4","有线上网(部分有且收费)"
     */
    @ApiField("internet")
    private String internet;

    /**
     * 最大入住人数
     */
    @ApiField("max_occupancy")
    private Long maxOccupancy;

    /**
     * 修改时间
     */
    @ApiField("modified_time")
    private Date modifiedTime;

    /**
     * 房型名
     */
    @ApiField("name")
    private String name;

    /**
     * pic_url
     */
    @ApiField("pic_url")
    private String picUrl;

    /**
     * shid
     */
    @ApiField("shid")
    private Long shid;

    /**
     * 匹配的标准房型
     */
    @ApiField("srid")
    private Long srid;

    /**
     * 状态。0:正常;-1:删除
     */
    @ApiField("status")
    private Long status;

    /**
     * 窗型，枚举类型 0, 无窗, 1, 有窗;
     */
    @ApiField("window_type")
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
