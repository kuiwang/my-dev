package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TradeTrace;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.jds.trade.traces.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JdsTradeTracesGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3284849165325236179L;

    /**
     * 跟踪信息列表
     */
    @ApiListField("traces")
    @ApiField("trade_trace")
    private List<TradeTrace> traces;

    public List<TradeTrace> getTraces() {
        return this.traces;
    }

    public void setTraces(List<TradeTrace> traces) {
        this.traces = traces;
    }

}
