package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.weitao.feed.remained response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WeitaoFeedRemainedResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3369937373924335134L;

    /**
     * 今天还能发送多少条Feed
     */
    @ApiField("remained_count")
    private Long remainedCount;

    /**
     * 今天发送的Feed的数目
     */
    @ApiField("send_count")
    private Long sendCount;

    public Long getRemainedCount() {
        return this.remainedCount;
    }

    public Long getSendCount() {
        return this.sendCount;
    }

    public void setRemainedCount(Long remainedCount) {
        this.remainedCount = remainedCount;
    }

    public void setSendCount(Long sendCount) {
        this.sendCount = sendCount;
    }

}
