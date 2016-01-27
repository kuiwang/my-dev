package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.tmc.messages.confirm response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmcMessagesConfirmResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2273194185494193224L;

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
