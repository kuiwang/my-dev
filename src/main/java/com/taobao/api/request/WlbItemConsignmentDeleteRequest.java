package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemConsignmentDeleteResponse;

/**
 * TOP API: taobao.wlb.item.consignment.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:13
 */
public class WlbItemConsignmentDeleteRequest implements
        TaobaoRequest<WlbItemConsignmentDeleteResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 代销商前台宝贝ID
     */
    private Long icItemId;

    /**
     * 货主的物流宝商品ID
     */
    private Long ownerItemId;

    /**
     * 授权关系id
     */
    private Long ruleId;

    public void setIcItemId(Long icItemId) {
        this.icItemId = icItemId;
    }

    public Long getIcItemId() {
        return this.icItemId;
    }

    public void setOwnerItemId(Long ownerItemId) {
        this.ownerItemId = ownerItemId;
    }

    public Long getOwnerItemId() {
        return this.ownerItemId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public Long getRuleId() {
        return this.ruleId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wlb.item.consignment.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("ic_item_id", this.icItemId);
        txtParams.put("owner_item_id", this.ownerItemId);
        txtParams.put("rule_id", this.ruleId);
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

    public Class<WlbItemConsignmentDeleteResponse> getResponseClass() {
        return WlbItemConsignmentDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(icItemId, "icItemId");
        RequestCheckUtils.checkNotEmpty(ownerItemId, "ownerItemId");
        RequestCheckUtils.checkNotEmpty(ruleId, "ruleId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
