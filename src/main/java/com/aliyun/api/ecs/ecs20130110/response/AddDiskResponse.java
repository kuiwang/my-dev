package com.aliyun.api.ecs.ecs20130110.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.AddDisk.2013-01-10 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AddDiskResponse extends AliyunResponse {

    private static final long serialVersionUID = 1313743897636876154L;

    /**
     * 磁盘代号
     */
    @ApiField("DiskId")
    private String diskId;

    /**
     * 请求的唯一ID，系统自动生成
     */
    @ApiField("RequestId")
    private String requestId;

    public String getDiskId() {
        return this.diskId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
