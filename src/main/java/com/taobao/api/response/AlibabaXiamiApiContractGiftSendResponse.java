package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alibaba.xiami.api.contract.gift.send response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlibabaXiamiApiContractGiftSendResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4698724496529183999L;

    /**
     * 礼包订单ID
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
