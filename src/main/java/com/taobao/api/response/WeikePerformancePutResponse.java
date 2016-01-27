package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.weike.performance.put response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WeikePerformancePutResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7377297856994469929L;

    /**
     * 返回结果
     */
    @ApiField("result")
    private Boolean result;

    public Boolean getResult() {
        return this.result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

}
