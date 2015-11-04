package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TakeoutThirdOrder;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.waimai.order.single.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WaimaiOrderSingleGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8875987213492987773L;

    /**
     * 订单详情
     */
    @ApiField("result")
    private TakeoutThirdOrder result;

    public void setResult(TakeoutThirdOrder result) {
        this.result = result;
    }

    public TakeoutThirdOrder getResult() {
        return this.result;
    }

}
