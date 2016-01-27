package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SubscInfoWrapper;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.weike.subscinfo.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WeikeSubscinfoGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5864272146973555527L;

    /**
     * 返回结果
     */
    @ApiField("result")
    private SubscInfoWrapper result;

    public SubscInfoWrapper getResult() {
        return this.result;
    }

    public void setResult(SubscInfoWrapper result) {
        this.result = result;
    }

}
