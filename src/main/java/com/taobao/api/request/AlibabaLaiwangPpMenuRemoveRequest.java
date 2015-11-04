package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlibabaLaiwangPpMenuRemoveResponse;

/**
 * TOP API: alibaba.laiwang.pp.menu.remove request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:50
 */
public class AlibabaLaiwangPpMenuRemoveRequest implements
        TaobaoRequest<AlibabaLaiwangPpMenuRemoveResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "alibaba.laiwang.pp.menu.remove";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
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

    public Class<AlibabaLaiwangPpMenuRemoveResponse> getResponseClass() {
        return AlibabaLaiwangPpMenuRemoveResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
