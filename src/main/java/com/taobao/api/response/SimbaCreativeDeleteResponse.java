package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Creative;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.creative.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaCreativeDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4733598522934365521L;

    /**
     * 被删除的创意对象
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
