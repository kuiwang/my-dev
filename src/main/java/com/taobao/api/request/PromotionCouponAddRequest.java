package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionCouponAddResponse;

/**
 * TOP API: taobao.promotion.coupon.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:23
 */
public class PromotionCouponAddRequest implements TaobaoRequest<PromotionCouponAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 订单满多少元才能用这个优惠券，500就是满500元才能使用
     */
    private Long condition;

    /**
     * 优惠券的面额，必须是3，5，10，20，50，100<br />
     * 支持最大值为：100<br />
     * 支持最小值为：3
     */
    private Long denominations;

    /**
     * 优惠券的截止日期
     */
    private Date endTime;

    /**
     * 优惠券的生效时间
     */
    private Date startTime;

    public void setCondition(Long condition) {
        this.condition = condition;
    }

    public Long getCondition() {
        return this.condition;
    }

    public void setDenominations(Long denominations) {
        this.denominations = denominations;
    }

    public Long getDenominations() {
        return this.denominations;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.promotion.coupon.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("condition", this.condition);
        txtParams.put("denominations", this.denominations);
        txtParams.put("end_time", this.endTime);
        txtParams.put("start_time", this.startTime);
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

    public Class<PromotionCouponAddResponse> getResponseClass() {
        return PromotionCouponAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(denominations, "denominations");
        RequestCheckUtils.checkMaxValue(denominations, 100L, "denominations");
        RequestCheckUtils.checkMinValue(denominations, 3L, "denominations");
        RequestCheckUtils.checkNotEmpty(endTime, "endTime");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
