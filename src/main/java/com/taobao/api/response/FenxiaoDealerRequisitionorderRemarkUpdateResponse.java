package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.fenxiao.dealer.requisitionorder.remark.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoDealerRequisitionorderRemarkUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1186887439391728389L;

    /**
     * 操作是否成功
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
