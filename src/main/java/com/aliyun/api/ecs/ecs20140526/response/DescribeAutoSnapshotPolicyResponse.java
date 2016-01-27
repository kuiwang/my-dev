package com.aliyun.api.ecs.ecs20140526.response;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.AutoSnapshotExecutionStatusType;
import com.aliyun.api.domain.AutoSnapshotPolicyType;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeAutoSnapshotPolicy.2014-05-26
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeAutoSnapshotPolicyResponse extends AliyunResponse {

    private static final long serialVersionUID = 8682798158187556973L;

    /**
     * 自动快照策略的执行情况
     */
    @ApiField("AutoSnapshotExcutionStatus")
    private AutoSnapshotExecutionStatusType autoSnapshotExcutionStatus;

    /**
     * 自动快照策略详情
     */
    @ApiField("AutoSnapshotPolicy")
    private AutoSnapshotPolicyType autoSnapshotPolicy;

    public AutoSnapshotExecutionStatusType getAutoSnapshotExcutionStatus() {
        return this.autoSnapshotExcutionStatus;
    }

    public AutoSnapshotPolicyType getAutoSnapshotPolicy() {
        return this.autoSnapshotPolicy;
    }

    public void setAutoSnapshotExcutionStatus(
            AutoSnapshotExecutionStatusType autoSnapshotExcutionStatus) {
        this.autoSnapshotExcutionStatus = autoSnapshotExcutionStatus;
    }

    public void setAutoSnapshotPolicy(AutoSnapshotPolicyType autoSnapshotPolicy) {
        this.autoSnapshotPolicy = autoSnapshotPolicy;
    }

}
