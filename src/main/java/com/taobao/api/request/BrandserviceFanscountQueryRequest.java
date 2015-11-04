package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.BrandserviceFanscountQueryResponse;

/**
 * TOP API: taobao.brandservice.fanscount.query request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:50
 */
public class BrandserviceFanscountQueryRequest implements
        TaobaoRequest<BrandserviceFanscountQueryResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 站长用户id
     */
    private Long siteOwnerId;

    public void setSiteOwnerId(Long siteOwnerId) {
        this.siteOwnerId = siteOwnerId;
    }

    public Long getSiteOwnerId() {
        return this.siteOwnerId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.brandservice.fanscount.query";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("site_owner_id", this.siteOwnerId);
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

    public Class<BrandserviceFanscountQueryResponse> getResponseClass() {
        return BrandserviceFanscountQueryResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(siteOwnerId, "siteOwnerId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}