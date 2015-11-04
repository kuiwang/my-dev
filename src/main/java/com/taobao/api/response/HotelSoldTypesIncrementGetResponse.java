package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.RoomType;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.hotel.sold.types.increment.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelSoldTypesIncrementGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2817324842342255297L;

    /**
     * 是否存在下一页
     */
    @ApiField("has_next")
    private Boolean hasNext;

    /**
     * 多个房型结构
     */
    @ApiListField("room_types")
    @ApiField("room_type")
    private List<RoomType> roomTypes;

    /**
     * 符合条件的结果总数
     */
    @ApiField("total_results")
    private Long totalResults;

    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }

    public Boolean getHasNext() {
        return this.hasNext;
    }

    public void setRoomTypes(List<RoomType> roomTypes) {
        this.roomTypes = roomTypes;
    }

    public List<RoomType> getRoomTypes() {
        return this.roomTypes;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

}
