package com.aliyun.api.ecs.ecs20140526.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.CreateVpc.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CreateVpcResponse extends AliyunResponse {

    private static final long serialVersionUID = 2343374943496555292L;

    /**
     * 虚拟路由器默认路由表Id
     */
    @ApiField("RouteTableId")
    private String routeTableId;

    /**
     * 系统分配的虚拟网络 ID
     */
    @ApiField("VpcId")
    private String vpcId;

    /**
     * 虚拟路由器Id
     */
    @ApiField("VRouterId")
    private String vRouterId;

    public String getRouteTableId() {
        return this.routeTableId;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public String getvRouterId() {
        return this.vRouterId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public void setvRouterId(String vRouterId) {
        this.vRouterId = vRouterId;
    }

}
