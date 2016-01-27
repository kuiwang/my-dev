package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ShopCat;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.shopcats.list.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ShopcatsListGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8589287177584396463L;

    /**
     * 店铺类目列表信息
     */
    @ApiListField("shop_cats")
    @ApiField("shop_cat")
    private List<ShopCat> shopCats;

    public List<ShopCat> getShopCats() {
        return this.shopCats;
    }

    public void setShopCats(List<ShopCat> shopCats) {
        this.shopCats = shopCats;
    }

}
