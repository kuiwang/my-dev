package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 同意退款返回值中一部分，退款编号与结果信息映射类
 *
 * @author auto create
 * @since 1.0, null
 */
public class RefundMappingResult extends TaobaoObject {

    private static final long serialVersionUID = 1276652827787543182L;

    /**
     * 结果信息
     */
    @ApiField("message")
    private String message;

    /**
     * 退款ID
     */
    @ApiField("refund_id")
    private Long refundId;

    /**
     * 是否成功
     */
    @ApiField("succ")
    private Boolean succ;

    public String getMessage() {
        return this.message;
    }

    public Long getRefundId() {
        return this.refundId;
    }

    public Boolean getSucc() {
        return this.succ;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    public void setSucc(Boolean succ) {
        this.succ = succ;
    }

}
