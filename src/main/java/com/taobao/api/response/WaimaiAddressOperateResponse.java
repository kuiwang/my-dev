package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.waimai.address.operate response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WaimaiAddressOperateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5565169993286376592L;

    /**
     * 是一个JSON
     */
    @ApiField("result")
    private String result;

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
