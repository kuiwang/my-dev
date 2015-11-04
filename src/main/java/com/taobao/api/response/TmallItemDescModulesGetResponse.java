package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ModularDescInfo;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.item.desc.modules.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallItemDescModulesGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1596963496348368386L;

    /**
     * 返回描述模块信息
     */
    @ApiField("modular_desc_info")
    private ModularDescInfo modularDescInfo;

    public void setModularDescInfo(ModularDescInfo modularDescInfo) {
        this.modularDescInfo = modularDescInfo;
    }

    public ModularDescInfo getModularDescInfo() {
        return this.modularDescInfo;
    }

}
