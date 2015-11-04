package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.crm.grademkt.member.detail.query response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmGrademktMemberDetailQueryResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5165548884438158328L;

    /**
     * totalCount为记录总数
     */
    @ApiField("model")
    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

}
