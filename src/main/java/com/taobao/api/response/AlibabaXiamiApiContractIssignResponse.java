package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alibaba.xiami.api.contract.issign response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlibabaXiamiApiContractIssignResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3524643868629255644L;

    /**
     * 是否已经签约
     */
    @ApiField("data")
    private String data;

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
