package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.promotag.taguser.remove response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallPromotagTaguserRemoveResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7594559677191281979L;

    /**
     * 打标结果是否成功
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
