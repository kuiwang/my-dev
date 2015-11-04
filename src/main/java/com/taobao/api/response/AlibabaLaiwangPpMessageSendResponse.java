package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alibaba.laiwang.pp.message.send response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlibabaLaiwangPpMessageSendResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8374998396844832168L;

    /**
     * issuccess
     */
    @ApiField("issuccess")
    private Boolean issuccess;

    public void setIssuccess(Boolean issuccess) {
        this.issuccess = issuccess;
    }

    public Boolean getIssuccess() {
        return this.issuccess;
    }

}
