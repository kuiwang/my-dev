package com.taobao.api.response;

import java.util.Date;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.wlb.inventory.sync response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbInventorySyncResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6164762668934795874L;

    /**
     * 修改时间
     */
    @ApiField("gmt_modified")
    private Date gmtModified;

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Date getGmtModified() {
        return this.gmtModified;
    }

}
