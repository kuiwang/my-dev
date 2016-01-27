package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.appip.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AppipGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4832662272372714555L;

    /**
     * ISV发起请求服务器IP
     */
    @ApiField("ip")
    private String ip;

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

}
