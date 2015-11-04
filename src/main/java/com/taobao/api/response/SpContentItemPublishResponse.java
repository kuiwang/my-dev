package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.sp.content.item.publish response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SpContentItemPublishResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3889432363161668171L;

    /**
     * 主键ID
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
