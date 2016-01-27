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

    /**
     * 买家付款未发货订单号
     */
    private Long orderId;

    /**
     * 拒单理由
     */
    private String reason;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(orderId, "orderId");
        RequestCheckUtils.checkNotEmpty(reason, "reason");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.trade.waimai.refuse";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public String getReason() {
        return this.reason;
    }

    @Override
    public Class<TradeWaimaiRefuseResponse> getResponseClass() {
        return TradeWaimaiRefuseResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("order_id", this.orderId);
        txtParams.put("reason", this.reason);
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

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
