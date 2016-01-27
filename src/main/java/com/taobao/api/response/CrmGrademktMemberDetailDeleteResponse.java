package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.crm.grademkt.member.detail.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmGrademktMemberDetailDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7181183471137869434L;

    /**
     * 操作是否成功
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
