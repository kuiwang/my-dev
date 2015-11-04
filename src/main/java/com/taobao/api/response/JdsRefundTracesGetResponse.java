package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.RefundTrace;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.jds.refund.traces.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JdsRefundTracesGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6821182724691217327L;

    /**
     * 退款跟踪列表
     */
    @ApiListField("traces")
    @ApiField("refund_trace")
    private List<RefundTrace> traces;

    public void setTraces(List<RefundTrace> traces) {
        this.traces = traces;
    }

    public List<RefundTrace> getTraces() {
        return this.traces;
    }

}
