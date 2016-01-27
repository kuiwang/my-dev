package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.scitem.map.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ScitemMapDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8478112632188555427L;

    /**
     * 失效条数
     */
    @ApiField("module")
    private Long module;

    public Long getModule() {
        return this.module;
    }

    public void setModule(Long module) {
        this.module = module;
    }

}
