package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Refund;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.refund.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class RefundGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3227321782668113798L;

    /**
     * 退款详情
     */
    @ApiField("refund")
    private Refund refund;

    public Refund getRefund() {
        return this.refund;
    }

    public void setRefund(Refund refund) {
        this.refund = refund;
    }

}
