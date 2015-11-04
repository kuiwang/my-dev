package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.logistics.info.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class LogisticsInfoGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5727366759619837133L;

    /**
     * 是否成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    /**
     * 交易成交价格
     */
    @ApiField("received_payment")
    private String receivedPayment;

    /**
     * 买家联系方式
     */
    @ApiField("receiver_telephone")
    private String receiverTelephone;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setReceivedPayment(String receivedPayment) {
        this.receivedPayment = receivedPayment;
    }

    public String getReceivedPayment() {
        return this.receivedPayment;
    }

    public void setReceiverTelephone(String receiverTelephone) {
        this.receiverTelephone = receiverTelephone;
    }

    public String getReceiverTelephone() {
        return this.receiverTelephone;
    }

}
