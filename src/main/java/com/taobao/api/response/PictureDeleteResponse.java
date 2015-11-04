package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.picture.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PictureDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8338455875833566719L;

    /**
     * 是否删除
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
