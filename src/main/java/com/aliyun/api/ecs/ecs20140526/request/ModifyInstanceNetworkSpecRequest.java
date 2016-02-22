package com.aliyun.api.ecs.ecs20140526.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ecs.ecs20140526.response.ModifyInstanceNetworkSpecResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ecs.aliyuncs.com.ModifyInstanceNetworkSpec.2014-05-26 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:38
 */
public class ModifyInstanceNetworkSpecRequest
        implements AliyunRequest<ModifyInstanceNetworkSpecResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 指定的需要实例规格的实例ID
     */
    private String instanceId;

    /**
     * 公网入网带宽最大值，单位为Mbps。可取值范围为[1,200]
     */
    private Long internetMaxBandwidthIn;

    /**
     * 公网出网带宽最大值，单位为Mbps。可取值范围为[1,200]
     */
    private Long internetMaxBandwidthOut;

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
        RequestCheckUtils.checkNotEmpty(instanceId, "instanceId");
    }

    @Override
    public String getApiMethodName() {
        return "ecs.aliyuncs.com.ModifyInstanceNetworkSpec.2014-05-26";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public Long getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public Long getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
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
    public Class<ModifyInstanceNetworkSpecResponse> getResponseClass() {
        return ModifyInstanceNetworkSpecResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("InstanceId", this.instanceId);
        txtParams.put("InternetMaxBandwidthIn", this.internetMaxBandwidthIn);
        txtParams.put("InternetMaxBandwidthOut", this.internetMaxBandwidthOut);
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

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public void setInternetMaxBandwidthIn(Long internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
    }

    public void setInternetMaxBandwidthOut(Long internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
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
