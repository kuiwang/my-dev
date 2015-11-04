package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 以城市维度分的店铺列表
 *
 * @author auto create
 * @since 1.0, null
 */
public class ShopCityResult extends TaobaoObject {

    private static final long serialVersionUID = 1592867396797441543L;

    /**
     * 以城市维度分的店铺列表
     */
    @ApiListField("cityshoplist")
    @ApiField("top_shop_group_by_city")
    private List<TopShopGroupByCity> cityshoplist;

    public List<TopShopGroupByCity> getCityshoplist() {
        return this.cityshoplist;
    }

    public void setCityshoplist(List<TopShopGroupByCity> cityshoplist) {
        this.cityshoplist = cityshoplist;
    }

}
