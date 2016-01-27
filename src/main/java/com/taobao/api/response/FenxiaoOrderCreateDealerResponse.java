package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.fenxiao.order.create.dealer response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoOrderCreateDealerResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4122287155739767118L;

    /**
     * 采购单号
     */
    @ApiField("get_module")
    private Long getModule;

    public Long getGetModule() {
        return this.getModule;
    }

    public void setGetModule(Long getModule) {
        this.getModule = getModule;
    }

}
