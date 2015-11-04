package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.crm.grademkt.member.query response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmGrademktMemberQueryResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5134369928793132954L;

    /**
     * json格式
     */
    @ApiField("module")
    private String module;

    public void setModule(String module) {
        this.module = module;
    }

    public String getModule() {
        return this.module;
    }

}
