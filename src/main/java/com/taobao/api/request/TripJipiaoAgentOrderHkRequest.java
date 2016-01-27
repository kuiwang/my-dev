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

    /**
     * 国内机票订单id
     */
    private Long orderId;

    /**
     * hk（占座）时需要的信息信息列表，元素结构：乘机人姓名;pnr (以分号进行分隔).
     */
    private String pnrInfo;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(orderId, "orderId");
        RequestCheckUtils.checkNotEmpty(pnrInfo, "pnrInfo");
        RequestCheckUtils.checkMaxListSize(pnrInfo, 9, "pnrInfo");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.trip.jipiao.agent.order.hk";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public String getPnrInfo() {
        return this.pnrInfo;
    }

    @Override
    public Class<TripJipiaoAgentOrderHkResponse> getResponseClass() {
        return TripJipiaoAgentOrderHkResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("order_id", this.orderId);
        txtParams.put("pnr_info", this.pnrInfo);
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

    public void setPnrInfo(String pnrInfo) {
        this.pnrInfo = pnrInfo;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
