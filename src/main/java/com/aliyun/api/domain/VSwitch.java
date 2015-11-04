package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 虚拟交换机
 *
 * @author auto create
 * @since 1.0, null
 */
public class VSwitch extends TaobaoObject {

    private static final long serialVersionUID = 8773795836324362579L;

    /**
     * 虚拟交换机当前可用的IP地址数量
     */
    @ApiField("AvailableIpAddressCount")
    private Long availableIpAddressCount;

    /**
     * 虚拟交换机的地址
     */
    @ApiField("CidrBlock")
    private String cidrBlock;

    /**
     * 创建时间。按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     */
    @ApiField("CreationTime")
    private String creationTime;

    /**
     * 描述，[1,256]英文或中文字符，不能以http://和https://开头。
     */
    @ApiField("Description")
    private String description;

    /**
     * 虚拟交换机状态，包括pending和Available两种
     */
    @ApiField("Status")
    private String status;

    /**
     * 虚拟交换机ID
     */
    @ApiField("VSwitchId")
    private String vSwitchId;

    /**
     * 虚拟交换机名字，[1,128]英文或中文字符，不能以http://和https://开头。
     */
    @ApiField("VSwitchName")
    private String vSwitchName;

    /**
     * 虚拟交换机所在的虚拟网络
     */
    @ApiField("VpcId")
    private String vpcId;

    /**
     * 虚拟交换机所在的Zone
     */
    @ApiField("ZoneId")
    private String zoneId;

    public Long getAvailableIpAddressCount() {
        return this.availableIpAddressCount;
    }

    public void setAvailableIpAddressCount(Long availableIpAddressCount) {
        this.availableIpAddressCount = availableIpAddressCount;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

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

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getvSwitchId() {
        return this.vSwitchId;
    }

    public void setvSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
    }

    public String getvSwitchName() {
        return this.vSwitchName;
    }

    public void setvSwitchName(String vSwitchName) {
        this.vSwitchName = vSwitchName;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

}
