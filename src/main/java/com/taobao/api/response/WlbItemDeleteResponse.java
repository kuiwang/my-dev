package com.taobao.api.response;

import java.util.Date;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.wlb.item.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbItemDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1847951213641368161L;

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
