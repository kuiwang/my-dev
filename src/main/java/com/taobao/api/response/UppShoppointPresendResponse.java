package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.upp.shoppoint.presend response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UppShoppointPresendResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1831166985468955267L;

    /**
     * 是否调用成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    /**
     * 用于实际发放的时候关联系统发放记录,需要调用方保存
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
