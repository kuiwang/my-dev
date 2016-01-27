package com.aliyun.api.ecs.ecs20130110.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.Disk;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeInstanceDisks.2013-01-10 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeInstanceDisksResponse extends AliyunResponse {

    private static final long serialVersionUID = 6782223956655241374L;

    /**
     * 磁盘信息组成的集合
     */
    @ApiListField("Disks")
    @ApiField("Disk")
    private List<Disk> disks;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    public List<Disk> getDisks() {
        return this.disks;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setDisks(List<Disk> disks) {
        this.disks = disks;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
