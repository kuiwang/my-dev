package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ProductSpec;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: tmall.product.specs.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallProductSpecsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6354811564655253388L;

    /**
     * 返回一组产品规格信息。
     */
    @ApiListField("product_specs")
    @ApiField("product_spec")
    private List<ProductSpec> productSpecs;

    public List<ProductSpec> getProductSpecs() {
        return this.productSpecs;
    }

    public void setProductSpecs(List<ProductSpec> productSpecs) {
        this.productSpecs = productSpecs;
    }

}
