package com.taobao.api.response;

import java.util.Date;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.wlb.item.combination.create response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbItemCombinationCreateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7526324416134422741L;

    /**
     * 组合关系创建时间
     */
    @ApiField("gmt_create")
    private Date gmtCreate;

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

}
