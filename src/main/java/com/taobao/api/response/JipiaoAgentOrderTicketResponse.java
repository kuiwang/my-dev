package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.jipiao.agent.order.ticket response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JipiaoAgentOrderTicketResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8851366137231513782L;

    /**
     * 失败时的错误信息
     */
    @ApiField("error_message")
    private String errorMessage;

    /**
     * 返回接口调用完成后，整个订单是否成功
     */
    @ApiField("is_order_success")
    private Boolean isOrderSuccess;

    /**
     * 返回操作成功失败信息
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    /**
     * 返回回填票号操作成功失败信息
     */
    @ApiField("is_ticket_success")
    private Boolean isTicketSuccess;

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Boolean getIsOrderSuccess() {
        return this.isOrderSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public Boolean getIsTicketSuccess() {
        return this.isTicketSuccess;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setIsOrderSuccess(Boolean isOrderSuccess) {
        this.isOrderSuccess = isOrderSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public void setIsTicketSuccess(Boolean isTicketSuccess) {
        this.isTicketSuccess = isTicketSuccess;
    }

}
