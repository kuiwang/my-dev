package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.sp.content.getalltag response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SpContentGetalltagResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8719644172455873364L;

    /**
     * 返回JSON格式的TagName列表
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
