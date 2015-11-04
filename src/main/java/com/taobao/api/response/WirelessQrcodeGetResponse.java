package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.wireless.qrcode.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WirelessQrcodeGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2274388559992311417L;

    /**
     * 二维码图片地址
     */
    @ApiField("module")
    private String module;

    public void setModule(String module) {
        this.module = module;
    }

    public String getModule() {
        return this.module;
    }

}
