package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.dd.auction.rule.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DdAuctionRuleAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3513654863164829648L;

    /**
     * 新增add规则ID
     */
    @ApiField("result")
    private Long result;

    public void setResult(Long result) {
        this.result = result;
    }

    public Long getResult() {
        return this.result;
    }

}
