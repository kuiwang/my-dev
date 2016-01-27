package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ImprFeedIdDO;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.traderate.impr.imprword.byfeedid.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TraderateImprImprwordByfeedidGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5314799244338549962L;

    /**
     * 根据子订单和买家昵称找到的评价和印象词结果
     */
    @ApiField("impr_feed")
    private ImprFeedIdDO imprFeed;

    public ImprFeedIdDO getImprFeed() {
        return this.imprFeed;
    }

    public void setImprFeed(ImprFeedIdDO imprFeed) {
        this.imprFeed = imprFeed;
    }

}
