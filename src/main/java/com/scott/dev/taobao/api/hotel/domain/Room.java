package com.scott.dev.taobao.api.hotel.domain;

import java.util.Date;

/**
 * Room（酒店商品）结构。各字段详细说明可参考接口定义，如：商品发布接口。
 */
public class Room {

    /**
     * 面积
     */
    private String area;

    /**
     * 宽带服务
     */
    private String bbn;

    /**
     * 床型
     */
    private String bedType;

    /**
     * 早餐
     */
    private String breakfast;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 订金
     */
    private Long deposit;

    /**
     * 商品描述
     */
    private String desc;

    /**
     * 手续费
     */
    private Long fee;

    /**
     * 酒店商品id
     */
    private Long gid;

    /**
     * 购买须知
     */
    private String guide;

    /**
     * 酒店id
     */
    private Long hid;

    /**
     * 酒店信息
     */
    private Hotel hotel;

    /**
     * 淘宝商品id
     */
    private Long iid;

    /**
     * 修改时间
     */
    private Date modified;

    /**
     * 为到店支付卖家特殊使用，代表多种支付类型的房态
     */
    private String multiRoomQuotas;

    /**
     * 支付类型
     */
    private String paymentType;

    /**
     * 酒店商品图片Url。多个url用逗号隔开
     */
    private String picUrl;

    /**
     * 价格类型
     */
    private String priceType;

    /**
     * 房型id
     */
    private Long rid;

    /**
     * 房态信息。JSON格式串
     */
    private String roomQuotas;

    /**
     * 房型信息
     */
    private RoomType roomType;

    /**
     * 设施服务。JSON格式串
     */
    private String service;

    /**
     * 床宽
     */
    private String size;

    /**
     * 状态。1：上架。2：下架。3：删除
     */
    private Long status;

    /**
     * 楼层
     */
    private String storey;

    /**
     * 酒店商品名称
     */
    private String title;

    public String getArea() {
        return this.area;
    }

    public String getBbn() {
        return this.bbn;
    }

    public String getBedType() {
        return this.bedType;
    }

    public String getBreakfast() {
        return this.breakfast;
    }

    public Date getCreated() {
        return this.created;
    }

    public Long getDeposit() {
        return this.deposit;
    }

    public String getDesc() {
        return this.desc;
    }

    public Long getFee() {
        return this.fee;
    }

    public Long getGid() {
        return this.gid;
    }

    public String getGuide() {
        return this.guide;
    }

    public Long getHid() {
        return this.hid;
    }

    public Hotel getHotel() {
        return this.hotel;
    }

    public Long getIid() {
        return this.iid;
    }

    public Date getModified() {
        return this.modified;
    }

    public String getMultiRoomQuotas() {
        return this.multiRoomQuotas;
    }

    public String getPaymentType() {
        return this.paymentType;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public String getPriceType() {
        return this.priceType;
    }

    public Long getRid() {
        return this.rid;
    }

    public String getRoomQuotas() {
        return this.roomQuotas;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public String getService() {
        return this.service;
    }

    public String getSize() {
        return this.size;
    }

    public Long getStatus() {
        return this.status;
    }

    public String getStorey() {
        return this.storey;
    }

    public String getTitle() {
        return this.title;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setBbn(String bbn) {
        this.bbn = bbn;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setDeposit(Long deposit) {
        this.deposit = deposit;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void setIid(Long iid) {
        this.iid = iid;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setMultiRoomQuotas(String multiRoomQuotas) {
        this.multiRoomQuotas = multiRoomQuotas;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public void setRoomQuotas(String roomQuotas) {
        this.roomQuotas = roomQuotas;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public void setStorey(String storey) {
        this.storey = storey;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
