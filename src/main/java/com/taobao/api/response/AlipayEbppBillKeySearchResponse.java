package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alipay.ebpp.bill.key.search response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlipayEbppBillKeySearchResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1276262117121682382L;

    /**
     * 请求受理ID。
     */
    @ApiField("task_id")
    private String taskId;

    public String getTaskId() {
        return this.taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

}
