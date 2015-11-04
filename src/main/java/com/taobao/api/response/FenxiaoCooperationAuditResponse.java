package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.fenxiao.cooperation.audit response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoCooperationAuditResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2575834398617163116L;

    /**
     * 操作是否成功
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
