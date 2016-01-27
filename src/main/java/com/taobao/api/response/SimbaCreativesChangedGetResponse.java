package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CreativePage;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.creatives.changed.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaCreativesChangedGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3584468925413666824L;

    /**
     * 广告创意分页对象
     */
    @ApiField("creatives")
    private CreativePage creatives;

    public CreativePage getCreatives() {
        return this.creatives;
    }

    public void setCreatives(CreativePage creatives) {
        this.creatives = creatives;
    }

}
