package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SearchHotelObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.xhotel.list.search response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class XhotelListSearchResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7566976789972458858L;

    /**
     * 渠道ID
     */
    @ApiField("channel_id")
    private String channelId;

    /**
     * h5的list的url
     */
    @ApiField("h5_list_url")
    private String h5ListUrl;

    /**
     * 酒店list的url
     */
    @ApiField("hotel_list_url")
    private String hotelListUrl;

    /**
     * 酒店列表结果集
     */
    @ApiListField("hotels")
    @ApiField("search_hotel_object")
    private List<SearchHotelObject> hotels;

    /**
     * 请求ID
     */
    @ApiField("request_id")
    private String requestId;

    /**
     * 酒店总数
     */
    @ApiField("total_results")
    private Long totalResults;

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public void setH5ListUrl(String h5ListUrl) {
        this.h5ListUrl = h5ListUrl;
    }

    public String getH5ListUrl() {
        return this.h5ListUrl;
    }

    public void setHotelListUrl(String hotelListUrl) {
        this.hotelListUrl = hotelListUrl;
    }

    public String getHotelListUrl() {
        return this.hotelListUrl;
    }

    public void setHotels(List<SearchHotelObject> hotels) {
        this.hotels = hotels;
    }

    public List<SearchHotelObject> getHotels() {
        return this.hotels;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

}
