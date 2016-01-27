package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 路由条目
 *
 * @author auto create
 * @since 1.0, null
 */
public class RouteEntry extends TaobaoObject {

    private static final long serialVersionUID = 5143967854633833526L;

    /**
     * 目标网段地址
     */
    @ApiField("DestinationCidrBlock")
    private String destinationCidrBlock;

    /**
     * 下一跳的实例ID
     */
    @ApiField("InstanceId")
    private String instanceId;

    /**
     * 路由条目所在的虚拟路由器
     */
    @ApiField("RouteTableId")
    private String routeTableId;

    /**
     * 路由状态
     */
    @ApiField("Status")
    private String status;

    /**
     * 路由类型(system|sustom)
     */
    @ApiField("Type")
    private String type;

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public String getRouteTableId() {
        return this.routeTableId;
    }

    public String getStatus() {
        return this.status;
    }

    public String getType() {
        return this.type;
    }

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setType(String type) {
        this.type = type;
    }

}
