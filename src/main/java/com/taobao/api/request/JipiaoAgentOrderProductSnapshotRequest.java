package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JipiaoAgentOrderProductSnapshotResponse;

/**
 * TOP API: taobao.jipiao.agent.order.product.snapshot request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:22
 */
public class JipiaoAgentOrderProductSnapshotRequest
        implements TaobaoRequest<JipiaoAgentOrderProductSnapshotResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 订单号
     */
    private Long orderId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(orderId, "orderId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.jipiao.agent.order.product.snapshot";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    @Override
    public Class<JipiaoAgentOrderProductSnapshotResponse> getResponseClass() {
        return JipiaoAgentOrderProductSnapshotResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("order_id", this.orderId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
