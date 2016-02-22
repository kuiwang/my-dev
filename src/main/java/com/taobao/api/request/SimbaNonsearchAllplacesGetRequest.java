package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaNonsearchAllplacesGetResponse;

/**
 * TOP API: taobao.simba.nonsearch.allplaces.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:21
 */
public class SimbaNonsearchAllplacesGetRequest
        implements TaobaoRequest<SimbaNonsearchAllplacesGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.nonsearch.allplaces.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<SimbaNonsearchAllplacesGetResponse> getResponseClass() {
        return SimbaNonsearchAllplacesGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
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

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
