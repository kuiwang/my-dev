package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Refund;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.refunds.apply.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class RefundsApplyGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4336833372112663692L;

    /**
     * 搜索到的退款信息列表
     */
    @ApiListField("refunds")
    @ApiField("refund")
    private List<Refund> refunds;

    /**
     * 搜索到的交易信息总数
     */
    @ApiField("total_results")
    private Long totalResults;

    public List<Refund> getRefunds() {
        return this.refunds;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setRefunds(List<Refund> refunds) {
        this.refunds = refunds;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

}
