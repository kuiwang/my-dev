package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TripOrder;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.jipiao.agent.order.detail response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JipiaoAgentOrderDetailResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1293421964265491574L;

    /**
     * 失败时的错误信息
     */
    @ApiField("error_message")
    private String errorMessage;

    /**
     * 返回操作成功失败信息
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    /**
     * 机票订单的详情列表，当前支持返回一个订单
     */
    @ApiListField("orders")
    @ApiField("trip_order")
    private List<TripOrder> orders;

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setOrders(List<TripOrder> orders) {
        this.orders = orders;
    }

    public List<TripOrder> getOrders() {
        return this.orders;
    }

}
