package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.dd.auction.rule.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DdAuctionRuleUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2863453325424762676L;

    /**
     * 规则id
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
