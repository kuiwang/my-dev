package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.crm.members.group.batchadd response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmMembersGroupBatchaddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1594456416148651734L;

    /**
     * 添加操作是否成功
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
