package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alipay.micropay.order.freezepayurl.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlipayMicropayOrderFreezepayurlGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8644845341596328747L;

    /**
     * 支付冻结金的地址
     */
    @ApiField("pay_freeze_url")
    private String payFreezeUrl;

    public String getPayFreezeUrl() {
        return this.payFreezeUrl;
    }

    public void setPayFreezeUrl(String payFreezeUrl) {
        this.payFreezeUrl = payFreezeUrl;
    }

}
