package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Hotel;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.hotels.search response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelsSearchResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5741539254233134271L;

    /**
     * 多个酒店结构<br>
     * </br><font color = red>不返回房型信息，需要查看房型信息，请调用taobao.hotel.get</font>
     */
    @ApiListField("hotels")
    @ApiField("hotel")
    private List<Hotel> hotels;

    /**
     * 符合条件的结果总数
     */
    @ApiField("total_results")
    private Long totalResults;

    public List<Hotel> getHotels() {
        return this.hotels;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

}
