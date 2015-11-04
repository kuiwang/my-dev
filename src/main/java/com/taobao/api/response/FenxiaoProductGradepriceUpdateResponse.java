package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.fenxiao.product.gradeprice.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoProductGradepriceUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4728728116591529497L;

    /**
     * 返回操作结果：成功或失败
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
