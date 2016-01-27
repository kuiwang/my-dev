package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.sp.content.getpage response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SpContentGetpageResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1269966882666478733L;

    /**
     * JSON格式的
     */
    @ApiField("value")
    private String value;

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
