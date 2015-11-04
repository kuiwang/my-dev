package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.promotionmisc.item.activity.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PromotionmiscItemActivityUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6358134667745343445L;

    /**
     * 修改是否成功。
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
