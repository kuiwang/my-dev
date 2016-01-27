package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SubuserDepartmentDeleteResponse;

/**
 * TOP API: taobao.subuser.department.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class SubuserDepartmentDeleteRequest implements
        TaobaoRequest<SubuserDepartmentDeleteResponse> {

    /**
     * 部门ID
     */
    private Long departmentId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 主账号用户名
     */
    private String userNick;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(departmentId, "departmentId");
        RequestCheckUtils.checkNotEmpty(userNick, "userNick");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.subuser.department.delete";
    }

    public Long getDepartmentId() {
        return this.departmentId;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<SubuserDepartmentDeleteResponse> getResponseClass() {
        return SubuserDepartmentDeleteResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("department_id", this.departmentId);
        txtParams.put("user_nick", this.userNick);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getUserNick() {
        return this.userNick;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }
}
