package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.dd.auction.rule.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DdAuctionRuleDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4835814261646462632L;

    /**
     * 操作结果
     */
    @ApiField("result")
    private Boolean result;

    public void setResult(Boolean result) {
        this.result = result;
    }

    public Boolean getResult() {
        return this.result;
    }

}
