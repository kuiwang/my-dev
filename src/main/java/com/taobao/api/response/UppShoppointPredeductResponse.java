package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.upp.shoppoint.prededuct response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UppShoppointPredeductResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3349891496992267123L;

    /**
     * 是否调用成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    /**
     * 用于实际扣减的时候关联系统扣减记录,需要调用方保存。
     */
    @ApiField("transaction_id")
    private Long transactionId;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getTransactionId() {
        return this.transactionId;
    }

}
