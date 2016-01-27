package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.promotionmisc.item.activity.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionmiscItemActivityDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8717931366617247123L;

    /**
     * 是否成功删除活动。
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
