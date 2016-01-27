package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Sku;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.sku.price.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemSkuPriceUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4393448556981121661L;

    /**
     * 商品SKU信息（只包含num_iid和modified）
     */
    @ApiField("sku")
    private Sku sku;

    public Sku getSku() {
        return this.sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }

}
