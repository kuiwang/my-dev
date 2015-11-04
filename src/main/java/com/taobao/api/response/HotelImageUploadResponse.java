package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.HotelImage;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.hotel.image.upload response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelImageUploadResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3431521857136338447L;

    /**
     * 酒店图片
     */
    @ApiField("hotel_image")
    private HotelImage hotelImage;

    public void setHotelImage(HotelImage hotelImage) {
        this.hotelImage = hotelImage;
    }

    public HotelImage getHotelImage() {
        return this.hotelImage;
    }

}
