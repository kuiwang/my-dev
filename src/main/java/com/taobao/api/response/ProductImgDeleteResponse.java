package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ProductImg;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.product.img.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ProductImgDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7514212876733383763L;

    /**
     * 返回productimg中的：id,product_id
     */
    @ApiField("product_img")
    private ProductImg productImg;

    public ProductImg getProductImg() {
        return this.productImg;
    }

    public void setProductImg(ProductImg productImg) {
        this.productImg = productImg;
    }

}
