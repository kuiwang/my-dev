package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.LotteryWangcaiSellerGoodsInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.caipiao.goods.info.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CaipiaoGoodsInfoGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3552255463315861496L;

    /**
     * 查询的结果列表
     */
    @ApiListField("results")
    @ApiField("lottery_wangcai_seller_goods_info")
    private List<LotteryWangcaiSellerGoodsInfo> results;

    /**
     * 返回列表的大小
     */
    @ApiField("total_results")
    private Long totalResults;

    public List<LotteryWangcaiSellerGoodsInfo> getResults() {
        return this.results;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setResults(List<LotteryWangcaiSellerGoodsInfo> results) {
        this.results = results;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

}
