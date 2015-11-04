package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.sp.content.deleteclass response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SpContentDeleteclassResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4551725293187187698L;

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
