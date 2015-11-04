package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UmpActivityGetResponse;

/**
 * TOP API: taobao.ump.activity.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:24
 */
public class UmpActivityGetRequest implements TaobaoRequest<UmpActivityGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 活动id
     */
    private Long actId;

    public void setActId(Long actId) {
        this.actId = actId;
    }

    public Long getActId() {
        return this.actId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.ump.activity.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("act_id", this.actId);
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

    public Class<UmpActivityGetResponse> getResponseClass() {
        return UmpActivityGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(actId, "actId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
