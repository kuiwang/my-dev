package com.aliyun.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * DBInstanceAttribute
 *
 * @author auto create
 * @since 1.0, null
 */
public class DBInstanceAttribute extends TaobaoObject {

    private static final long serialVersionUID = 1128991776652911525L;

    /**
     * 查询当年可用性实例可用性状态
     */
    @ApiField("AvailabilityValue")
    private String availabilityValue;

    /**
     * BINLOG保留天数
     */
    @ApiField("BinlogRetentionPeriod")
    private Long binlogRetentionPeriod;

    /**
     * 连接地址
     */
    @ApiField("ConnectionString")
    private String connectionString;

    /**
     * 创建时间
     */
    @ApiField("CreationTime")
    private String creationTime;

    /**
     * 实例规格
     */
    @ApiField("DBInstanceClass")
    private String dBInstanceClass;

    /**
     * 实例备注
     */
    @ApiField("DBInstanceDescription")
    private String dBInstanceDescription;

    /**
     * 实例名
     */
    @ApiField("DBInstanceId")
    private String dBInstanceId;

    /**
     * 实例内存，单位：Byte
     */
    @ApiField("DBInstanceMemory")
    private Long dBInstanceMemory;

    /**
     * Internet：公网，intranet私网
     */
    @ApiField("DBInstanceNetType")
    private String dBInstanceNetType;

    /**
     * 实例状态，参见实例状态表
     */
    @ApiField("DBInstanceStatus")
    private String dBInstanceStatus;

    /**
     * 实例存储空间，单位：GB
     */
    @ApiField("DBInstanceStorage")
    private String dBInstanceStorage;

    /**
     * Primary:主 ReadOnly：只读 Guard：灾备 Temp：临时
     */
    @ApiField("DBInstanceType")
    private String dBInstanceType;

    /**
     * 一个实例下可创建最大数据库数量
     */
    @ApiField("DBMaxQuantity")
    private Long dBMaxQuantity;

    /**
     * 数据库类型
     */
    @ApiField("Engine")
    private String engine;

    /**
     * 数据库版本
     */
    @ApiField("EngineVersion")
    private String engineVersion;

    /**
     * 到期时间
     */
    @ApiField("ExpireTime")
    private String expireTime;

    /**
     * 灾备实例ID
     */
    @ApiField("GuardDBInstanceId")
    private String guardDBInstanceId;

    /**
     * 增量数据来源的实例ID
     */
    @ApiField("IncrementSourceDBInstanceId")
    private String incrementSourceDBInstanceId;

    /**
     * 实例锁定模式
     */
    @ApiField("LockMode")
    private String lockMode;

    /**
     * 被锁定的原因
     */
    @ApiField("LockReason")
    private String lockReason;

    /**
     * 实例可维护时间
     */
    @ApiField("MaintainTime")
    private String maintainTime;

    /**
     * 临时实例的ID
     */
    @ApiField("MasterInstanceId")
    private String masterInstanceId;

    /**
     * 实例并发连接数
     */
    @ApiField("MaxConnections")
    private Long maxConnections;

    /**
     * IO请求次数，即IOPS
     */
    @ApiField("MaxIOPS")
    private Long maxIOPS;

    /**
     * 付费类型
     */
    @ApiField("PayType")
    private String payType;

    /**
     * 应用访问端口
     */
    @ApiField("Port")
    private String port;

    /**
     * 灾备实例ID
     */
    @ApiListField("ReadOnlyDBInstanceIds")
    @ApiField("ReadOnlyDBInstanceId")
    private List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds;

    /**
     * 数据中心
     */
    @ApiField("RegionId")
    private String regionId;

    /**
     * 临时实例ID
     */
    @ApiField("TempDBInstanceId")
    private String tempDBInstanceId;

    public String getAvailabilityValue() {
        return this.availabilityValue;
    }

    public Long getBinlogRetentionPeriod() {
        return this.binlogRetentionPeriod;
    }

    public String getConnectionString() {
        return this.connectionString;
    }

    public String getCreationTime() {
        return this.creationTime;
    }

    public String getdBInstanceClass() {
        return this.dBInstanceClass;
    }

    public String getdBInstanceDescription() {
        return this.dBInstanceDescription;
    }

    public String getdBInstanceId() {
        return this.dBInstanceId;
    }

    public Long getdBInstanceMemory() {
        return this.dBInstanceMemory;
    }

    public String getdBInstanceNetType() {
        return this.dBInstanceNetType;
    }

    public String getdBInstanceStatus() {
        return this.dBInstanceStatus;
    }

    public String getdBInstanceStorage() {
        return this.dBInstanceStorage;
    }

    public String getdBInstanceType() {
        return this.dBInstanceType;
    }

    public Long getdBMaxQuantity() {
        return this.dBMaxQuantity;
    }

    public String getEngine() {
        return this.engine;
    }

    public String getEngineVersion() {
        return this.engineVersion;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public String getGuardDBInstanceId() {
        return this.guardDBInstanceId;
    }

    public String getIncrementSourceDBInstanceId() {
        return this.incrementSourceDBInstanceId;
    }

    public String getLockMode() {
        return this.lockMode;
    }

    public String getLockReason() {
        return this.lockReason;
    }

    public String getMaintainTime() {
        return this.maintainTime;
    }

    public String getMasterInstanceId() {
        return this.masterInstanceId;
    }

    public Long getMaxConnections() {
        return this.maxConnections;
    }

    public Long getMaxIOPS() {
        return this.maxIOPS;
    }

    public String getPayType() {
        return this.payType;
    }

    public String getPort() {
        return this.port;
    }

    public List<ReadOnlyDBInstanceId> getReadOnlyDBInstanceIds() {
        return this.readOnlyDBInstanceIds;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public String getTempDBInstanceId() {
        return this.tempDBInstanceId;
    }

    public void setAvailabilityValue(String availabilityValue) {
        this.availabilityValue = availabilityValue;
    }

    public void setBinlogRetentionPeriod(Long binlogRetentionPeriod) {
        this.binlogRetentionPeriod = binlogRetentionPeriod;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public void setdBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    public void setdBInstanceDescription(String dBInstanceDescription) {
        this.dBInstanceDescription = dBInstanceDescription;
    }

    public void setdBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
    }

    public void setdBInstanceMemory(Long dBInstanceMemory) {
        this.dBInstanceMemory = dBInstanceMemory;
    }

    public void setdBInstanceNetType(String dBInstanceNetType) {
        this.dBInstanceNetType = dBInstanceNetType;
    }

    public void setdBInstanceStatus(String dBInstanceStatus) {
        this.dBInstanceStatus = dBInstanceStatus;
    }

    public void setdBInstanceStorage(String dBInstanceStorage) {
        this.dBInstanceStorage = dBInstanceStorage;
    }

    public void setdBInstanceType(String dBInstanceType) {
        this.dBInstanceType = dBInstanceType;
    }

    public void setdBMaxQuantity(Long dBMaxQuantity) {
        this.dBMaxQuantity = dBMaxQuantity;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public void setGuardDBInstanceId(String guardDBInstanceId) {
        this.guardDBInstanceId = guardDBInstanceId;
    }

    public void setIncrementSourceDBInstanceId(String incrementSourceDBInstanceId) {
        this.incrementSourceDBInstanceId = incrementSourceDBInstanceId;
    }

    public void setLockMode(String lockMode) {
        this.lockMode = lockMode;
    }

    public void setLockReason(String lockReason) {
        this.lockReason = lockReason;
    }

    public void setMaintainTime(String maintainTime) {
        this.maintainTime = maintainTime;
    }

    public void setMasterInstanceId(String masterInstanceId) {
        this.masterInstanceId = masterInstanceId;
    }

    public void setMaxConnections(Long maxConnections) {
        this.maxConnections = maxConnections;
    }

    public void setMaxIOPS(Long maxIOPS) {
        this.maxIOPS = maxIOPS;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setReadOnlyDBInstanceIds(List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds) {
        this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public void setTempDBInstanceId(String tempDBInstanceId) {
        this.tempDBInstanceId = tempDBInstanceId;
    }

}
