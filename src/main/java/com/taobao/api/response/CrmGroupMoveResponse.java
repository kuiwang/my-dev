package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.crm.group.move response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmGroupMoveResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6762122964691733315L;

    /**
     * 异步任务请求成功，是否执行完毕需要通过taobao.crm.grouptask.check检测
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
