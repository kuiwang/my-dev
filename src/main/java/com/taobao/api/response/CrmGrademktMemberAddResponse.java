package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.crm.grademkt.member.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmGrademktMemberAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2114659851895786952L;

    /**
     * 返回操作是否成功
     */
    @ApiField("model")
    private Boolean model;

    public void setModel(Boolean model) {
        this.model = model;
    }

    public Boolean getModel() {
        return this.model;
    }

}
