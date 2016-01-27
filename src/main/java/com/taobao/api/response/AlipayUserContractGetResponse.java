package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AlipayContract;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alipay.user.contract.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlipayUserContractGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3465374128611682743L;

    /**
     * 支付宝用户订购信息
     */
    @ApiField("alipay_contract")
    private AlipayContract alipayContract;

    public AlipayContract getAlipayContract() {
        return this.alipayContract;
    }

    public void setAlipayContract(AlipayContract alipayContract) {
        this.alipayContract = alipayContract;
    }

}
