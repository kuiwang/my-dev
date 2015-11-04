package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.favorite.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FavoriteAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4545311934993825319L;

    /**
     * 是否收藏成功
     */
    @ApiField("success")
    private Boolean success;

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean getSuccess() {
        return this.success;
    }

}
