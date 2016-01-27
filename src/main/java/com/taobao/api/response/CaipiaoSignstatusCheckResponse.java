package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.caipiao.signstatus.check response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CaipiaoSignstatusCheckResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2582879454292369622L;

    /**
     * 是否签署了支付宝代扣协议
     */
    @ApiField("sign")
    private Boolean sign;

    /**
     * 签署支付宝代扣协议的Url
     */
    @ApiField("sign_url")
    private String signUrl;

    public Boolean getSign() {
        return this.sign;
    }

    public String getSignUrl() {
        return this.signUrl;
    }

    public void setSign(Boolean sign) {
        this.sign = sign;
    }

    public void setSignUrl(String signUrl) {
        this.signUrl = signUrl;
    }

}
