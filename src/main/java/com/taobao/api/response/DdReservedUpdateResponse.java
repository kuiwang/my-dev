package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.dd.reserved.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DdReservedUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6847654534888954654L;

    /**
     * 是否更新成功
     */
    @ApiField("result")
    private Boolean result;

    public void setResult(Boolean result) {
        this.result = result;
    }

    public Boolean getResult() {
        return this.result;
    }

}
