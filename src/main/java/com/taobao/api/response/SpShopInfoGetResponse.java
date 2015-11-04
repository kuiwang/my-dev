package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SpShop;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.sp.shop.info.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SpShopInfoGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2334225621188611512L;

    /**
     * 店铺信息
     */
    @ApiField("shop")
    private SpShop shop;

    public void setShop(SpShop shop) {
        this.shop = shop;
    }

    public SpShop getShop() {
        return this.shop;
    }

}
