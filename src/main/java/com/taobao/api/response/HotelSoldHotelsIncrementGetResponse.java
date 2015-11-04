package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Hotel;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.hotel.sold.hotels.increment.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelSoldHotelsIncrementGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1621194594915633722L;

    /**
     * 是否存在下一页
     */
    @ApiField("has_next")
    private Boolean hasNext;

    /**
     * 多个酒店结构
     */
    @ApiListField("hotels")
    @ApiField("hotel")
    private List<Hotel> hotels;

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

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public List<Hotel> getHotels() {
        return this.hotels;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

}
