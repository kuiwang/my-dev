package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SubuserDepartmentUpdateResponse;

/**
 * TOP API: taobao.subuser.department.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class SubuserDepartmentUpdateRequest
        implements TaobaoRequest<SubuserDepartmentUpdateResponse> {

    /**
     * 部门ID
     */
    private Long departmentId;

    /**
     * 部门名称
     */
    private String departmentName;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 父部门ID 如果是最高部门则传入0
     */
    private Long parentId;

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
        return "taobao.subuser.department.update";
    }

    public Long getDepartmentId() {
        return this.departmentId;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getParentId() {
        return this.parentId;
    }

    @Override
    public Class<SubuserDepartmentUpdateResponse> getResponseClass() {
        return SubuserDepartmentUpdateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("department_id", this.departmentId);
        txtParams.put("department_name", this.departmentName);
        txtParams.put("parent_id", this.parentId);
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

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }
}
