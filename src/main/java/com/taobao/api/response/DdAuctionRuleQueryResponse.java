package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.DdTopAuctionRuleVO;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.dd.auction.rule.query response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DdAuctionRuleQueryResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4144443932359534535L;

    /**
     * auction rule vo
     */
    @ApiListField("result")
    @ApiField("dd_top_auction_rule_v_o")
    private List<DdTopAuctionRuleVO> result;

    public void setResult(List<DdTopAuctionRuleVO> result) {
        this.result = result;
    }

    public List<DdTopAuctionRuleVO> getResult() {
        return this.result;
    }

}
