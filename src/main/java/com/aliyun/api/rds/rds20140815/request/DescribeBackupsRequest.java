package com.aliyun.api.rds.rds20140815.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.rds.rds20140815.response.DescribeBackupsResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: rds.aliyuncs.com.DescribeBackups.2014-08-15 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:44
 */
public class DescribeBackupsRequest implements AliyunRequest<DescribeBackupsResponse> {

    /**
     * 备份集ID
     */
    private String backupId;

    /**
     * 备份类型，可选值： Automated：常规任务 Manual：临时任务
     */
    private String backupMode;

    /**
     * 备份集状态，取值： Success：完成备份 Failed：备份失败
     */
    private String backupStatus;

    /**
     * 实例名
     */
    private String dBInstanceId;

    /**
     * 查询结束时间，格式如：2011-06-11T16:00:00Z，且大于查询开始时间
     */
    private String endTime;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * "页码，大于0，且不超过Integer的最大值 默认值：1"<br />
     * 支持最大值为：2147483647<br />
     * 支持最小值为：1
     */
    private Long pageNumber;

    /**
     * 每页记录数，取值：30|50|100 默认值：30<br />
     * 支持最大值为：100<br />
     * 支持最小值为：30
     */
    private Long pageSize;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * 查询开始时间，格式如：2011-06-11T15:00:00Z 按照备份开始时间为维度
     */
    private String startTime;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(dBInstanceId, "dBInstanceId");
        RequestCheckUtils.checkNotEmpty(endTime, "endTime");
        RequestCheckUtils.checkMaxValue(pageNumber, 2147483647L, "pageNumber");
        RequestCheckUtils.checkMinValue(pageNumber, 1L, "pageNumber");
        RequestCheckUtils.checkMaxValue(pageSize, 100L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 30L, "pageSize");
        RequestCheckUtils.checkNotEmpty(startTime, "startTime");
    }

    @Override
    public String getApiMethodName() {
        return "rds.aliyuncs.com.DescribeBackups.2014-08-15";
    }

    public String getBackupId() {
        return this.backupId;
    }

    public String getBackupMode() {
        return this.backupMode;
    }

    public String getBackupStatus() {
        return this.backupStatus;
    }

    public String getdBInstanceId() {
        return this.dBInstanceId;
    }

    public String getEndTime() {
        return this.endTime;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public Long getPageNumber() {
        return this.pageNumber;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    @Override
    public Class<DescribeBackupsResponse> getResponseClass() {
        return DescribeBackupsResponse.class;
    }

    public String getStartTime() {
        return this.startTime;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("BackupId", this.backupId);
        txtParams.put("BackupMode", this.backupMode);
        txtParams.put("BackupStatus", this.backupStatus);
        txtParams.put("DBInstanceId", this.dBInstanceId);
        txtParams.put("EndTime", this.endTime);
        txtParams.put("PageNumber", this.pageNumber);
        txtParams.put("PageSize", this.pageSize);
        txtParams.put("StartTime", this.startTime);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public void setBackupMode(String backupMode) {
        this.backupMode = backupMode;
    }

    public void setBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
    }

    public void setdBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
