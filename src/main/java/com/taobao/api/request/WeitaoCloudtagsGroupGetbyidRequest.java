package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WeitaoCloudtagsGroupGetbyidResponse;

/**
 * TOP API: taobao.weitao.cloudtags.group.getbyid request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:48
 */
public class WeitaoCloudtagsGroupGetbyidRequest implements
        TaobaoRequest<WeitaoCloudtagsGroupGetbyidResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 分组id
     */
    private String groupId;

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.weitao.cloudtags.group.getbyid";
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

    public Class<WeitaoCloudtagsGroupGetbyidResponse> getResponseClass() {
        return WeitaoCloudtagsGroupGetbyidResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(groupId, "groupId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
