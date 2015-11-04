package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AtNSearchResult;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.trip.jipiao.nsearch.ow.search response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TripJipiaoNsearchOwSearchResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6613779347851928155L;

    /**
     * 航班搜索结果对象
     */
    @ApiField("result")
    private AtNSearchResult result;

    public void setResult(AtNSearchResult result) {
        this.result = result;
    }

    public AtNSearchResult getResult() {
        return this.result;
    }

}
