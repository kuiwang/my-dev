package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Task;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.topats.result.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TopatsResultGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2526838895314539753L;

    /**
     * 任务结果信息
     */
    @ApiField("task")
    private Task task;

    public void setTask(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return this.task;
    }

}
