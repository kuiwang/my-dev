package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.tmc.group.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmcGroupDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3396444197753682412L;

    /**
     * 是否成功
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
