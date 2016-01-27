package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TmallRateInfo;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.traderate.feeds.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallTraderateFeedsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6478347171848835461L;

    /**
     * 返回评价信息
     */
    @ApiField("tmall_rate_info")
    private TmallRateInfo tmallRateInfo;

    public TmallRateInfo getTmallRateInfo() {
        return this.tmallRateInfo;
    }

    public void setTmallRateInfo(TmallRateInfo tmallRateInfo) {
        this.tmallRateInfo = tmallRateInfo;
    }

}
