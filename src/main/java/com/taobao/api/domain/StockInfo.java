package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 库存信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class StockInfo extends TaobaoObject {

    private static final long serialVersionUID = 8796924564121948457L;

    /**
     * 商品库存
     */
    @ApiField("item_quantity")
    private String itemQuantity;

    /**
     * sku库存列表
     */
    @ApiListField("sku_quantity_list")
    @ApiField("sku_quantity")
    private List<SkuQuantity> skuQuantityList;

    public String getItemQuantity() {
        return this.itemQuantity;
    }

    public void setItemQuantity(String itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public List<SkuQuantity> getSkuQuantityList() {
        return this.skuQuantityList;
    }

    public void setSkuQuantityList(List<SkuQuantity> skuQuantityList) {
        this.skuQuantityList = skuQuantityList;
    }

}
