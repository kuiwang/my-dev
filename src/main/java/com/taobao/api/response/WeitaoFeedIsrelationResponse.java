package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.weitao.feed.isrelation response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WeitaoFeedIsrelationResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3117682736814892746L;

    /**
     * 是否关注
     */
    @ApiField("result")
    private Long result;

    public Long getResult() {
        return this.result;
    }

    public void setResult(Long result) {
        this.result = result;
    }

}
