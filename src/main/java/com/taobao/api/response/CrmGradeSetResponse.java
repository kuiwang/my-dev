package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.crm.grade.set response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmGradeSetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2165354172379249224L;

    /**
     * true：成功 false：失败
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
