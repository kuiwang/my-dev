package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemConsignmentPageGetResponse;

/**
 * TOP API: taobao.wlb.item.consignment.page.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:13
 */
public class WlbItemConsignmentPageGetRequest implements
        TaobaoRequest<WlbItemConsignmentPageGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 代销商宝贝id
     */
    private Long icItemId;

    /**
     * 供应商商品id
     */
    private Long ownerItemId;

    /**
     * 供应商用户昵称
     */
    private String ownerUserNick;

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

    public void setOwnerUserNick(String ownerUserNick) {
        this.ownerUserNick = ownerUserNick;
    }

    public String getOwnerUserNick() {
        return this.ownerUserNick;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wlb.item.consignment.page.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("ic_item_id", this.icItemId);
        txtParams.put("owner_item_id", this.ownerItemId);
        txtParams.put("owner_user_nick", this.ownerUserNick);
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

    public Class<WlbItemConsignmentPageGetResponse> getResponseClass() {
        return WlbItemConsignmentPageGetResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
