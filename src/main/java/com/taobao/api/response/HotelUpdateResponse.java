package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Hotel;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.hotel.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5213488586356424987L;

    /**
     * 酒店结构
     */
    @ApiField("hotel")
    private Hotel hotel;

    public Hotel getHotel() {
        return this.hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

}
