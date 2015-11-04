package com.aliyun.api.slb.slb20140515.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: slb.aliyuncs.com.CreateLoadBalancerHTTPListener.2014-05-15
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CreateLoadBalancerHTTPListenerResponse extends AliyunResponse {

    private static final long serialVersionUID = 7571913512798321651L;

    /**
     * 请求的唯一号
     */
    @ApiField("RequestId")
    private String requestId;

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

}
