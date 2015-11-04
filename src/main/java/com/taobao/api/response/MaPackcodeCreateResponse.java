package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ma.packcode.create response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class MaPackcodeCreateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1277958348876455778L;

    /**
     * 生成包裹码二维码图片链接
     */
    @ApiField("qrcodeurl")
    private String qrcodeurl;

    public void setQrcodeurl(String qrcodeurl) {
        this.qrcodeurl = qrcodeurl;
    }

    public String getQrcodeurl() {
        return this.qrcodeurl;
    }

}
