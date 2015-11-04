package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ump.detail.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UmpDetailDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3631784592563181449L;

    /**
     * 是否成功
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
