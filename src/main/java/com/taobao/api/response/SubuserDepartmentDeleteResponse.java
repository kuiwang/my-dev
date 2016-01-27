package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.subuser.department.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SubuserDepartmentDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3387139759846452867L;

    /**
     * 操作是否成功 true:操作成功; false:操作失败
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
