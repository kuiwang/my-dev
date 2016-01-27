package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.sp.content.custom.publish response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SpContentCustomPublishResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1236472159214144785L;

    /**
     * 主键ID
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
