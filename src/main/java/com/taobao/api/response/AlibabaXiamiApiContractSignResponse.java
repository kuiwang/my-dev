package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alibaba.xiami.api.contract.sign response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlibabaXiamiApiContractSignResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7331763954588489671L;

    /**
     * 签约链接
     */
    @ApiField("data")
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

}
