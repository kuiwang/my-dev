package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SpContentDeletetagResponse;

/**
 * TOP API: taobao.sp.content.deletetag request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:49
 */
public class SpContentDeletetagRequest implements TaobaoRequest<SpContentDeletetagResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 站长Key<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String siteKey;

    /**
     * 标签名称<br />
     * 支持最大长度为：6<br />
     * 支持的最大列表长度为：6
     */
    private String tagname;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(siteKey, "siteKey");
        RequestCheckUtils.checkMaxLength(siteKey, 32, "siteKey");
        RequestCheckUtils.checkNotEmpty(tagname, "tagname");
        RequestCheckUtils.checkMaxLength(tagname, 6, "tagname");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.sp.content.deletetag";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<SpContentDeletetagResponse> getResponseClass() {
        return SpContentDeletetagResponse.class;
    }

    public String getSiteKey() {
        return this.siteKey;
    }

    public String getTagname() {
        return this.tagname;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("site_key", this.siteKey);
        txtParams.put("tagname", this.tagname);
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

    public void setSiteKey(String siteKey) {
        this.siteKey = siteKey;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
