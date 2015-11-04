package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbInventorySyncResponse;

/**
 * TOP API: taobao.wlb.inventory.sync request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class WlbInventorySyncRequest implements TaobaoRequest<WlbInventorySyncResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 商品ID
     */
    private Long itemId;

    /**
     * 外部实体类型.存如下值 IC_ITEM --表示IC商品; IC_SKU --表示IC最小单位商品; WLB_ITEM
     * --表示WLB商品. 若值不在范围内，则按WLB_ITEM处理
     */
    private String itemType;

    /**
     * 库存数量
     */
    private Long quantity;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemType() {
        return this.itemType;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wlb.inventory.sync";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_id", this.itemId);
        txtParams.put("item_type", this.itemType);
        txtParams.put("quantity", this.quantity);
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

    public Class<WlbInventorySyncResponse> getResponseClass() {
        return WlbInventorySyncResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
        RequestCheckUtils.checkNotEmpty(itemType, "itemType");
        RequestCheckUtils.checkNotEmpty(quantity, "quantity");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
