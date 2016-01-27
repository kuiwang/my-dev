package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.waimai.shop.open response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WaimaiShopOpenResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3464699866349484863L;

    /**
     * 成功：0，失败：1
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
