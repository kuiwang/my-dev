package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.promotionmisc.mjs.activity.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionmiscMjsActivityUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6485493647918223929L;

    /**
     * 修改是否成功。
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
