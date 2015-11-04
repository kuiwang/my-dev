package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TakeoutShop;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.waimai.shop.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WaimaiShopGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5753249769743338362L;

    /**
     * 外卖店信息
     */
    @ApiField("result")
    private TakeoutShop result;

    public void setResult(TakeoutShop result) {
        this.result = result;
    }

    public TakeoutShop getResult() {
        return this.result;
    }

}
