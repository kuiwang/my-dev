package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.HotelOrder;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.hotel.order.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelOrderGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8375532492918976344L;

    /**
     * 订单结构，是否返回入住人列表根据参数决定
     */
    @ApiField("hotel_order")
    private HotelOrder hotelOrder;

    public HotelOrder getHotelOrder() {
        return this.hotelOrder;
    }

    public void setHotelOrder(HotelOrder hotelOrder) {
        this.hotelOrder = hotelOrder;
    }

}
