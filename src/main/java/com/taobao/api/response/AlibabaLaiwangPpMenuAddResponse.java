package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alibaba.laiwang.pp.menu.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlibabaLaiwangPpMenuAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3273453267612795461L;

    /**
     * 调用是否成功
     */
    @ApiField("issuccess")
    private Boolean issuccess;

    public Boolean getIssuccess() {
        return this.issuccess;
    }

    public void setIssuccess(Boolean issuccess) {
        this.issuccess = issuccess;
    }

}
