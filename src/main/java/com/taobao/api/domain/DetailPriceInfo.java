package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 价格信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class DetailPriceInfo extends TaobaoObject {

    private static final long serialVersionUID = 1716871587843191554L;

    /**
     * 商品对应的价格
     */
    @ApiField("item_price")
    private DetailPrice itemPrice;

    /**
     * sku对应的价格列表
     */
    @ApiListField("sku_price_list")
    @ApiField("sku_price_item")
    private List<SkuPriceItem> skuPriceList;

    public DetailPrice getItemPrice() {
        return this.itemPrice;
    }

    public List<SkuPriceItem> getSkuPriceList() {
        return this.skuPriceList;
    }

    public void setItemPrice(DetailPrice itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setSkuPriceList(List<SkuPriceItem> skuPriceList) {
        this.skuPriceList = skuPriceList;
    }

}
