package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionLimitdiscountDetailGetResponse;

/**
 * TOP API: taobao.promotion.limitdiscount.detail.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:23
 */
public class PromotionLimitdiscountDetailGetRequest implements
        TaobaoRequest<PromotionLimitdiscountDetailGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 限时打折ID。这个针对查询唯一限时打折情况。
     */
    private Long limitDiscountId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(limitDiscountId, "limitDiscountId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.promotion.limitdiscount.detail.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getLimitDiscountId() {
        return this.limitDiscountId;
    }

    @Override
    public Class<PromotionLimitdiscountDetailGetResponse> getResponseClass() {
        return PromotionLimitdiscountDetailGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("limit_discount_id", this.limitDiscountId);
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

    public void setLimitDiscountId(Long limitDiscountId) {
        this.limitDiscountId = limitDiscountId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
