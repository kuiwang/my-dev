package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.qt.report.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class QtReportDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2549964265575619348L;

    /**
     * 是否成功
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
