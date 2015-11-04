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

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 部门ID
     */
    private Long departmentId;

    /**
     * 主账号用户名
     */
    private String userNick;

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getDepartmentId() {
        return this.departmentId;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.subuser.department.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("department_id", this.departmentId);
        txtParams.put("user_nick", this.userNick);
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

    public Class<SubuserDepartmentDeleteResponse> getResponseClass() {
        return SubuserDepartmentDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(departmentId, "departmentId");
        RequestCheckUtils.checkNotEmpty(userNick, "userNick");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
