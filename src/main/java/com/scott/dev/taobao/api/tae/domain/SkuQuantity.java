package com.scott.dev.taobao.api.tae.domain;

/**
 * sku库存
 */
public class SkuQuantity {

    /**
     * 库存数
     */
    private String quantity;

    /**
     * sku id
     */
    private String skuId;

    public String getQuantity() {
        return this.quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getSkuId() {
        return this.skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

}
