package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SpShopExtraInfoGetResponse;

/**
 * TOP API: taobao.sp.shop.extra.info.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:50
 */
public class SpShopExtraInfoGetRequest implements TaobaoRequest<SpShopExtraInfoGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 店铺编号。shop+sid.taobao.com即店铺地址，如shop123456.taobao.com
     */
    private Long shopId;

    /**
     * 每个站点的唯一Key(加密的site id)
     */
    private String siteKey;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(shopId, "shopId");
        RequestCheckUtils.checkNotEmpty(siteKey, "siteKey");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.sp.shop.extra.info.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<SpShopExtraInfoGetResponse> getResponseClass() {
        return SpShopExtraInfoGetResponse.class;
    }

    public Long getShopId() {
        return this.shopId;
    }

    public String getSiteKey() {
        return this.siteKey;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("shop_id", this.shopId);
        txtParams.put("site_key", this.siteKey);
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

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public void setSiteKey(String siteKey) {
        this.siteKey = siteKey;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
