package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ProductSpec;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.product.spec.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallProductSpecAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4798481588443616654L;

    /**
     * 产品规格对象
     */
    @ApiField("product_spec")
    private ProductSpec productSpec;

    public ProductSpec getProductSpec() {
        return this.productSpec;
    }

    public void setProductSpec(ProductSpec productSpec) {
        this.productSpec = productSpec;
    }

}
