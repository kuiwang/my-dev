package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Refund;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.refund.refuse response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class RefundRefuseResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5797725443687848764L;

    /**
     * 拒绝退款操作是否成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    /**
     * 拒绝退款成功后，会返回Refund数据结构中的refund_id, status, modified字段
     */
    @ApiField("refund")
    private Refund refund;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setRefund(Refund refund) {
        this.refund = refund;
    }

    public Refund getRefund() {
        return this.refund;
    }

}
