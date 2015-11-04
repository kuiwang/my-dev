package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Product;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.product.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ProductAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2575184649214921565L;

    /**
     * 产品结构
     */
    @ApiField("product")
    private Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return this.product;
    }

}
