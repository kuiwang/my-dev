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

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
        RequestCheckUtils.checkNotEmpty(itemType, "itemType");
        RequestCheckUtils.checkNotEmpty(quantity, "quantity");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wlb.inventory.sync";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public String getItemType() {
        return this.itemType;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    @Override
    public Class<WlbInventorySyncResponse> getResponseClass() {
        return WlbInventorySyncResponse.class;
    }

    @Override
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

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
