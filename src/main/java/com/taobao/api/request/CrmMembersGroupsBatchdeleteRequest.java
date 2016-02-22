package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmMembersGroupsBatchdeleteResponse;

/**
 * TOP API: taobao.crm.members.groups.batchdelete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class CrmMembersGroupsBatchdeleteRequest
        implements TaobaoRequest<CrmMembersGroupsBatchdeleteResponse> {

    /**
     * 买家的Id集合<br />
     * 支持最小值为：1
     */
    private String buyerIds;

    /**
     * 会员需要删除的分组<br />
     * 支持最小值为：1
     */
    private String groupIds;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(buyerIds, "buyerIds");
        RequestCheckUtils.checkMaxListSize(buyerIds, 10, "buyerIds");
        RequestCheckUtils.checkNotEmpty(groupIds, "groupIds");
        RequestCheckUtils.checkMaxListSize(groupIds, 10, "groupIds");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.crm.members.groups.batchdelete";
    }

    public String getBuyerIds() {
        return this.buyerIds;
    }

    public String getGroupIds() {
        return this.groupIds;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<CrmMembersGroupsBatchdeleteResponse> getResponseClass() {
        return CrmMembersGroupsBatchdeleteResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("buyer_ids", this.buyerIds);
        txtParams.put("group_ids", this.groupIds);
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

    public void setBuyerIds(String buyerIds) {
        this.buyerIds = buyerIds;
    }

    public void setGroupIds(String groupIds) {
        this.groupIds = groupIds;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
