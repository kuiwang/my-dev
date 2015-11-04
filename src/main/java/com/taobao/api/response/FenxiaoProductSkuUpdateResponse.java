package com.taobao.api.response;

import java.util.Date;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.fenxiao.product.sku.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoProductSkuUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6666461682356217223L;

    /**
     * 操作时间
     */
    @ApiField("created")
    private Date created;

    /**
     * 操作结果
     */
    @ApiField("result")
    private Boolean result;

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public Boolean getResult() {
        return this.result;
    }

}
