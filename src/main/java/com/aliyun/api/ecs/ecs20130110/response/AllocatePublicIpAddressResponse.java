package com.aliyun.api.ecs.ecs20130110.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.AllocatePublicIpAddress.2013-01-10 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AllocatePublicIpAddressResponse extends AliyunResponse {

    private static final long serialVersionUID = 2756772466999165975L;

    /**
     * 分配的公网IP地址。
     */
    @ApiField("IpAddress")
    private String ipAddress;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

}
