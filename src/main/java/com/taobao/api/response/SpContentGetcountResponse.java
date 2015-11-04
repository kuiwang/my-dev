package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.sp.content.getcount response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SpContentGetcountResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5869798841332257944L;

    /**
     * 返回记录数
     */
    @ApiField("value")
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
