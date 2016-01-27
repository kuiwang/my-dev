package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 支付宝用户冻结明细信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class AccountFreeze extends TaobaoObject {

    private static final long serialVersionUID = 3486844198469168816L;

    /**
     * 冻结金额
     */
    @ApiField("freeze_amount")
    private String freezeAmount;

    /**
     * 冻结类型名称
     */
    @ApiField("freeze_name")
    private String freezeName;

    /**
     * 冻结类型值
     */
    @ApiField("freeze_type")
    private String freezeType;

    public String getFreezeAmount() {
        return this.freezeAmount;
    }

    public String getFreezeName() {
        return this.freezeName;
    }

    public String getFreezeType() {
        return this.freezeType;
    }

    public void setFreezeAmount(String freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    public void setFreezeName(String freezeName) {
        this.freezeName = freezeName;
    }

    public void setFreezeType(String freezeType) {
        this.freezeType = freezeType;
    }

}
