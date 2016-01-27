package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.hotel.rooms.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelRoomsUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8643414839911654894L;

    /**
     * 成功的gid list
     */
    @ApiListField("gids")
    @ApiField("string")
    private List<String> gids;

    public List<String> getGids() {
        return this.gids;
    }

    public void setGids(List<String> gids) {
        this.gids = gids;
    }

}
