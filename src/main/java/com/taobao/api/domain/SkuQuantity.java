package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * sku库存
 *
 * @author auto create
 * @since 1.0, null
 */
public class SkuQuantity extends TaobaoObject {

    private static final long serialVersionUID = 1447946281415935594L;

    /**
     * 库存数
     */
    @ApiField("quantity")
    private String quantity;

    /**
     * sku id
     */
    @ApiField("sku_id")
    private String skuId;

    public String getQuantity() {
        return this.quantity;
    }

    public String getSkuId() {
        return this.skuId;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

}
