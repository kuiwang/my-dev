package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.trade.waimai.refuse response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TradeWaimaiRefuseResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4115757415869348671L;

    /**
     * 0:失败 1:成功
     */
    @ApiField("ret_code")
    private String retCode;

    public String getRetCode() {
        return this.retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

}
