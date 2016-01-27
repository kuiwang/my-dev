package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.logistics.consign.order.createandsend response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class LogisticsConsignOrderCreateandsendResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2877278252382584596L;

    /**
     * 是否成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    /**
     * 订单ID
     */
    @ApiField("order_id")
    private Long orderId;

    /**
     * 结果描述
     */
    @ApiField("result_desc")
    private String resultDesc;

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public String getResultDesc() {
        return this.resultDesc;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

}
