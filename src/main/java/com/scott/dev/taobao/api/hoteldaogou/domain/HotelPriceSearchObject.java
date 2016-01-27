package com.scott.dev.taobao.api.hoteldaogou.domain;

import java.util.Date;
import java.util.List;

/**
 * 酒店价格查询对象
 */
public class HotelPriceSearchObject {

    /**
     * 结束 时间
     */
    private Date endDate;

    /**
     * 最低价
     */
    private Long lowPrice;

    /**
     * 房型价格信息
     */
    private List<RoomTypePriceSearchObject> rooms;

    /**
     * 标准酒店id
     */
    private Long shid;

    /**
     * 开始 时间
     */
    private Date startDate;

    public Date getEndDate() {
        return this.endDate;
    }

    public Long getLowPrice() {
        return this.lowPrice;
    }

    public List<RoomTypePriceSearchObject> getRooms() {
        return this.rooms;
    }

    public Long getShid() {
        return this.shid;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setLowPrice(Long lowPrice) {
        this.lowPrice = lowPrice;
    }

    public void setRooms(List<RoomTypePriceSearchObject> rooms) {
        this.rooms = rooms;
    }

    public void setShid(Long shid) {
        this.shid = shid;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

}
