package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.crm.membergrade.set response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmMembergradeSetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6853251243969577941L;

    /**
     * 是否保存成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

}
