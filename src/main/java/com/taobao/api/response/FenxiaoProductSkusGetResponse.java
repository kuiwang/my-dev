package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.FenxiaoSku;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.fenxiao.product.skus.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoProductSkusGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1697914774694562381L;

    /**
     * sku信息
     */
    @ApiListField("skus")
    @ApiField("fenxiao_sku")
    private List<FenxiaoSku> skus;

    /**
     * 记录数量
     */
    @ApiField("total_results")
    private Long totalResults;

    public List<FenxiaoSku> getSkus() {
        return this.skus;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setSkus(List<FenxiaoSku> skus) {
        this.skus = skus;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

}
