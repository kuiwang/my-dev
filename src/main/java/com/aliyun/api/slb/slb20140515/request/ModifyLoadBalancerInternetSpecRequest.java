package com.aliyun.api.slb.slb20140515.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.slb.slb20140515.response.ModifyLoadBalancerInternetSpecResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: slb.aliyuncs.com.ModifyLoadBalancerInternetSpec.2014-05-15
 * request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:47
 */
public class ModifyLoadBalancerInternetSpecRequest implements
        AliyunRequest<ModifyLoadBalancerInternetSpecResponse> {

    /**
     * 公网类型实例按固定带宽计费方式时设定的带宽峰值 取值：，范围1-1000（单位为Mbps） ，默认值：为1。
     * 针对公网类型实例，需要将当前设定值通过Listener上的Bandwidth参数进行分配后才能生效
     * ；针对公网类型实例按使用流量计费方式的带宽峰值，请直接通过Listener上Bandwidth参数进行设定。<br />
     * 支持最大值为：1000<br />
     * 支持最小值为：1
     */
    private Long bandwidth;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 公网类型实例付费方式。
     */
    private String internetChargeType;

    /**
     * SLB实例的唯一标识。
     */
    private String loadBalancerId;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(bandwidth, 1000L, "bandwidth");
        RequestCheckUtils.checkMinValue(bandwidth, 1L, "bandwidth");
        RequestCheckUtils.checkNotEmpty(loadBalancerId, "loadBalancerId");
    }

    @Override
    public String getApiMethodName() {
        return "slb.aliyuncs.com.ModifyLoadBalancerInternetSpec.2014-05-15";
    }

    public Long getBandwidth() {
        return this.bandwidth;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    @Override
    public Class<ModifyLoadBalancerInternetSpecResponse> getResponseClass() {
        return ModifyLoadBalancerInternetSpecResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("Bandwidth", this.bandwidth);
        txtParams.put("InternetChargeType", this.internetChargeType);
        txtParams.put("LoadBalancerId", this.loadBalancerId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
