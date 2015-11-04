package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 酒店价格查询对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class HotelPriceSearchObject extends TaobaoObject {

    private static final long serialVersionUID = 1457462678316844244L;

    /**
     * 结束 时间
     */
    @ApiField("end_date")
    private Date endDate;

    /**
     * 最低价
     */
    @ApiField("low_price")
    private Long lowPrice;

    /**
     * 房型价格信息
     */
    @ApiListField("rooms")
    @ApiField("room_type_price_search_object")
    private List<RoomTypePriceSearchObject> rooms;

    /**
     * 标准酒店id
     */
    @ApiField("shid")
    private Long shid;

    /**
     * 开始 时间
     */
    @ApiField("start_date")
    private Date startDate;

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getLowPrice() {
        return this.lowPrice;
    }

    public void setLowPrice(Long lowPrice) {
        this.lowPrice = lowPrice;
    }

    public List<RoomTypePriceSearchObject> getRooms() {
        return this.rooms;
    }

    public void setRooms(List<RoomTypePriceSearchObject> rooms) {
        this.rooms = rooms;
    }

    public Long getShid() {
        return this.shid;
    }

    public void setShid(Long shid) {
        this.shid = shid;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

}
