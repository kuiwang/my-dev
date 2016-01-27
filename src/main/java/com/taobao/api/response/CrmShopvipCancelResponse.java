package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.crm.shopvip.cancel response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmShopvipCancelResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2575284297255878297L;

    /**
     * 返回操作是否成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

}
