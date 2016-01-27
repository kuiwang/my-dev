package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.jushita.jdp.user.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JushitaJdpUserAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1344678971717954357L;

    /**
     * 是否添加成功
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
