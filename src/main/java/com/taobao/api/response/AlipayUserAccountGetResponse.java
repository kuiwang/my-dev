package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AlipayAccount;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alipay.user.account.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlipayUserAccountGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6795263427176712423L;

    /**
     * 支付宝用户账户信息
     */
    @ApiField("alipay_account")
    private AlipayAccount alipayAccount;

    public AlipayAccount getAlipayAccount() {
        return this.alipayAccount;
    }

    public void setAlipayAccount(AlipayAccount alipayAccount) {
        this.alipayAccount = alipayAccount;
    }

}
