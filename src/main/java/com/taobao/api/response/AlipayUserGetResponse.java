package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AlipayUserDetail;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alipay.user.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlipayUserGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5679978124571813589L;

    /**
     * 支付宝用户信息
     */
    @ApiField("alipay_user_detail")
    private AlipayUserDetail alipayUserDetail;

    public AlipayUserDetail getAlipayUserDetail() {
        return this.alipayUserDetail;
    }

    public void setAlipayUserDetail(AlipayUserDetail alipayUserDetail) {
        this.alipayUserDetail = alipayUserDetail;
    }

}
