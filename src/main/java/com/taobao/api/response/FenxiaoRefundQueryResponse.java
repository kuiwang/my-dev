package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.RefundDetail;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.fenxiao.refund.query response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoRefundQueryResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2658923772316135669L;

    /**
     * 代销采购退款列表
     */
    @ApiListField("refund_list")
    @ApiField("refund_detail")
    private List<RefundDetail> refundList;

    /**
     * 按查询条件查到的记录总数
     */
    @ApiField("total_results")
    private Long totalResults;

    public List<RefundDetail> getRefundList() {
        return this.refundList;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setRefundList(List<RefundDetail> refundList) {
        this.refundList = refundList;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

}
