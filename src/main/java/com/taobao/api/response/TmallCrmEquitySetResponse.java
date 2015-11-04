package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.crm.equity.set response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallCrmEquitySetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7398612936513321711L;

    /**
     * true：成功 false：失败
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
