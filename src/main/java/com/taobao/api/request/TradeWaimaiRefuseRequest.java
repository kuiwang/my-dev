package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeWaimaiRefuseResponse;

/**
 * TOP API: taobao.trade.waimai.refuse request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class TradeWaimaiRefuseRequest implements TaobaoRequest<TradeWaimaiRefuseResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 买家付款未发货订单号
     */
    private Long orderId;

    /**
     * 拒单理由
     */
    private String reason;

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return this.reason;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.trade.waimai.refuse";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("order_id", this.orderId);
        txtParams.put("reason", this.reason);
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

    public Class<TradeWaimaiRefuseResponse> getResponseClass() {
        return TradeWaimaiRefuseResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(orderId, "orderId");
        RequestCheckUtils.checkNotEmpty(reason, "reason");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
