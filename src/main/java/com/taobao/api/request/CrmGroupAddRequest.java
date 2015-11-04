package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmGroupAddResponse;

/**
 * TOP API: taobao.crm.group.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class CrmGroupAddRequest implements TaobaoRequest<CrmGroupAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 分组名称，每个卖家最多可以拥有100个分组<br />
     * 支持最大长度为：15<br />
     * 支持的最大列表长度为：15
     */
    private String groupName;

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.crm.group.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("group_name", this.groupName);
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

    public Class<CrmGroupAddResponse> getResponseClass() {
        return CrmGroupAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(groupName, "groupName");
        RequestCheckUtils.checkMaxLength(groupName, 15, "groupName");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
