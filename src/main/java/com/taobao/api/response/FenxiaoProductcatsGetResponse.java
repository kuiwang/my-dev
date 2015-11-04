package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ProductCat;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.fenxiao.productcats.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoProductcatsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3579329376489466195L;

    /**
     * 产品线列表。返回 ProductCat 包含的字段信息。
     */
    @ApiListField("productcats")
    @ApiField("product_cat")
    private List<ProductCat> productcats;

    /**
     * 查询结果记录数
     */
    @ApiField("total_results")
    private Long totalResults;

    public void setProductcats(List<ProductCat> productcats) {
        this.productcats = productcats;
    }

    public List<ProductCat> getProductcats() {
        return this.productcats;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

}
