package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.tmc.user.cancel response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmcUserCancelResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7482265744156354579L;

    /**
     * 是否成功,如果为false并且没有错误码，表示删除的用户不存在。
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
