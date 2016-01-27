package com.taobao.api.response;

import java.util.Date;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.wlb.order.consign response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbOrderConsignResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6358475878383997814L;

    /**
     * 修改时间
     */
    @ApiField("modify_time")
    private Date modifyTime;

    public Date getModifyTime() {
        return this.modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

}
