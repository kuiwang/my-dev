package com.aliyun.api.ecs.ecs20140526.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.EipMonitorData;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeEipMonitorData.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeEipMonitorDataResponse extends AliyunResponse {

    private static final long serialVersionUID = 8348882439713916333L;

    /**
     * 实例的监控数据EipMonitorDataType数据集合
     */
    @ApiListField("EipMonitorDatas")
    @ApiField("EipMonitorData")
    private List<EipMonitorData> eipMonitorDatas;

    /**
     * 请求的唯一ID
     */
    @ApiField("RequestId")
    private String requestId;

    public void setEipMonitorDatas(List<EipMonitorData> eipMonitorDatas) {
        this.eipMonitorDatas = eipMonitorDatas;
    }

    public List<EipMonitorData> getEipMonitorDatas() {
        return this.eipMonitorDatas;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

}
