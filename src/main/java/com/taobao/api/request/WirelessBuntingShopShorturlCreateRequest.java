package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WirelessBuntingShopShorturlCreateResponse;

/**
 * TOP API: taobao.wireless.bunting.shop.shorturl.create request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:49
 */
public class WirelessBuntingShopShorturlCreateRequest implements
        TaobaoRequest<WirelessBuntingShopShorturlCreateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 商店id
     */
    private String shopId;

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopId() {
        return this.shopId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wireless.bunting.shop.shorturl.create";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("shop_id", this.shopId);
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

    public Class<WirelessBuntingShopShorturlCreateResponse> getResponseClass() {
        return WirelessBuntingShopShorturlCreateResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
