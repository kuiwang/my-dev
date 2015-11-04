package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.jushita.jdp.task.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JushitaJdpTaskUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8654724444833171966L;

    /**
     * 更新任务是否成功
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
