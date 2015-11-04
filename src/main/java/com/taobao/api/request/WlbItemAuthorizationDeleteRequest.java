package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemAuthorizationDeleteResponse;

/**
 * TOP API: taobao.wlb.item.authorization.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:13
 */
public class WlbItemAuthorizationDeleteRequest implements
        TaobaoRequest<WlbItemAuthorizationDeleteResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 授权关系ID
     */
    private Long authorizeId;

    public void setAuthorizeId(Long authorizeId) {
        this.authorizeId = authorizeId;
    }

    public Long getAuthorizeId() {
        return this.authorizeId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wlb.item.authorization.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("authorize_id", this.authorizeId);
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

    public Class<WlbItemAuthorizationDeleteResponse> getResponseClass() {
        return WlbItemAuthorizationDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(authorizeId, "authorizeId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
