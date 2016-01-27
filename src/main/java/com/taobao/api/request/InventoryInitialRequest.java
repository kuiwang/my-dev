package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.InventoryInitialResponse;

/**
 * TOP API: taobao.inventory.initial request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class InventoryInitialRequest implements TaobaoRequest<InventoryInitialResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 商品初始库存信息：
     * [{"scItemId":"商品后端ID，如果有传scItemCode,参数可以为0","scItemCode":"商品商家编码"
     * ,"inventoryType"
     * :"库存类型  1：正常,2：损坏,3：冻结,10：质押,11-20:用户自定义","quantity":"数量"}]
     */
    private String items;

    /**
     * 商家仓库编码
     */
    private String storeCode;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(items, "items");
        RequestCheckUtils.checkNotEmpty(storeCode, "storeCode");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.inventory.initial";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getItems() {
        return this.items;
    }

    @Override
    public Class<InventoryInitialResponse> getResponseClass() {
        return InventoryInitialResponse.class;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("items", this.items);
        txtParams.put("store_code", this.storeCode);
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

    public void setItems(String items) {
        this.items = items;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
