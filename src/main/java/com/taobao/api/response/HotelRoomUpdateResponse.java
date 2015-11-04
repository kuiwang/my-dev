package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Room;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.hotel.room.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelRoomUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8734723688572411842L;

    /**
     * 商品结构
     */
    @ApiField("room")
    private Room room;

    public void setRoom(Room room) {
        this.room = room;
    }

    public Room getRoom() {
        return this.room;
    }

}
