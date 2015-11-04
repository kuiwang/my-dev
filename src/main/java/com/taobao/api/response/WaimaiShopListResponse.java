package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TakeoutShopPage;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.waimai.shop.list response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WaimaiShopListResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3135662796937245946L;

    /**
     * 数据结果集
     */
    @ApiField("result")
    private TakeoutShopPage result;

    public void setResult(TakeoutShopPage result) {
        this.result = result;
    }

    public TakeoutShopPage getResult() {
        return this.result;
    }

}
