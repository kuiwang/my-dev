package com.aliyun.api.slb.slb20140515.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: slb.aliyuncs.com.ModifyLoadBalancerInternetSpec.2014-05-15
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ModifyLoadBalancerInternetSpecResponse extends AliyunResponse {

    private static final long serialVersionUID = 7587227678994886323L;

    /**
     * 请求唯一号
     */
    @ApiField("RequestId")
    private String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
