package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Product;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.product.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ProductUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5165966524568588393L;

    /**
     * 返回product数据结构中的：product_id,modified
     */
    @ApiField("product")
    private Product product;

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
