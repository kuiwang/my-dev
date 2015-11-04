package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.DataPushTask;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.jushita.jdp.tasks.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JushitaJdpTasksGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1742945255795331234L;

    /**
     * 查询到的未执行任务
     */
    @ApiListField("data_push_tasks")
    @ApiField("data_push_task")
    private List<DataPushTask> dataPushTasks;

    public void setDataPushTasks(List<DataPushTask> dataPushTasks) {
        this.dataPushTasks = dataPushTasks;
    }

    public List<DataPushTask> getDataPushTasks() {
        return this.dataPushTasks;
    }

}
