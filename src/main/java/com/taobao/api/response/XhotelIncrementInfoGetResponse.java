package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SHotel;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.xhotel.increment.info.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class XhotelIncrementInfoGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5217298633748815917L;

    /**
     * 酒店列表
     */
    @ApiListField("hotels")
    @ApiField("s_hotel")
    private List<SHotel> hotels;

    /**
     * 酒店总数
     */
    @ApiField("total_results")
    private Long totalResults;

    public List<SHotel> getHotels() {
        return this.hotels;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setHotels(List<SHotel> hotels) {
        this.hotels = hotels;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

}
