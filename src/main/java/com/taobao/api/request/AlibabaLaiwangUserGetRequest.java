package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlibabaLaiwangUserGetResponse;

/**
 * TOP API: alibaba.laiwang.user.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:50
 */
public class AlibabaLaiwangUserGetRequest implements TaobaoRequest<AlibabaLaiwangUserGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * openid
     */
    private String openid;

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getOpenid() {
        return this.openid;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "alibaba.laiwang.user.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("openid", this.openid);
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

    public Class<AlibabaLaiwangUserGetResponse> getResponseClass() {
        return AlibabaLaiwangUserGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(openid, "openid");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
