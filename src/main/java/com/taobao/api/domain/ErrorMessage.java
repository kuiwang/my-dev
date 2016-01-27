package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 未发放成功买家昵称，发放失败原因
 *
 * @author auto create
 * @since 1.0, null
 */
public class ErrorMessage extends TaobaoObject {

    private static final long serialVersionUID = 5239961843754315186L;

    /**
     * 买家昵称
     */
    @ApiField("buyer_nick")
    private String buyerNick;

    /**
     * 发送失败的原因
     */
    @ApiField("reason")
    private String reason;

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public String getReason() {
        return this.reason;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
