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
     * 虚拟交换机Id
     */
    @ApiField("VSwitchId")
    private String vSwitchId;

    /**
     * 虚拟专有网络Id
     */
    @ApiField("VpcId")
    private String vpcId;

    public String getNatIpAddress() {
        return this.natIpAddress;
    }

    public void setNatIpAddress(String natIpAddress) {
        this.natIpAddress = natIpAddress;
    }

    public List<IpAddress> getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public void setPrivateIpAddress(List<IpAddress> privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public String getvSwitchId() {
        return this.vSwitchId;
    }

    public void setvSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

}
