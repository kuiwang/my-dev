package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.RoomImage;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.hotel.room.img.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelRoomImgDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8586273536785996942L;

    /**
     * 商品图片结构
     */
    @ApiField("room_image")
    private RoomImage roomImage;

    public RoomImage getRoomImage() {
        return this.roomImage;
    }

    public void setRoomImage(RoomImage roomImage) {
        this.roomImage = roomImage;
    }

}
