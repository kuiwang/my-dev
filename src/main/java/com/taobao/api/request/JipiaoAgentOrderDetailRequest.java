package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JipiaoAgentOrderDetailResponse;

/**
 * TOP API: taobao.jipiao.agent.order.detail request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:22
 */
public class JipiaoAgentOrderDetailRequest implements TaobaoRequest<JipiaoAgentOrderDetailResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 淘宝订单id列表，当前支持列表长度为1，即当前只支持单个订单详情查询
     */
    private String orderIds;

    public void setOrderIds(String orderIds) {
        this.orderIds = orderIds;
    }

    public String getOrderIds() {
        return this.orderIds;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.jipiao.agent.order.detail";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("order_ids", this.orderIds);
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

    public Class<JipiaoAgentOrderDetailResponse> getResponseClass() {
        return JipiaoAgentOrderDetailResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(orderIds, "orderIds");
        RequestCheckUtils.checkMaxListSize(orderIds, 1, "orderIds");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
