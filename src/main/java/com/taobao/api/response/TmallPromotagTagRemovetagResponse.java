package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.promotag.tag.removetag response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallPromotagTagRemovetagResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7344553831716512236L;

    /**
     * 删除操作是否成功
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
