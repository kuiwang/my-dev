package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeWaimaiConfirmResponse;

/**
 * TOP API: taobao.trade.waimai.confirm request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class TradeWaimaiConfirmRequest implements TaobaoRequest<TradeWaimaiConfirmResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 代送商ID
     */
    private Long agentId;

    /**
     * 未确认发货的订单编号
     */
    private Long orderId;

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public Long getAgentId() {
        return this.agentId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.trade.waimai.confirm";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("agent_id", this.agentId);
        txtParams.put("order_id", this.orderId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<TradeWaimaiConfirmResponse> getResponseClass() {
        return TradeWaimaiConfirmResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(orderId, "orderId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
