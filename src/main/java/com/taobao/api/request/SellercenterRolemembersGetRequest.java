package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SellercenterRolemembersGetResponse;

/**
 * TOP API: taobao.sellercenter.rolemembers.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class SellercenterRolemembersGetRequest implements
        TaobaoRequest<SellercenterRolemembersGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 角色id<br />
     * 支持的最大列表长度为：100
     */
    private Long roleId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(roleId, "roleId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.sellercenter.rolemembers.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<SellercenterRolemembersGetResponse> getResponseClass() {
        return SellercenterRolemembersGetResponse.class;
    }

    public Long getRoleId() {
        return this.roleId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("role_id", this.roleId);
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

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
