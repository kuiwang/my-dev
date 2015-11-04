package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmMembersGroupBatchaddResponse;

/**
 * TOP API: taobao.crm.members.group.batchadd request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class CrmMembersGroupBatchaddRequest implements
        TaobaoRequest<CrmMembersGroupBatchaddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 会员的id（一次最多传入10个）<br />
     * 支持最小值为：1
     */
    private String buyerIds;

    /**
     * 分组id<br />
     * 支持最小值为：1
     */
    private String groupIds;

    public void setBuyerIds(String buyerIds) {
        this.buyerIds = buyerIds;
    }

    public String getBuyerIds() {
        return this.buyerIds;
    }

    public void setGroupIds(String groupIds) {
        this.groupIds = groupIds;
    }

    public String getGroupIds() {
        return this.groupIds;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.crm.members.group.batchadd";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("buyer_ids", this.buyerIds);
        txtParams.put("group_ids", this.groupIds);
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

    public Class<CrmMembersGroupBatchaddResponse> getResponseClass() {
        return CrmMembersGroupBatchaddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(buyerIds, "buyerIds");
        RequestCheckUtils.checkMaxListSize(buyerIds, 10, "buyerIds");
        RequestCheckUtils.checkNotEmpty(groupIds, "groupIds");
        RequestCheckUtils.checkMaxListSize(groupIds, 10, "groupIds");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
