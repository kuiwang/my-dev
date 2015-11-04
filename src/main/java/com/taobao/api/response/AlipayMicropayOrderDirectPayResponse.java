package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SinglePayDetail;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alipay.micropay.order.direct.pay response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlipayMicropayOrderDirectPayResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3565258264518639293L;

    /**
     * 单笔直接支付返回结果
     */
    @ApiField("single_pay_detail")
    private SinglePayDetail singlePayDetail;

    public void setSinglePayDetail(SinglePayDetail singlePayDetail) {
        this.singlePayDetail = singlePayDetail;
    }

    public SinglePayDetail getSinglePayDetail() {
        return this.singlePayDetail;
    }

}
