package com.aliyun.api.ecs.ecs20130110.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.InstanceType;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeInstanceTypes.2013-01-10 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeInstanceTypesResponse extends AliyunResponse {

    private static final long serialVersionUID = 6876665928928171195L;

    /**
     * 实例资源规格项的类型列表
     */
    @ApiListField("InstanceTypes")
    @ApiField("InstanceType")
    private List<InstanceType> instanceTypes;

    /**
     * 请求的唯一ID
     */
    @ApiField("RequestId")
    private String requestId;

    public void setInstanceTypes(List<InstanceType> instanceTypes) {
        this.instanceTypes = instanceTypes;
    }

    public List<InstanceType> getInstanceTypes() {
        return this.instanceTypes;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

}
