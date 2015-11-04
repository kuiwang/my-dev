package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlipayPointBudgetGetResponse;

/**
 * TOP API: alipay.point.budget.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:30
 */
public class AlipayPointBudgetGetRequest implements TaobaoRequest<AlipayPointBudgetGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 支付宝给用户的授权。如果没有top的授权，这个字段是必填项
     */
    private String authToken;

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getAuthToken() {
        return this.authToken;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "alipay.point.budget.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("auth_token", this.authToken);
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

    public Class<AlipayPointBudgetGetResponse> getResponseClass() {
        return AlipayPointBudgetGetResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
