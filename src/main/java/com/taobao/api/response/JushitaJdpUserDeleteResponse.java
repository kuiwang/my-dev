package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.jushita.jdp.user.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JushitaJdpUserDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6291562724238565492L;

    /**
     * 是否删除成功
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
