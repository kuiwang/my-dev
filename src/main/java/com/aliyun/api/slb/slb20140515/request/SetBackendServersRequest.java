package com.aliyun.api.slb.slb20140515.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.slb.slb20140515.response.SetBackendServersResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: slb.aliyuncs.com.SetBackendServers.2014-05-15 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:47
 */
public class SetBackendServersRequest implements AliyunRequest<SetBackendServersResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * BackendServers 数组格式，需要添加的后端服务器列表，最多20个
     */
    private String backendServers;

    /**
     * slb id
     */
    private String loadBalancerId;

    public void setBackendServers(String backendServers) {
        this.backendServers = backendServers;
    }

    public String getBackendServers() {
        return this.backendServers;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "slb.aliyuncs.com.SetBackendServers.2014-05-15";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("BackendServers", this.backendServers);
        txtParams.put("LoadBalancerId", this.loadBalancerId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<SetBackendServersResponse> getResponseClass() {
        return SetBackendServersResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(loadBalancerId, "loadBalancerId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
