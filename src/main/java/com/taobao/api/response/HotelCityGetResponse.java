package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.hotel.city.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelCityGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4169247528264833466L;

    /**
     * 返回结果
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
