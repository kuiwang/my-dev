package com.aliyun.api.rds.rds20140815.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: rds.aliyuncs.com.DescribeBackupPolicy.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeBackupPolicyResponse extends AliyunResponse {

    private static final long serialVersionUID = 6376728631377818572L;

    /**
     * 备份保留天数
     */
    @ApiField("BackupRetentionPeriod")
    private Long backupRetentionPeriod;

    /**
     * 备份周期，星期一。。。。星期天（用英文标示，首字母大写）
     */
    @ApiField("PreferredBackupPeriod")
    private String preferredBackupPeriod;

    /**
     * 备份时间，格式：HH:mmZ
     */
    @ApiField("PreferredBackupTime")
    private String preferredBackupTime;

    /**
     * RequestId
     */
    @ApiField("RequestId")
    private String requestId;

    public Long getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setBackupRetentionPeriod(Long backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    public void setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
    }

    public void setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
