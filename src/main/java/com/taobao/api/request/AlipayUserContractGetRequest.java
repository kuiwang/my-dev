package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlipayUserContractGetResponse;

/**
 * TOP API: alipay.user.contract.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:31
 */
public class AlipayUserContractGetRequest implements TaobaoRequest<AlipayUserContractGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 订购者支付宝ID。session与subscriber_user_id二选一即可。
     */
    private String subscriberUserId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "alipay.user.contract.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<AlipayUserContractGetResponse> getResponseClass() {
        return AlipayUserContractGetResponse.class;
    }

    public String getSubscriberUserId() {
        return this.subscriberUserId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("subscriber_user_id", this.subscriberUserId);
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

    public void setSubscriberUserId(String subscriberUserId) {
        this.subscriberUserId = subscriberUserId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
