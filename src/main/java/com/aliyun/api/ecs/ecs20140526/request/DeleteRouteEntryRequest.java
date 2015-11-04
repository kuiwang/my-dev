package com.aliyun.api.ecs.ecs20140526.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ecs.ecs20140526.response.DeleteRouteEntryResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ecs.aliyuncs.com.DeleteRouteEntry.2014-05-26 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:35
 */
public class DeleteRouteEntryRequest implements AliyunRequest<DeleteRouteEntryResponse> {

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
     * 新增路由条目的目的网段
     */
    private String destinationCidrBlock;

    /**
     * NextHopId
     */
    private String nextHopId;

    /**
     * 虚拟路由表Id
     */
    private String routeTableId;

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public void setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
    }

    public String getNextHopId() {
        return this.nextHopId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public String getRouteTableId() {
        return this.routeTableId;
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
        return "ecs.aliyuncs.com.DeleteRouteEntry.2014-05-26";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("DestinationCidrBlock", this.destinationCidrBlock);
        txtParams.put("NextHopId", this.nextHopId);
        txtParams.put("RouteTableId", this.routeTableId);
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

    public Class<DeleteRouteEntryResponse> getResponseClass() {
        return DeleteRouteEntryResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(destinationCidrBlock, "destinationCidrBlock");
        RequestCheckUtils.checkNotEmpty(nextHopId, "nextHopId");
        RequestCheckUtils.checkNotEmpty(routeTableId, "routeTableId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
