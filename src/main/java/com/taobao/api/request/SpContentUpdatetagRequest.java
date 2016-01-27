package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SpContentUpdatetagResponse;

/**
 * TOP API: taobao.sp.content.updatetag request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:50
 */
public class SpContentUpdatetagRequest implements TaobaoRequest<SpContentUpdatetagResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 新的标签名称<br />
     * 支持最大长度为：6<br />
     * 支持的最大列表长度为：6
     */
    private String newname;

    /**
     * 旧的标签名称<br />
     * 支持最大长度为：6<br />
     * 支持的最大列表长度为：6
     */
    private String oldname;

    /**
     * 站长Key<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String siteKey;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(newname, "newname");
        RequestCheckUtils.checkMaxLength(newname, 6, "newname");
        RequestCheckUtils.checkNotEmpty(oldname, "oldname");
        RequestCheckUtils.checkMaxLength(oldname, 6, "oldname");
        RequestCheckUtils.checkNotEmpty(siteKey, "siteKey");
        RequestCheckUtils.checkMaxLength(siteKey, 32, "siteKey");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.sp.content.updatetag";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNewname() {
        return this.newname;
    }

    public String getOldname() {
        return this.oldname;
    }

    @Override
    public Class<SpContentUpdatetagResponse> getResponseClass() {
        return SpContentUpdatetagResponse.class;
    }

    public String getSiteKey() {
        return this.siteKey;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("newname", this.newname);
        txtParams.put("oldname", this.oldname);
        txtParams.put("site_key", this.siteKey);
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

    public void setNewname(String newname) {
        this.newname = newname;
    }

    public void setOldname(String oldname) {
        this.oldname = oldname;
    }

    public void setSiteKey(String siteKey) {
        this.siteKey = siteKey;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
