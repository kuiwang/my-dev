package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.RoomType;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.hotel.type.name.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelTypeNameGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5374463711295682299L;

    /**
     * 房型结构
     */
    @ApiField("room_type")
    private RoomType roomType;

    public RoomType getRoomType() {
        return this.roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

}
