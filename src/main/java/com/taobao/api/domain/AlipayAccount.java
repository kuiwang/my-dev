package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 支付宝用户账户信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class AlipayAccount extends TaobaoObject {

    private static final long serialVersionUID = 3183745482154841686L;

    /**
     * 支付宝用户ID
     */
    @ApiField("alipay_user_id")
    private String alipayUserId;

    /**
     * 可用余额
     */
    @ApiField("available_amount")
    private String availableAmount;

    /**
     * 不可用余额
     */
    @ApiField("freeze_amount")
    private String freezeAmount;

    /**
     * 余额总额
     */
    @ApiField("total_amount")
    private String totalAmount;

    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public String getAvailableAmount() {
        return this.availableAmount;
    }

    public String getFreezeAmount() {
        return this.freezeAmount;
    }

    public String getTotalAmount() {
        return this.totalAmount;
    }

    public void setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
    }

    public void setAvailableAmount(String availableAmount) {
        this.availableAmount = availableAmount;
    }

    public void setFreezeAmount(String freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

}
