package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 弹性IP的数据对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class Eip extends TaobaoObject {

    private static final long serialVersionUID = 4621986471859175786L;

    /**
     * 申请Id
     */
    @ApiField("AllocationId")
    private String allocationId;

    /**
     * 创建时间。按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     */
    @ApiField("AllocationTime")
    private String allocationTime;

    /**
     * 弹性IP地址的公网带宽限速，默认是5Mbps
     */
    @ApiField("Bandwidth")
    private String bandwidth;

    /**
     * 弹性IP地址当前绑定的实例，如果未绑定则值为空。
     */
    @ApiField("InstanceId")
    private String instanceId;

    /**
     * 弹性IP的计费方式 PayByBandwidth |
     * PayByTraffic两个值中的一个。预付费实例显示PayByBandwidth（按带宽计费）。 PayByTraffic：按流量计费
     */
    @ApiField("InternetChargeType")
    private String internetChargeType;

    /**
     * 弹性IP地址
     */
    @ApiField("IpAddress")
    private String ipAddress;

    /**
     * OperationLocksType，如果没有被锁定则其子节点不出现。
     */
    @ApiField("OperationLocks")
    private String operationLocks;

    /**
     * 虚拟网络所在的地域
     */
    @ApiField("RegionId")
    private String regionId;

    /**
     * 虚拟网络状态，包括pending和Available两种
     */
    @ApiField("Status")
    private String status;

    public String getAllocationId() {
        return this.allocationId;
    }

    public String getAllocationTime() {
        return this.allocationTime;
    }

    public String getBandwidth() {
        return this.bandwidth;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public String getOperationLocks() {
        return this.operationLocks;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    public void setAllocationTime(String allocationTime) {
        this.allocationTime = allocationTime;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setOperationLocks(String operationLocks) {
        this.operationLocks = operationLocks;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
