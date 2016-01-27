package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Creative;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.creative.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaCreativeAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5264956418571123971L;

    /**
     * 新增加的创意对象
     */
    @ApiField("creative")
    private Creative creative;

    public Creative getCreative() {
        return this.creative;
    }

    public void setCreative(Creative creative) {
        this.creative = creative;
    }

}
