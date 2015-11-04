package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ump.activity.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UmpActivityDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2758391472384359856L;

    /**
     * 调用是否成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

}
