package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alibaba.interact.sensor.authorize response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlibabaInteractSensorAuthorizeResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2425965938481173414L;

    /**
     * return=0 表示成功
     */
    @ApiField("result")
    private String result;

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return this.result;
    }

}
