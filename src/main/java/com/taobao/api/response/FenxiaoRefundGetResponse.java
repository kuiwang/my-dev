package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.RefundDetail;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.fenxiao.refund.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoRefundGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7258133577359187789L;

    /**
     * 退款详情
     */
    @ApiField("refund_detail")
    private RefundDetail refundDetail;

    public RefundDetail getRefundDetail() {
        return this.refundDetail;
    }

    public void setRefundDetail(RefundDetail refundDetail) {
        this.refundDetail = refundDetail;
    }

}
