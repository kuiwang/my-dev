package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionCouponsGetResponse;

/**
 * TOP API: taobao.promotion.coupons.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:23
 */
public class PromotionCouponsGetRequest implements TaobaoRequest<PromotionCouponsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 优惠券的id，唯一标识这个优惠券
     */
    private Long couponId;

    /**
     * 优惠券的面额，必须是3，5，10，20，50,100<br />
     * 支持最大值为：100<br />
     * 支持最小值为：3
     */
    private Long denominations;

    /**
     * 优惠券的截止日期
     */
    private Date endTime;

    /**
     * 查询的页号，结果集是分页返回的，每页20条<br />
     * 支持最小值为：1
     */
    private Long pageNo;

    /**
     * 每页条数<br />
     * 支持的最大列表长度为：20
     */
    private Long pageSize;

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getCouponId() {
        return this.couponId;
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

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.promotion.coupons.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("coupon_id", this.couponId);
        txtParams.put("denominations", this.denominations);
        txtParams.put("end_time", this.endTime);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
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

    public Class<PromotionCouponsGetResponse> getResponseClass() {
        return PromotionCouponsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(denominations, 100L, "denominations");
        RequestCheckUtils.checkMinValue(denominations, 3L, "denominations");
        RequestCheckUtils.checkMinValue(pageNo, 1L, "pageNo");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
