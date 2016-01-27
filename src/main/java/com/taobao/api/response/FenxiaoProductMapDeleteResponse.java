package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.fenxiao.product.map.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoProductMapDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8529236379173616376L;

    /**
     * 操作结果
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
