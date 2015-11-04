package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JdsHluserUpdateResponse;

/**
 * TOP API: taobao.jds.hluser.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:31
 */
public class JdsHluserUpdateRequest implements TaobaoRequest<JdsHluserUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 回流信息是否开通买家端展示
     */
    private String openForBuyer;

    public void setOpenForBuyer(String openForBuyer) {
        this.openForBuyer = openForBuyer;
    }

    public String getOpenForBuyer() {
        return this.openForBuyer;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.jds.hluser.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("open_for_buyer", this.openForBuyer);
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

    public Class<JdsHluserUpdateResponse> getResponseClass() {
        return JdsHluserUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
