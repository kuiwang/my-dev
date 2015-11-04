package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlibabaLaiwangUserListGetResponse;

/**
 * TOP API: alibaba.laiwang.user.list.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:50
 */
public class AlibabaLaiwangUserListGetRequest implements
        TaobaoRequest<AlibabaLaiwangUserListGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 第一个拉取的OPENID，不填默认从头开始拉取
     */
    private String nextOpenid;

    public void setNextOpenid(String nextOpenid) {
        this.nextOpenid = nextOpenid;
    }

    public String getNextOpenid() {
        return this.nextOpenid;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "alibaba.laiwang.user.list.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("next_openid", this.nextOpenid);
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

    public Class<AlibabaLaiwangUserListGetResponse> getResponseClass() {
        return AlibabaLaiwangUserListGetResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
