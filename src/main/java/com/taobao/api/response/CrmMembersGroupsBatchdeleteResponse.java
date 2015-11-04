package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.crm.members.groups.batchdelete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmMembersGroupsBatchdeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7866778799288859381L;

    /**
     * 删除是否成功
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
