package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.crm.grademkt.member.gradeactivity.init response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmGrademktMemberGradeactivityInitResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2354312959548215122L;

    /**
     * json格式
     */
    @ApiField("module")
    private Boolean module;

    public void setModule(Boolean module) {
        this.module = module;
    }

    public Boolean getModule() {
        return this.module;
    }

}
