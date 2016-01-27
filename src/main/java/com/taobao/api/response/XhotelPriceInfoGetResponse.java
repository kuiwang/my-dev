package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.HotelPriceSearchObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.xhotel.price.info.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class XhotelPriceInfoGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5297192983181797959L;

    /**
     * 酒店价格信息对象
     */
    @ApiListField("hotel_prices")
    @ApiField("hotel_price_search_object")
    private List<HotelPriceSearchObject> hotelPrices;

    /**
     * 返回的信息总条数
     */
    @ApiField("total_results")
    private Long totalResults;

    public List<HotelPriceSearchObject> getHotelPrices() {
        return this.hotelPrices;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setHotelPrices(List<HotelPriceSearchObject> hotelPrices) {
        this.hotelPrices = hotelPrices;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

}
