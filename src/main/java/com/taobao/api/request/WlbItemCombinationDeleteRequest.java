package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemCombinationDeleteResponse;

/**
 * TOP API: taobao.wlb.item.combination.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:13
 */
public class WlbItemCombinationDeleteRequest implements
        TaobaoRequest<WlbItemCombinationDeleteResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 组合商品的id列表
     */
    private String destItemList;

    /**
     * 组合关系的商品id
     */
    private Long itemId;

    public void setDestItemList(String destItemList) {
        this.destItemList = destItemList;
    }

    public String getDestItemList() {
        return this.destItemList;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wlb.item.combination.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("dest_item_list", this.destItemList);
        txtParams.put("item_id", this.itemId);
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

    public Class<WlbItemCombinationDeleteResponse> getResponseClass() {
        return WlbItemCombinationDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(destItemList, "destItemList");
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
