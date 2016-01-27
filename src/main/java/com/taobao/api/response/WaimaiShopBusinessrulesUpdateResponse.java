package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.waimai.shop.businessrules.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WaimaiShopBusinessrulesUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4674644784431766157L;

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
