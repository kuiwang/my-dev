package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CreativeRecord;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.creative.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaCreativeUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1859836539613175368L;

    /**
     * 创意修改记录对象
     */
    @ApiField("creativerecord")
    private CreativeRecord creativerecord;

    public CreativeRecord getCreativerecord() {
        return this.creativerecord;
    }

    public void setCreativerecord(CreativeRecord creativerecord) {
        this.creativerecord = creativerecord;
    }

}
