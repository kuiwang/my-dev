package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UmpToolsGetResponse;

/**
 * TOP API: taobao.ump.tools.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:24
 */
public class UmpToolsGetRequest implements TaobaoRequest<UmpToolsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 工具编码
     */
    private String toolCode;

    public void setToolCode(String toolCode) {
        this.toolCode = toolCode;
    }

    public String getToolCode() {
        return this.toolCode;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.ump.tools.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("tool_code", this.toolCode);
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

    public Class<UmpToolsGetResponse> getResponseClass() {
        return UmpToolsGetResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
