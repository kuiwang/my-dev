package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WeitaoCloudtagsGroupDeleteResponse;

/**
 * TOP API: taobao.weitao.cloudtags.group.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:48
 */
public class WeitaoCloudtagsGroupDeleteRequest implements
        TaobaoRequest<WeitaoCloudtagsGroupDeleteResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 需要删除的用户分组ID，必须为当前操作用户的粉丝分组ID<br />
     * 支持最小值为：1
     */
    private Long groupId;

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.weitao.cloudtags.group.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("group_id", this.groupId);
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

    public Class<WeitaoCloudtagsGroupDeleteResponse> getResponseClass() {
        return WeitaoCloudtagsGroupDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(groupId, "groupId");
        RequestCheckUtils.checkMinValue(groupId, 1L, "groupId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
