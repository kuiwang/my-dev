package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmGroupAppendResponse;

/**
 * TOP API: taobao.crm.group.append request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class CrmGroupAppendRequest implements TaobaoRequest<CrmGroupAppendResponse> {

    /**
     * 添加的来源分组<br />
     * 支持最小值为：1<br />
     * 支持的最大列表长度为：19
     */
    private Long fromGroupId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    /**
     * 添加的目标分组<br />
     * 支持最小值为：1<br />
     * 支持的最大列表长度为：19
     */
    private Long toGroupId;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fromGroupId, "fromGroupId");
        RequestCheckUtils.checkMinValue(fromGroupId, 1L, "fromGroupId");
        RequestCheckUtils.checkNotEmpty(toGroupId, "toGroupId");
        RequestCheckUtils.checkMinValue(toGroupId, 1L, "toGroupId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.crm.group.append";
    }

    public Long getFromGroupId() {
        return this.fromGroupId;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<CrmGroupAppendResponse> getResponseClass() {
        return CrmGroupAppendResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("from_group_id", this.fromGroupId);
        txtParams.put("to_group_id", this.toGroupId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public Long getToGroupId() {
        return this.toGroupId;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setFromGroupId(Long fromGroupId) {
        this.fromGroupId = fromGroupId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setToGroupId(Long toGroupId) {
        this.toGroupId = toGroupId;
    }
}
