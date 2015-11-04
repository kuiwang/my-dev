package com.aliyun.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * RouteTable
 *
 * @author auto create
 * @since 1.0, null
 */
public class RouteTable extends TaobaoObject {

    private static final long serialVersionUID = 5199364862681289169L;

    /**
     * 创建时间。按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     */
    @ApiField("CreationTime")
    private String creationTime;

    /**
     * 路由条目
     */
    @ApiListField("RouteEntrys")
    @ApiField("RouteEntry")
    private List<RouteEntry> routeEntrys;

    /**
     * 路由表的ID
     */
    @ApiField("RouteTableId")
    private String routeTableId;

    /**
     * 路由表类型，System | Custom 二者选其一
     */
    @ApiField("RouteTableType")
    private String routeTableType;

    /**
     * 虚拟路由器的ID
     */
    @ApiField("VRouterId")
    private String vRouterId;

    public String getCreationTime() {
        return this.creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public List<RouteEntry> getRouteEntrys() {
        return this.routeEntrys;
    }

    public void setRouteEntrys(List<RouteEntry> routeEntrys) {
        this.routeEntrys = routeEntrys;
    }

    public String getRouteTableId() {
        return this.routeTableId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public String getRouteTableType() {
        return this.routeTableType;
    }

    public void setRouteTableType(String routeTableType) {
        this.routeTableType = routeTableType;
    }

    public String getvRouterId() {
        return this.vRouterId;
    }

    public void setvRouterId(String vRouterId) {
        this.vRouterId = vRouterId;
    }

}
