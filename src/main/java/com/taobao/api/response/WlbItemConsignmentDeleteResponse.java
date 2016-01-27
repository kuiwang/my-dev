package com.taobao.api.response;

import java.util.Date;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.wlb.item.consignment.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbItemConsignmentDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1355636794399987487L;

    /**
     * 修改时间
     */
    @ApiField("gmt_modified")
    private Date gmtModified;

    public Date getGmtModified() {
        return this.gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

}
