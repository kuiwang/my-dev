package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.FenxiaoProduct;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.fenxiao.products.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoProductsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6241636862379567213L;

    /**
     * 产品对象记录集。返回 FenxiaoProduct 包含的字段信息。
     */
    @ApiListField("products")
    @ApiField("fenxiao_product")
    private List<FenxiaoProduct> products;

    /**
     * 查询结果记录数
     */
    @ApiField("total_results")
    private Long totalResults;

    public void setProducts(List<FenxiaoProduct> products) {
        this.products = products;
    }

    public List<FenxiaoProduct> getProducts() {
        return this.products;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

}
