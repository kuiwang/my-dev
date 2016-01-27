package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TravelItems;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.travel.items.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TravelItemsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6433187618736979578L;

    /**
     * 旅游商品结构
     */
    @ApiField("travel_items")
    private TravelItems travelItems;

    public TravelItems getTravelItems() {
        return this.travelItems;
    }

    public void setTravelItems(TravelItems travelItems) {
        this.travelItems = travelItems;
    }

}
