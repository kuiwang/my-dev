package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alibaba.laiwang.pp.menu.create response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlibabaLaiwangPpMenuCreateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6733628738857787916L;

    /**
     * 调用是否成功
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
