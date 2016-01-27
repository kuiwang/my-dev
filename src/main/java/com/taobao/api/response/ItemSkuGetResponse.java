package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Sku;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.sku.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemSkuGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5874823592514579753L;

    /**
     * Sku
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
