package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.fenxiao.refund.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoRefundUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3469193663534619245L;

    /**
     * 退款是否修改成功
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
