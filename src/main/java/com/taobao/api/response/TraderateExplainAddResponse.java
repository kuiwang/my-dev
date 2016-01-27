package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.traderate.explain.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TraderateExplainAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6653853661389385392L;

    /**
     * 商城卖家给评价解释是否成功。
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
