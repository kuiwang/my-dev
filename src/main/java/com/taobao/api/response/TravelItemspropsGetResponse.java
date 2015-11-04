package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TravelItemsProp;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.travel.itemsprops.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TravelItemspropsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5654174248452167798L;

    /**
     * 旅游商品类目属性结构。
     */
    @ApiListField("travel_items_props")
    @ApiField("travel_items_prop")
    private List<TravelItemsProp> travelItemsProps;

    public void setTravelItemsProps(List<TravelItemsProp> travelItemsProps) {
        this.travelItemsProps = travelItemsProps;
    }

    public List<TravelItemsProp> getTravelItemsProps() {
        return this.travelItemsProps;
    }

}
