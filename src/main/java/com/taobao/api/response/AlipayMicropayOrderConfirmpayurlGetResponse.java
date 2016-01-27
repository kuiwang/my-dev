package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SinglePayDetail;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alipay.micropay.order.confirmpayurl.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlipayMicropayOrderConfirmpayurlGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2144582156327489965L;

    /**
     * SinglePayDetail信息
     */
    @ApiField("single_pay_detail")
    private SinglePayDetail singlePayDetail;

    public SinglePayDetail getSinglePayDetail() {
        return this.singlePayDetail;
    }

    public void setSinglePayDetail(SinglePayDetail singlePayDetail) {
        this.singlePayDetail = singlePayDetail;
    }

}
