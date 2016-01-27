package com.taobao.api.response;

import java.util.Date;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.wlb.notify.message.confirm response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbNotifyMessageConfirmResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5751565335741662729L;

    /**
     * 物流宝消息确认时间
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
