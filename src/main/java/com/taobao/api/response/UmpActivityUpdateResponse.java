package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ump.activity.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UmpActivityUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6392572496137571174L;

    /**
     * 调用是否成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

}
