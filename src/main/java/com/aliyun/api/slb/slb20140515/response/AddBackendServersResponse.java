package com.aliyun.api.slb.slb20140515.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.BackendServer;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: slb.aliyuncs.com.AddBackendServers.2014-05-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AddBackendServersResponse extends AliyunResponse {

    private static final long serialVersionUID = 3896153267881134796L;

    /**
     * SLB内多个后端服务器的信息
     */
    @ApiListField("BackendServers")
    @ApiField("BackendServer")
    private List<BackendServer> backendServers;

    /**
     * SLB实例的唯一标识。
     */
    @ApiField("LoadBalancerId")
    private String loadBalancerId;

    /**
     * 请求的唯一号
     */
    @ApiField("RequestId")
    private String requestId;

    public List<BackendServer> getBackendServers() {
        return this.backendServers;
    }

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setBackendServers(List<BackendServer> backendServers) {
        this.backendServers = backendServers;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
