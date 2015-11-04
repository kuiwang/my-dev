package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WeitaoCloudtagsGroupAddResponse;

/**
 * TOP API: taobao.weitao.cloudtags.group.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:48
 */
public class WeitaoCloudtagsGroupAddRequest implements
        TaobaoRequest<WeitaoCloudtagsGroupAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 分组的sql
     */
    private String expression;

    /**
     * 组的描述<br />
     * 支持最大长度为：100<br />
     * 支持的最大列表长度为：100
     */
    private String groupDesc;

    /**
     * 组的名字<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String groupName;

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return this.expression;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    public String getGroupDesc() {
        return this.groupDesc;
    }

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
        return "taobao.weitao.cloudtags.group.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("expression", this.expression);
        txtParams.put("group_desc", this.groupDesc);
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

    public Class<WeitaoCloudtagsGroupAddResponse> getResponseClass() {
        return WeitaoCloudtagsGroupAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(expression, "expression");
        RequestCheckUtils.checkNotEmpty(groupDesc, "groupDesc");
        RequestCheckUtils.checkMaxLength(groupDesc, 100, "groupDesc");
        RequestCheckUtils.checkNotEmpty(groupName, "groupName");
        RequestCheckUtils.checkMaxLength(groupName, 32, "groupName");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
