package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TripJipiaoAgentOrderHkResponse;

/**
 * TOP API: taobao.trip.jipiao.agent.order.hk request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:22
 */
public class TripJipiaoAgentOrderHkRequest implements TaobaoRequest<TripJipiaoAgentOrderHkResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 国内机票订单id
     */
    private Long orderId;

    /**
     * hk（占座）时需要的信息信息列表，元素结构：乘机人姓名;pnr (以分号进行分隔).
     */
    private String pnrInfo;

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setPnrInfo(String pnrInfo) {
        this.pnrInfo = pnrInfo;
    }

    public String getPnrInfo() {
        return this.pnrInfo;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.trip.jipiao.agent.order.hk";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("order_id", this.orderId);
        txtParams.put("pnr_info", this.pnrInfo);
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

    public Class<TripJipiaoAgentOrderHkResponse> getResponseClass() {
        return TripJipiaoAgentOrderHkResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(orderId, "orderId");
        RequestCheckUtils.checkNotEmpty(pnrInfo, "pnrInfo");
        RequestCheckUtils.checkMaxListSize(pnrInfo, 9, "pnrInfo");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
