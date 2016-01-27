package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Shop;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.shop.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ShopGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3674343226181173132L;

    /**
     * 店铺信息
     */
    @ApiField("shop")
    private Shop shop;

    public Shop getShop() {
        return this.shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

}
