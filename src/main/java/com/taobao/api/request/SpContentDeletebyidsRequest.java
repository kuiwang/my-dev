package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SpContentDeletebyidsResponse;

/**
 * TOP API: taobao.sp.content.deletebyids request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:49
 */
public class SpContentDeletebyidsRequest implements TaobaoRequest<SpContentDeletebyidsResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 主键ID列表，以逗号,分割
     */
    private String ids;

    /**
     * 站长Key<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String siteKey;

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getIds() {
        return this.ids;
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
        return "taobao.sp.content.deletebyids";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("ids", this.ids);
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

    public Class<SpContentDeletebyidsResponse> getResponseClass() {
        return SpContentDeletebyidsResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(ids, "ids");
        RequestCheckUtils.checkNotEmpty(siteKey, "siteKey");
        RequestCheckUtils.checkMaxLength(siteKey, 32, "siteKey");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
