package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Hotel;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.hotel.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8814675438435885973L;

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
