package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionCouponSnsSendResponse;

/**
 * TOP API: taobao.promotion.coupon.sns.send request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:23
 */
public class PromotionCouponSnsSendRequest implements TaobaoRequest<PromotionCouponSnsSendResponse> {

    /**
     * 买家昵称用半角','号分割
     */
    private String buyerNick;

    /**
     * 优惠券的id
     */
    private Long couponId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(buyerNick, "buyerNick");
        RequestCheckUtils.checkMaxListSize(buyerNick, 100, "buyerNick");
        RequestCheckUtils.checkNotEmpty(couponId, "couponId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.promotion.coupon.sns.send";
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public Long getCouponId() {
        return this.couponId;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<PromotionCouponSnsSendResponse> getResponseClass() {
        return PromotionCouponSnsSendResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("buyer_nick", this.buyerNick);
        txtParams.put("coupon_id", this.couponId);
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

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
