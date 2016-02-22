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
public class WlbItemCombinationDeleteRequest
        implements TaobaoRequest<WlbItemCombinationDeleteResponse> {

    /**
     * 组合商品的id列表
     */
    private String destItemList;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 组合关系的商品id
     */
    private Long itemId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(destItemList, "destItemList");
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wlb.item.combination.delete";
    }

    public String getDestItemList() {
        return this.destItemList;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getItemId() {
        return this.itemId;
    }

    @Override
    public Class<WlbItemCombinationDeleteResponse> getResponseClass() {
        return WlbItemCombinationDeleteResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("dest_item_list", this.destItemList);
        txtParams.put("item_id", this.itemId);
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

    public void setDestItemList(String destItemList) {
        this.destItemList = destItemList;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
