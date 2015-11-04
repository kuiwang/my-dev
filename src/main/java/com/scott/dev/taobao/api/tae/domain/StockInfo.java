package com.scott.dev.taobao.api.tae.domain;

import java.util.List;

/**
 * 库存信息
 */
public class StockInfo {

    /**
     * 商品库存
     */
    private String itemQuantity;

    /**
     * sku库存列表
     */
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
