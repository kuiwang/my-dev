package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ump.detail.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UmpDetailAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8515795936973565316L;

    /**
     * 活动详情的id
     */
    @ApiField("detail_id")
    private Long detailId;

    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    public Long getDetailId() {
        return this.detailId;
    }

}
