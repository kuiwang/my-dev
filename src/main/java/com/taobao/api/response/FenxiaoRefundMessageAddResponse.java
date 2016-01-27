package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.fenxiao.refund.message.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoRefundMessageAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6123232191298218561L;

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
