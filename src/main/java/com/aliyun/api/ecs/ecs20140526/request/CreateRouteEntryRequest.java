package com.aliyun.api.ecs.ecs20140526.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ecs.ecs20140526.response.CreateRouteEntryResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ecs.aliyuncs.com.CreateRouteEntry.2014-05-26 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:34
 */
public class CreateRouteEntryRequest implements AliyunRequest<CreateRouteEntryResponse> {

    /**
     * 用于保证请求的幂等性。由客户端生成该参数值，要保证在不同请求间唯一，最大不值过64个ASCII字符。
     */
    private String clientToken;

    /**
     * 新增路由条目的目的网段
     */
    private String destinationCidrBlock;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 新增路由条目的下一跳实例ID
     */
    private String nextHopId;

    /**
     * 默认值为Instance。可选值为Instance
     */
    private String nextHopType;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * 虚拟路由表Id
     */
    private String routeTableId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(destinationCidrBlock, "destinationCidrBlock");
        RequestCheckUtils.checkNotEmpty(nextHopId, "nextHopId");
        RequestCheckUtils.checkNotEmpty(routeTableId, "routeTableId");
    }

    @Override
    public String getApiMethodName() {
        return "ecs.aliyuncs.com.CreateRouteEntry.2014-05-26";
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNextHopId() {
        return this.nextHopId;
    }

    public String getNextHopType() {
        return this.nextHopType;
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
    public Class<CreateRouteEntryResponse> getResponseClass() {
        return CreateRouteEntryResponse.class;
    }

    public String getRouteTableId() {
        return this.routeTableId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("ClientToken", this.clientToken);
        txtParams.put("DestinationCidrBlock", this.destinationCidrBlock);
        txtParams.put("NextHopId", this.nextHopId);
        txtParams.put("NextHopType", this.nextHopType);
        txtParams.put("RouteTableId", this.routeTableId);
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

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    public void setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
    }

    public void setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
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

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
