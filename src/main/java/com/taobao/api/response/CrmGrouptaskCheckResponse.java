package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.crm.grouptask.check response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmGrouptaskCheckResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2796516367317425519L;

    /**
     * 异步任务是否完成，true表示完成
     */
    @ApiField("is_finished")
    private Boolean isFinished;

    public Boolean getIsFinished() {
        return this.isFinished;
    }

    public void setIsFinished(Boolean isFinished) {
        this.isFinished = isFinished;
    }

}
