package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TripJipiaoAgentOrderGetResponse;

/**
 * TOP API: taobao.trip.jipiao.agent.order.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:22
 */
public class TripJipiaoAgentOrderGetRequest implements
        TaobaoRequest<TripJipiaoAgentOrderGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 淘宝政策id列表，当前支持列表长度为1，即当前只支持单个订单详情查询
     */
    private String orderIds;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(orderIds, "orderIds");
        RequestCheckUtils.checkMaxListSize(orderIds, 1, "orderIds");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.trip.jipiao.agent.order.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getOrderIds() {
        return this.orderIds;
    }

    @Override
    public Class<TripJipiaoAgentOrderGetResponse> getResponseClass() {
        return TripJipiaoAgentOrderGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("order_ids", this.orderIds);
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

    public void setOrderIds(String orderIds) {
        this.orderIds = orderIds;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
