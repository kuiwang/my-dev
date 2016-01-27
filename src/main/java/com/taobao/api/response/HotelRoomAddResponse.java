package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Room;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.hotel.room.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelRoomAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5894531477644466293L;

    /**
     * 商品结构
     */
    @ApiField("room")
    private Room room;

    public Room getRoom() {
        return this.room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

}
