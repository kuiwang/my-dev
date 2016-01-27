package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.brandservice.isfan.query response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class BrandserviceIsfanQueryResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5525627441356751477L;

    /**
     * 返回相应的数值
     */
    @ApiField("value")
    private Boolean value;

    public Boolean getValue() {
        return this.value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }

}
