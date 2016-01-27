package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Product;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.product.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ProductGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8821612818424345465L;

    /**
     * 返回具体信息为入参fields请求的字段信息
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
