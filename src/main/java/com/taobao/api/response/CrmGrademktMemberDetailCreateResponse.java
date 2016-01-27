package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.crm.grademkt.member.detail.create response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmGrademktMemberDetailCreateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7183316133816863439L;

    /**
     * json格式
     */
    @ApiField("module")
    private Boolean module;

    public Boolean getModule() {
        return this.module;
    }

    public void setModule(Boolean module) {
        this.module = module;
    }

}
