package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SpShopInfoGetResponse;

/**
 * TOP API: taobao.sp.shop.info.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:50
 */
public class SpShopInfoGetRequest implements TaobaoRequest<SpShopInfoGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 卖家Nick对应的Userid
     */
    private Long sellerId;

    /**
     * 每个站点的唯一Key(加密的site id)
     */
    private String siteKey;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(sellerId, "sellerId");
        RequestCheckUtils.checkNotEmpty(siteKey, "siteKey");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.sp.shop.info.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<SpShopInfoGetResponse> getResponseClass() {
        return SpShopInfoGetResponse.class;
    }

    public Long getSellerId() {
        return this.sellerId;
    }

    public String getSiteKey() {
        return this.siteKey;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("seller_id", this.sellerId);
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

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public void setSiteKey(String siteKey) {
        this.siteKey = siteKey;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
