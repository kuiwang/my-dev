package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.lato.game.recharge response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallLatoGameRechargeResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2679528722973188971L;

    /**
     * 错误码
     */
    @ApiField("code")
    private String code;

    /**
     * 调用是否成功
     */
    @ApiField("succ")
    private Boolean succ;

    public String getCode() {
        return this.code;
    }

    public Boolean getSucc() {
        return this.succ;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSucc(Boolean succ) {
        this.succ = succ;
    }

}
