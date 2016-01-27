package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.fenxiao.dealer.requisitionorder.agree response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoDealerRequisitionorderAgreeResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6522415864412365191L;

    /**
     * 操作是否成功。true：成功；false：失败。
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
