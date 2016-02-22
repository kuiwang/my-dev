package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemConsignmentCreateResponse;

/**
 * TOP API: taobao.wlb.item.consignment.create request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:13
 */
public class WlbItemConsignmentCreateRequest
        implements TaobaoRequest<WlbItemConsignmentCreateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 商品id
     */
    private Long itemId;

    /**
     * 代销数量
     */
    private Long number;

    /**
     * 货主商品id
     */
    private Long ownerItemId;

    /**
     * 货主id
     */
    private Long ownerUserId;

    /**
     * 通过taobao.wlb.item.authorization.add接口创建后得到的rule_id，
     * 规则中设定了代销商可以代销的商品数量
     */
    private Long ruleId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
        RequestCheckUtils.checkNotEmpty(number, "number");
        RequestCheckUtils.checkNotEmpty(ownerItemId, "ownerItemId");
        RequestCheckUtils.checkNotEmpty(ownerUserId, "ownerUserId");
        RequestCheckUtils.checkNotEmpty(ruleId, "ruleId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wlb.item.consignment.create";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public Long getNumber() {
        return this.number;
    }

    public Long getOwnerItemId() {
        return this.ownerItemId;
    }

    public Long getOwnerUserId() {
        return this.ownerUserId;
    }

    @Override
    public Class<WlbItemConsignmentCreateResponse> getResponseClass() {
        return WlbItemConsignmentCreateResponse.class;
    }

    public Long getRuleId() {
        return this.ruleId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_id", this.itemId);
        txtParams.put("number", this.number);
        txtParams.put("owner_item_id", this.ownerItemId);
        txtParams.put("owner_user_id", this.ownerUserId);
        txtParams.put("rule_id", this.ruleId);
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

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public void setOwnerItemId(Long ownerItemId) {
        this.ownerItemId = ownerItemId;
    }

    public void setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
