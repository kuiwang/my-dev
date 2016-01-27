package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SHotelInfoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.xhotel.info.list.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class XhotelInfoListGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3812315255251313234L;

    /**
     * 标准酒店信息
     */
    @ApiListField("hotels")
    @ApiField("s_hotel_info_object")
    private List<SHotelInfoObject> hotels;

    /**
     * 酒店总数
     */
    @ApiField("total_results")
    private Long totalResults;

    public List<SHotelInfoObject> getHotels() {
        return this.hotels;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setHotels(List<SHotelInfoObject> hotels) {
        this.hotels = hotels;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

}
