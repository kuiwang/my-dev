package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Room;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.hotel.room.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelRoomGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2558113831477746489L;

    /**
     * 商品结构。是否返回酒店信息、房型信息、房态列表、宝贝描述根据参数决定
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
