package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SellercenterRoleInfoGetResponse;

/**
 * TOP API: taobao.sellercenter.role.info.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class SellercenterRoleInfoGetRequest implements
        TaobaoRequest<SellercenterRoleInfoGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 角色id<br />
     * 支持的最大列表长度为：100
     */
    private Long roleId;

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getRoleId() {
        return this.roleId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.sellercenter.role.info.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("role_id", this.roleId);
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

    public Class<SellercenterRoleInfoGetResponse> getResponseClass() {
        return SellercenterRoleInfoGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(roleId, "roleId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
