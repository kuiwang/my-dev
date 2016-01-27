package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.hotel.order.face.deal response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelOrderFaceDealResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4368671587814716258L;

    /**
     * 处理结果
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
