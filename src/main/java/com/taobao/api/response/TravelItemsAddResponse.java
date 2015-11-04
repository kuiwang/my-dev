package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TravelItems;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.travel.items.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TravelItemsAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7429812887813873112L;

    /**
     * 旅游商品结构。
     */
    @ApiField("travel_items")
    private TravelItems travelItems;

    public void setTravelItems(TravelItems travelItems) {
        this.travelItems = travelItems;
    }

    public TravelItems getTravelItems() {
        return this.travelItems;
    }

}
