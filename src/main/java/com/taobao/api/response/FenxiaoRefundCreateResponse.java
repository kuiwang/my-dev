package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.fenxiao.refund.create response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoRefundCreateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4183856154857834955L;

    /**
     * 退款是否创建成功
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
