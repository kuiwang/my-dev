package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * Backup
 *
 * @author auto create
 * @since 1.0, null
 */
public class Backup extends TaobaoObject {

    private static final long serialVersionUID = 2657882913154613194L;

    /**
     * 下载链接的地址，若当前不可下载，则为空串
     */
    @ApiField("BackupDownloadURL")
    private String backupDownloadURL;

    /**
     * 备份结束时间
     */
    @ApiField("BackupEndTime")
    private String backupEndTime;

    /**
     * 备份ID
     */
    @ApiField("BackupId")
    private String backupId;

    /**
     * 备份方法，取值：Logical，逻辑备份；Physical，物理备份
     */
    @ApiField("BackupMethod")
    private String backupMethod;

    /**
     * 备份模式
     */
    @ApiField("BackupMode")
    private String backupMode;

    /**
     * 备份文件大小
     */
    @ApiField("BackupSize")
    private Long backupSize;

    /**
     * 本次备份开始时间
     */
    @ApiField("BackupStartTime")
    private String backupStartTime;

    /**
     * 备份状态
     */
    @ApiField("BackupStatus")
    private String backupStatus;

    /**
     * 备份类型
     */
    @ApiField("BackupType")
    private String backupType;

    /**
     * 实例名
     */
    @ApiField("DBInstanceId")
    private String dBInstanceId;

    public String getBackupDownloadURL() {
        return this.backupDownloadURL;
    }

    public void setBackupDownloadURL(String backupDownloadURL) {
        this.backupDownloadURL = backupDownloadURL;
    }

    public String getBackupEndTime() {
        return this.backupEndTime;
    }

    public void setBackupEndTime(String backupEndTime) {
        this.backupEndTime = backupEndTime;
    }

    public String getBackupId() {
        return this.backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public String getBackupMethod() {
        return this.backupMethod;
    }

    public void setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
    }

    public String getBackupMode() {
        return this.backupMode;
    }

    public void setBackupMode(String backupMode) {
        this.backupMode = backupMode;
    }

    public Long getBackupSize() {
        return this.backupSize;
    }

    public void setBackupSize(Long backupSize) {
        this.backupSize = backupSize;
    }

    public String getBackupStartTime() {
        return this.backupStartTime;
    }

    public void setBackupStartTime(String backupStartTime) {
        this.backupStartTime = backupStartTime;
    }

    public String getBackupStatus() {
        return this.backupStatus;
    }

    public void setBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
    }

    public String getBackupType() {
        return this.backupType;
    }

    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    public String getdBInstanceId() {
        return this.dBInstanceId;
    }

    public void setdBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
    }

}
