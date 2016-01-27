package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmGroupUpdateResponse;

/**
 * TOP API: taobao.crm.group.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class CrmGroupUpdateRequest implements TaobaoRequest<CrmGroupUpdateResponse> {

    /**
     * 分组的id<br />
     * 支持最小值为：1<br />
     * 支持的最大列表长度为：19
     */
    private Long groupId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 新的分组名，分组名称不能包含|或者：<br />
     * 支持最大长度为：15<br />
     * 支持的最大列表长度为：15
     */
    private String newGroupName;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(groupId, "groupId");
        RequestCheckUtils.checkMinValue(groupId, 1L, "groupId");
        RequestCheckUtils.checkNotEmpty(newGroupName, "newGroupName");
        RequestCheckUtils.checkMaxLength(newGroupName, 15, "newGroupName");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.crm.group.update";
    }

    public Long getGroupId() {
        return this.groupId;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNewGroupName() {
        return this.newGroupName;
    }

    @Override
    public Class<CrmGroupUpdateResponse> getResponseClass() {
        return CrmGroupUpdateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("group_id", this.groupId);
        txtParams.put("new_group_name", this.newGroupName);
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

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public void setNewGroupName(String newGroupName) {
        this.newGroupName = newGroupName;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
