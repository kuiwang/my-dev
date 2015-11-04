package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.jds.hluser.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JdsHluserUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6877194963377266415L;

    /**
     * 是否成功
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
