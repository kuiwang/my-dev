package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 发放成功的优惠券的信息，包括couponNumber和buyerNick
 *
 * @author auto create
 * @since 1.0, null
 */
public class CouponResult extends TaobaoObject {

    private static final long serialVersionUID = 8366422396945986761L;

    /**
     * 张三
     */
    @ApiField("buyer_nick")
    private String buyerNick;

    /**
     * 已经发放优惠券的编号
     */
    @ApiField("coupon_number")
    private Long couponNumber;

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public Long getCouponNumber() {
        return this.couponNumber;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public void setCouponNumber(Long couponNumber) {
        this.couponNumber = couponNumber;
    }

}
