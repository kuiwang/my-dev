package com.aliyun.api.rds.rds20140815.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: rds.aliyuncs.com.DescribeResourceUsage.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeResourceUsageResponse extends AliyunResponse {

    private static final long serialVersionUID = 5459273515575912242L;

    /**
     * 备份占用空间，单位：Byte，-1表示没有数据
     */
    @ApiField("BackupSize")
    private Long backupSize;

    /**
     * 数据文件占用空间，单位：Byte， -1表示没有数据
     */
    @ApiField("DataSize")
    private Long dataSize;

    /**
     * 实例名
     */
    @ApiField("DBInstanceId")
    private String dBInstanceId;

    /**
     * 已用空间（DataSize+ LogSize），单位：Byte，-1表示没有数据
     */
    @ApiField("DiskUsed")
    private Long diskUsed;

    /**
     * 数据库类型
     */
    @ApiField("Engine")
    private String engine;

    /**
     * 日志占用空间，单位：Byte，-1表示没有数据
     */
    @ApiField("LogSize")
    private Long logSize;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    public Long getBackupSize() {
        return this.backupSize;
    }

    public Long getDataSize() {
        return this.dataSize;
    }

    public String getdBInstanceId() {
        return this.dBInstanceId;
    }

    public Long getDiskUsed() {
        return this.diskUsed;
    }

    public String getEngine() {
        return this.engine;
    }

    public Long getLogSize() {
        return this.logSize;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setBackupSize(Long backupSize) {
        this.backupSize = backupSize;
    }

    public void setDataSize(Long dataSize) {
        this.dataSize = dataSize;
    }

    public void setdBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
    }

    public void setDiskUsed(Long diskUsed) {
        this.diskUsed = diskUsed;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setLogSize(Long logSize) {
        this.logSize = logSize;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
