package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 旅游度假商品地区结构。
 *
 * @author auto create
 * @since 1.0, null
 */
public class TravelItemsAreaNode extends TaobaoObject {

    private static final long serialVersionUID = 5323322913432898582L;

    /**
     * 该地区下所有下级地区集合(目前地区只有两级，国内：省-市；国际： 国家-城市)。
     */
    @ApiListField("sub_prop_values")
    @ApiField("travel_items_prop_value")
    private List<TravelItemsPropValue> subPropValues;

    /**
     * 地区属性值。
     */
    @ApiField("travel_items_prop_value")
    private TravelItemsPropValue travelItemsPropValue;

    public List<TravelItemsPropValue> getSubPropValues() {
        return this.subPropValues;
    }

    public TravelItemsPropValue getTravelItemsPropValue() {
        return this.travelItemsPropValue;
    }

    public void setSubPropValues(List<TravelItemsPropValue> subPropValues) {
        this.subPropValues = subPropValues;
    }

    public void setTravelItemsPropValue(TravelItemsPropValue travelItemsPropValue) {
        this.travelItemsPropValue = travelItemsPropValue;
    }

}
