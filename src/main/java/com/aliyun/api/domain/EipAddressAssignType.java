package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 包含弹性IP地址的类型
 *
 * @author auto create
 * @since 1.0, null
 */
public class EipAddressAssignType extends TaobaoObject {

    private static final long serialVersionUID = 2273312699758555228L;

    /**
     * 申请Id
     */
    @ApiField("AllocationId")
    private String allocationId;

    /**
     * 弹性IP地址的公网带宽限速，默认是5Mbps
     */
    @ApiField("Bandwidth")
    private Long bandwidth;

    /**
     * 弹性IP的计费方式。
     */
    @ApiField("InternetChargeType")
    private String internetChargeType;

    /**
     * 弹性IP地址
     */
    @ApiField("IpAddress")
    private String ipAddress;

    public String getAllocationId() {
        return this.allocationId;
    }

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    public Long getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

}
