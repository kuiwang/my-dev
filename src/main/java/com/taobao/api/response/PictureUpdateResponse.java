package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.picture.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PictureUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7162879679348483299L;

    /**
     * 更新是否成功
     */
    @ApiField("done")
    private Boolean done;

    public Boolean getDone() {
        return this.done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

}
