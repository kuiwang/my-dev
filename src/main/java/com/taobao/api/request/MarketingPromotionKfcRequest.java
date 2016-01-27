package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.MarketingPromotionKfcResponse;

/**
 * TOP API: taobao.marketing.promotion.kfc request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:23
 */
public class MarketingPromotionKfcRequest implements TaobaoRequest<MarketingPromotionKfcResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 活动描述
     */
    private String promotionDesc;

    /**
     * 活动名称
     */
    private String promotionTitle;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(promotionDesc, "promotionDesc");
        RequestCheckUtils.checkNotEmpty(promotionTitle, "promotionTitle");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.marketing.promotion.kfc";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getPromotionDesc() {
        return this.promotionDesc;
    }

    public String getPromotionTitle() {
        return this.promotionTitle;
    }

    @Override
    public Class<MarketingPromotionKfcResponse> getResponseClass() {
        return MarketingPromotionKfcResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("promotion_desc", this.promotionDesc);
        txtParams.put("promotion_title", this.promotionTitle);
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

    public void setPromotionDesc(String promotionDesc) {
        this.promotionDesc = promotionDesc;
    }

    public void setPromotionTitle(String promotionTitle) {
        this.promotionTitle = promotionTitle;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
