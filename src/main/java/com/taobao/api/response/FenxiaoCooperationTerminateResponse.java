package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.fenxiao.cooperation.terminate response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoCooperationTerminateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6643171871241269335L;

    /**
     * 操作是否成功
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
