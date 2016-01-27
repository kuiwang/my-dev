package com.aliyun.api.ess.ess20140828.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ess.aliyuncs.com.CreateScheduledTask.2014-08-28 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CreateScheduledTaskResponse extends AliyunResponse {

    private static final long serialVersionUID = 2754543439379917235L;

    /**
     * 1
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 定时任务的ID
     */
    @ApiField("ScheduledTaskId")
    private String scheduledTaskId;

    public String getRequestId() {
        return this.requestId;
    }

    public String getScheduledTaskId() {
        return this.scheduledTaskId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setScheduledTaskId(String scheduledTaskId) {
        this.scheduledTaskId = scheduledTaskId;
    }

}
