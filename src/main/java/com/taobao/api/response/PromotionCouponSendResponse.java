package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CouponResult;
import com.taobao.api.domain.ErrorMessage;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.promotion.coupon.send response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionCouponSendResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3692444854937952442L;

    /**
     * 发送成功的买家的昵称和优惠券的number
     */
    @ApiListField("coupon_results")
    @ApiField("coupon_result")
    private List<CouponResult> couponResults;

    /**
     * 没有发送成功的买家
     */
    @ApiListField("failure_buyers")
    @ApiField("error_message")
    private List<ErrorMessage> failureBuyers;

    /**
     * true 成功，false失败
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    public void setCouponResults(List<CouponResult> couponResults) {
        this.couponResults = couponResults;
    }

    public List<CouponResult> getCouponResults() {
        return this.couponResults;
    }

    public void setFailureBuyers(List<ErrorMessage> failureBuyers) {
        this.failureBuyers = failureBuyers;
    }

    public List<ErrorMessage> getFailureBuyers() {
        return this.failureBuyers;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

}
