package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.MicroPayOrderDetail;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alipay.micropay.order.freeze response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlipayMicropayOrderFreezeResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2746694777951173761L;

    /**
     * 冻结订单详情
     */
    @ApiField("micro_pay_order_detail")
    private MicroPayOrderDetail microPayOrderDetail;

    public void setMicroPayOrderDetail(MicroPayOrderDetail microPayOrderDetail) {
        this.microPayOrderDetail = microPayOrderDetail;
    }

    public MicroPayOrderDetail getMicroPayOrderDetail() {
        return this.microPayOrderDetail;
    }

}
