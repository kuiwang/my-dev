package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * DBInstance
 *
 * @author auto create
 * @since 1.0, null
 */
public class DBInstance extends TaobaoObject {

    private static final long serialVersionUID = 8595723475321222265L;

    /**
     * 实例描述
     */
    @ApiField("DBInstanceDescription")
    private String dBInstanceDescription;

    /**
     * 实例名
     */
    @ApiField("DBInstanceId")
    private String dBInstanceId;

    /**
     * 实例访问类型，Internet公网，Intranet私网
     */
    @ApiField("DBInstanceNetType")
    private String dBInstanceNetType;

    /**
     * 实例状态，参见api文档实例状态表
     */
    @ApiField("DBInstanceStatus")
    private String dBInstanceStatus;

    /**
     * Primary:主实例 Readonly：只读实例 Guard：灾备实例 Temp：临时实例
     */
    @ApiField("DBInstanceType")
    private String dBInstanceType;

    /**
     * 数据库版本
     */
    @ApiField("Engine")
    private String engine;

    /**
     * 到期时间
     */
    @ApiField("ExpireTime")
    private String expireTime;

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
     * 付费类型 Prepaid：预付费 Postpaid:按量付费
     */
    @ApiField("PayType")
    private String payType;

    /**
     * 数据中心
     */
    @ApiField("RegionId")
    private String regionId;

    public String getdBInstanceDescription() {
        return this.dBInstanceDescription;
    }

    public void setdBInstanceDescription(String dBInstanceDescription) {
        this.dBInstanceDescription = dBInstanceDescription;
    }

    public String getdBInstanceId() {
        return this.dBInstanceId;
    }

    public void setdBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
    }

    public String getdBInstanceNetType() {
        return this.dBInstanceNetType;
    }

    public void setdBInstanceNetType(String dBInstanceNetType) {
        this.dBInstanceNetType = dBInstanceNetType;
    }

    public String getdBInstanceStatus() {
        return this.dBInstanceStatus;
    }

    public void setdBInstanceStatus(String dBInstanceStatus) {
        this.dBInstanceStatus = dBInstanceStatus;
    }

    public String getdBInstanceType() {
        return this.dBInstanceType;
    }

    public void setdBInstanceType(String dBInstanceType) {
        this.dBInstanceType = dBInstanceType;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getLockMode() {
        return this.lockMode;
    }

    public void setLockMode(String lockMode) {
        this.lockMode = lockMode;
    }

    public String getLockReason() {
        return this.lockReason;
    }

    public void setLockReason(String lockReason) {
        this.lockReason = lockReason;
    }

    public String getPayType() {
        return this.payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

}
