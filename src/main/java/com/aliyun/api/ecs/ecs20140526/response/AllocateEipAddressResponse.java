package com.aliyun.api.ecs.ecs20140526.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.AllocateEipAddress.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AllocateEipAddressResponse extends AliyunResponse {

    private static final long serialVersionUID = 3746186148676897292L;

    /**
     * 申请Id，唯一标识这一次申请。
     */
    @ApiField("AllocationId")
    private String allocationId;

    /**
     * 分配的弹性IP地址
     */
    @ApiField("EipAddress")
    private String eipAddress;

    public String getAllocationId() {
        return this.allocationId;
    }

    public String getEipAddress() {
        return this.eipAddress;
    }

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    public void setEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
    }

}
