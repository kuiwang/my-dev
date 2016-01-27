package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.promotag.taguser.save response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallPromotagTaguserSaveResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2556771424185788298L;

    /**
     * 打标结果是否成功
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
