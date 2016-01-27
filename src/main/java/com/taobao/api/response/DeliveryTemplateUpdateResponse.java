package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.delivery.template.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DeliveryTemplateUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2849258325687194641L;

    /**
     * 表示修改是否成功
     */
    @ApiField("complete")
    private Boolean complete;

    public Boolean getComplete() {
        return this.complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

}
