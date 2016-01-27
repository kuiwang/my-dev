package com.aliyun.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 实例的VPC属性
 *
 * @author auto create
 * @since 1.0, null
 */
public class VpcAttribute extends TaobaoObject {

    private static final long serialVersionUID = 3199525936376873697L;

    /**
     * 云产品Ip，用于云产品之间的网络互通
     */
    @ApiField("NatIpAddress")
    private String natIpAddress;

    /**
     * vpc内网IP地址列表
     */
    @ApiListField("PrivateIpAddress")
    @ApiField("IpAddress")
    private List<IpAddress> privateIpAddress;

    /**
     * 虚拟专有网络Id
     */
    @ApiField("VpcId")
    private String vpcId;

    /**
     * 虚拟交换机Id
     */
    @ApiField("VSwitchId")
    private String vSwitchId;

    public String getNatIpAddress() {
        return this.natIpAddress;
    }

    public List<IpAddress> getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public String getvSwitchId() {
        return this.vSwitchId;
    }

    public void setNatIpAddress(String natIpAddress) {
        this.natIpAddress = natIpAddress;
    }

    public void setPrivateIpAddress(List<IpAddress> privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public void setvSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
    }

}
