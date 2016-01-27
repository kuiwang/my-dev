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

    /**
     * 回流信息是否开通买家端展示
     */
    private String openForBuyer;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "taobao.jds.hluser.update";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getOpenForBuyer() {
        return this.openForBuyer;
    }

    @Override
    public Class<JdsHluserUpdateResponse> getResponseClass() {
        return JdsHluserUpdateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("open_for_buyer", this.openForBuyer);
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

    public void setOpenForBuyer(String openForBuyer) {
        this.openForBuyer = openForBuyer;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
