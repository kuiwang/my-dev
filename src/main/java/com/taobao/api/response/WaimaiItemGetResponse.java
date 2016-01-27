package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TopAuction;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.waimai.item.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WaimaiItemGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4445483559259512776L;

    /**
     * 外卖宝贝详情
     */
    @ApiField("result")
    private TopAuction result;

    public TopAuction getResult() {
        return this.result;
    }

    public void setResult(TopAuction result) {
        this.result = result;
    }

}
