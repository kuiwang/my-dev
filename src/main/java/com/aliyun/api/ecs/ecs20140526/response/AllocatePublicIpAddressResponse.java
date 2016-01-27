package com.aliyun.api.ecs.ecs20140526.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.AllocatePublicIpAddress.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AllocatePublicIpAddressResponse extends AliyunResponse {

    private static final long serialVersionUID = 7614881936816565953L;

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

    public String getIpAddress() {
        return this.ipAddress;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
