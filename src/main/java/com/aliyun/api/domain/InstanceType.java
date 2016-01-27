package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 实例资源规格项的类型
 *
 * @author auto create
 * @since 1.0, null
 */
public class InstanceType extends TaobaoObject {

    private static final long serialVersionUID = 2427129395527453252L;

    /**
     * CPU的内核数目
     */
    @ApiField("CpuCoreCount")
    private Long cpuCoreCount;

    /**
     * 实例规格的ID
     */
    @ApiField("InstanceTypeId")
    private String instanceTypeId;

    /**
     * 内存大小，单位GB
     */
    @ApiField("MemorySize")
    private String memorySize;

    public Long getCpuCoreCount() {
        return this.cpuCoreCount;
    }

    public String getInstanceTypeId() {
        return this.instanceTypeId;
    }

    public String getMemorySize() {
        return this.memorySize;
    }

    public void setCpuCoreCount(Long cpuCoreCount) {
        this.cpuCoreCount = cpuCoreCount;
    }

    public void setInstanceTypeId(String instanceTypeId) {
        this.instanceTypeId = instanceTypeId;
    }

    public void setMemorySize(String memorySize) {
        this.memorySize = memorySize;
    }

}
