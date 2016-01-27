package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 自动快照策略类型，自动快照策略的详细设置信息。
 *
 * @author auto create
 * @since 1.0, null
 */
public class AutoSnapshotPolicyType extends TaobaoObject {

    private static final long serialVersionUID = 7592253717387676254L;

    /**
     * 数据盘自动快照策略的开关： True：数据盘执行自动快照策略 False：数据盘不执行自动快照策略
     */
    @ApiField("DataDiskPolicyEnabled")
    private String dataDiskPolicyEnabled;

    /**
     * 保留自动快照的天数， 1|2|3
     */
    @ApiField("DataDiskPolicyRetentionDays")
    private Long dataDiskPolicyRetentionDays;

    /**
     * 数据盘自动快照策略的保留上周日选项： True：代表保留上周日的快照 False：不保留
     */
    @ApiField("DataDiskPolicyRetentionLastWeek")
    private String dataDiskPolicyRetentionLastWeek;

    /**
     * 数据盘自动快照策略的保留天数： 4个时间段， 1：1:00-7:00 2：7:00-13:00 3：13:00-19:00
     * 4：19:00-1:00
     */
    @ApiField("DataDiskPolicyTimePeriod")
    private Long dataDiskPolicyTimePeriod;

    /**
     * 系统盘自动快照策略开关： True：系统盘执行自动快照策略 False：系统盘不执行自动快照策略
     */
    @ApiField("SystemDiskPolicyEnabled")
    private String systemDiskPolicyEnabled;

    /**
     * 系统盘自动快照策略的保留天数： 1|2|3
     */
    @ApiField("SystemDiskPolicyRetentionDays")
    private Long systemDiskPolicyRetentionDays;

    /**
     * 系统盘自动快照策略的保留上周日选项： True：保留上周日的快照， False：不保留
     */
    @ApiField("SystemDiskPolicyRetentionLastWeek")
    private String systemDiskPolicyRetentionLastWeek;

    /**
     * 系统盘自动快照策略的时间段： 4个时间段， 1：1:00-7:00 2：7:00-13:00 3：13:00-19:00
     * 4：19:00-1:00
     */
    @ApiField("SystemDiskPolicyTimePeriod")
    private Long systemDiskPolicyTimePeriod;

    public String getDataDiskPolicyEnabled() {
        return this.dataDiskPolicyEnabled;
    }

    public Long getDataDiskPolicyRetentionDays() {
        return this.dataDiskPolicyRetentionDays;
    }

    public String getDataDiskPolicyRetentionLastWeek() {
        return this.dataDiskPolicyRetentionLastWeek;
    }

    public Long getDataDiskPolicyTimePeriod() {
        return this.dataDiskPolicyTimePeriod;
    }

    public String getSystemDiskPolicyEnabled() {
        return this.systemDiskPolicyEnabled;
    }

    public Long getSystemDiskPolicyRetentionDays() {
        return this.systemDiskPolicyRetentionDays;
    }

    public String getSystemDiskPolicyRetentionLastWeek() {
        return this.systemDiskPolicyRetentionLastWeek;
    }

    public Long getSystemDiskPolicyTimePeriod() {
        return this.systemDiskPolicyTimePeriod;
    }

    public void setDataDiskPolicyEnabled(String dataDiskPolicyEnabled) {
        this.dataDiskPolicyEnabled = dataDiskPolicyEnabled;
    }

    public void setDataDiskPolicyRetentionDays(Long dataDiskPolicyRetentionDays) {
        this.dataDiskPolicyRetentionDays = dataDiskPolicyRetentionDays;
    }

    public void setDataDiskPolicyRetentionLastWeek(String dataDiskPolicyRetentionLastWeek) {
        this.dataDiskPolicyRetentionLastWeek = dataDiskPolicyRetentionLastWeek;
    }

    public void setDataDiskPolicyTimePeriod(Long dataDiskPolicyTimePeriod) {
        this.dataDiskPolicyTimePeriod = dataDiskPolicyTimePeriod;
    }

    public void setSystemDiskPolicyEnabled(String systemDiskPolicyEnabled) {
        this.systemDiskPolicyEnabled = systemDiskPolicyEnabled;
    }

    public void setSystemDiskPolicyRetentionDays(Long systemDiskPolicyRetentionDays) {
        this.systemDiskPolicyRetentionDays = systemDiskPolicyRetentionDays;
    }

    public void setSystemDiskPolicyRetentionLastWeek(String systemDiskPolicyRetentionLastWeek) {
        this.systemDiskPolicyRetentionLastWeek = systemDiskPolicyRetentionLastWeek;
    }

    public void setSystemDiskPolicyTimePeriod(Long systemDiskPolicyTimePeriod) {
        this.systemDiskPolicyTimePeriod = systemDiskPolicyTimePeriod;
    }

}
