package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.DdTopPaginationForAgentOrder;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.waimai.agent.orderlist.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WaimaiAgentOrderlistGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4714825721828296974L;

    /**
     * 代送商订单分页结果
     */
    @ApiField("result")
    private DdTopPaginationForAgentOrder result;

    public void setResult(DdTopPaginationForAgentOrder result) {
        this.result = result;
    }

    public DdTopPaginationForAgentOrder getResult() {
        return this.result;
    }

}
