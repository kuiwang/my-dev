package com.taobao.api.response;

import java.util.Date;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.fenxiao.product.image.upload response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoProductImageUploadResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7646699736544127886L;

    /**
     * 操作时间
     */
    @ApiField("created")
    private Date created;

    /**
     * 操作是否成功
     */
    @ApiField("result")
    private Boolean result;

    public Date getCreated() {
        return this.created;
    }

    public Boolean getResult() {
        return this.result;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

}
