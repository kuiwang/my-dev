package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.promotionmisc.mjs.activity.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionmiscMjsActivityDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7818979843951567466L;

    /**
     * 是否成功删除活动。
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
