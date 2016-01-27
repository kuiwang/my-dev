package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Task;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alipay.topats.user.accountreport.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlipayTopatsUserAccountreportGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7196835385523792578L;

    /**
     * 创建任务信息。里面只包含task_id和created
     */
    @ApiField("task")
    private Task task;

    public Task getTask() {
        return this.task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

}
