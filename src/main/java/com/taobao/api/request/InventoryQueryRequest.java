package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.InventoryQueryResponse;

/**
 * TOP API: taobao.inventory.query request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class InventoryQueryRequest implements TaobaoRequest<InventoryQueryResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 后端商品的商家编码列表，控制到50个
     */
    private String scItemCodes;

    /**
     * 后端商品ID 列表，控制到50个
     */
    private String scItemIds;

    /**
     * 卖家昵称
     */
    private String sellerNick;

    /**
     * 仓库列表:GLY001^GLY002
     */
    private String storeCodes;

    public void setScItemCodes(String scItemCodes) {
        this.scItemCodes = scItemCodes;
    }

    public String getScItemCodes() {
        return this.scItemCodes;
    }

    public void setScItemIds(String scItemIds) {
        this.scItemIds = scItemIds;
    }

    public String getScItemIds() {
        return this.scItemIds;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public String getSellerNick() {
        return this.sellerNick;
    }

    public void setStoreCodes(String storeCodes) {
        this.storeCodes = storeCodes;
    }

    public String getStoreCodes() {
        return this.storeCodes;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.inventory.query";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("sc_item_codes", this.scItemCodes);
        txtParams.put("sc_item_ids", this.scItemIds);
        txtParams.put("seller_nick", this.sellerNick);
        txtParams.put("store_codes", this.storeCodes);
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

    public Class<InventoryQueryResponse> getResponseClass() {
        return InventoryQueryResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(scItemIds, "scItemIds");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
