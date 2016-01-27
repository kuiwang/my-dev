package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TakeoutOption;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.waimai.shop.businessrules.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WaimaiShopBusinessrulesGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6842184439291613612L;

    /**
     * 外卖店铺信息
     */
    @ApiField("result")
    private TakeoutOption result;

    public TakeoutOption getResult() {
        return this.result;
    }

    public void setResult(TakeoutOption result) {
        this.result = result;
    }

}
