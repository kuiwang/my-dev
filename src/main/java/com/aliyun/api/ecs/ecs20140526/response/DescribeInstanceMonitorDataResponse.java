package com.aliyun.api.ecs.ecs20140526.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.InstanceMonitorData;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeInstanceMonitorData.2014-05-26
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeInstanceMonitorDataResponse extends AliyunResponse {

    private static final long serialVersionUID = 7559173823633487683L;

    /**
     * 实例的监控数据InstanceMonitorData组成的集合。
     */
    @ApiListField("MonitorData")
    @ApiField("InstanceMonitorData")
    private List<InstanceMonitorData> monitorData;

    /**
     * 请求的唯一ID
     */
    @ApiField("RequestId")
    private String requestId;

    public List<InstanceMonitorData> getMonitorData() {
        return this.monitorData;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setMonitorData(List<InstanceMonitorData> monitorData) {
        this.monitorData = monitorData;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
