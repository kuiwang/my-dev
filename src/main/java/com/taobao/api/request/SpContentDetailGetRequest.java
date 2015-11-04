package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SpContentDetailGetResponse;

/**
 * TOP API: taobao.sp.content.detail.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:49
 */
public class SpContentDetailGetRequest implements TaobaoRequest<SpContentDetailGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 内容的主键ID
     */
    private Long id;

    /**
     * 站长Key<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String siteKey;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setSiteKey(String siteKey) {
        this.siteKey = siteKey;
    }

    public String getSiteKey() {
        return this.siteKey;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.sp.content.detail.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
        txtParams.put("site_key", this.siteKey);
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

    public Class<SpContentDetailGetResponse> getResponseClass() {
        return SpContentDetailGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(id, "id");
        RequestCheckUtils.checkNotEmpty(siteKey, "siteKey");
        RequestCheckUtils.checkMaxLength(siteKey, 32, "siteKey");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
