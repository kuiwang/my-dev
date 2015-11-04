package com.aliyun.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 虚拟路由
 *
 * @author auto create
 * @since 1.0, null
 */
public class VRouter extends TaobaoObject {

    private static final long serialVersionUID = 5197932713453543285L;

    /**
     * 创建时间
     */
    @ApiField("CreationTime")
    private String creationTime;

    /**
     * 虚拟路由描述
     */
    @ApiField("Description")
    private String description;

    /**
     * regionId
     */
    @ApiField("RegionId")
    private String regionId;

    /**
     * 路由表ID集合
     */
    @ApiListField("RouteTableIds")
    @ApiField("String")
    private List<String> routeTableIds;

    /**
     * 虚拟路由ID
     */
    @ApiField("VRouterId")
    private String vRouterId;

    /**
     * 虚拟路由名称
     */
    @ApiField("VRouterName")
    private String vRouterName;

    /**
     * VPC ID
     */
    @ApiField("VpcId")
    private String vpcId;

    public String getCreationTime() {
        return this.creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public List<String> getRouteTableIds() {
        return this.routeTableIds;
    }

    public void setRouteTableIds(List<String> routeTableIds) {
        this.routeTableIds = routeTableIds;
    }

    public String getvRouterId() {
        return this.vRouterId;
    }

    public void setvRouterId(String vRouterId) {
        this.vRouterId = vRouterId;
    }

    public String getvRouterName() {
        return this.vRouterName;
    }

    public void setvRouterName(String vRouterName) {
        this.vRouterName = vRouterName;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

}
