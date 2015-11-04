package com.aliyun.api.ecs.ecs20140526.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ecs.ecs20140526.response.ModifyAutoSnapshotPolicyResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ecs.aliyuncs.com.ModifyAutoSnapshotPolicy.2014-05-26 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:38
 */
public class ModifyAutoSnapshotPolicyRequest implements
        AliyunRequest<ModifyAutoSnapshotPolicyResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * 数据盘自动快照策略开关： True：该磁盘属性的磁盘打自动快照， False：不打自动快照， 默认值：无，表示保留当前值
     */
    private Boolean dataDiskPolicyEnabled;

    /**
     * 数据盘自动快照策略的保留天数： 可选值， 1，2，3， 默认值：无，表示保留当前值<br />
     * 支持最大值为：3<br />
     * 支持最小值为：1
     */
    private Long dataDiskPolicyRetentionDays;

    /**
     * 数据盘自动快照策略的保留上周日选项： True：代表保留上周日的快照， False：不保留， 默认值：无，表示保留当前值
     */
    private Boolean dataDiskPolicyRetentionLastWeek;

    /**
     * 数据盘自动快照策略的时间段： 4个时间段， 1：1:00-7:00 2：7:00-13:00 3：13:00-19:00
     * 4：19:00-1:00 默认值：无，表示保留当前值<br />
     * 支持最大值为：4<br />
     * 支持最小值为：1
     */
    private Long dataDiskPolicyTimePeriod;

    /**
     * 系统盘自动快照策略开关
     */
    private Boolean systemDiskPolicyEnabled;

    /**
     * 系统盘自动快照策略的保留天数： 可选值， 1，2，3， 默认值：无，表示保留当前值<br />
     * 支持最大值为：3<br />
     * 支持最小值为：1
     */
    private Long systemDiskPolicyRetentionDays;

    /**
     * 系统盘自动快照策略的保留上周日选项： True：代表保留上周日的快照， False：不保留， 默认值：无，表示保留当前值
     */
    private Boolean systemDiskPolicyRetentionLastWeek;

    /**
     * 系统盘自动快照策略的时间段： 4个时间段， 1：1:00-7:00 2：7:00-13:00 3：13:00-19:00
     * 4：19:00-1:00 默认值：无，表示保留当前值<br />
     * 支持最大值为：4<br />
     * 支持最小值为：1
     */
    private Long systemDiskPolicyTimePeriod;

    public void setDataDiskPolicyEnabled(Boolean dataDiskPolicyEnabled) {
        this.dataDiskPolicyEnabled = dataDiskPolicyEnabled;
    }

    public Boolean getDataDiskPolicyEnabled() {
        return this.dataDiskPolicyEnabled;
    }

    public void setDataDiskPolicyRetentionDays(Long dataDiskPolicyRetentionDays) {
        this.dataDiskPolicyRetentionDays = dataDiskPolicyRetentionDays;
    }

    public Long getDataDiskPolicyRetentionDays() {
        return this.dataDiskPolicyRetentionDays;
    }

    public void setDataDiskPolicyRetentionLastWeek(Boolean dataDiskPolicyRetentionLastWeek) {
        this.dataDiskPolicyRetentionLastWeek = dataDiskPolicyRetentionLastWeek;
    }

    public Boolean getDataDiskPolicyRetentionLastWeek() {
        return this.dataDiskPolicyRetentionLastWeek;
    }

    public void setDataDiskPolicyTimePeriod(Long dataDiskPolicyTimePeriod) {
        this.dataDiskPolicyTimePeriod = dataDiskPolicyTimePeriod;
    }

    public Long getDataDiskPolicyTimePeriod() {
        return this.dataDiskPolicyTimePeriod;
    }

    public void setSystemDiskPolicyEnabled(Boolean systemDiskPolicyEnabled) {
        this.systemDiskPolicyEnabled = systemDiskPolicyEnabled;
    }

    public Boolean getSystemDiskPolicyEnabled() {
        return this.systemDiskPolicyEnabled;
    }

    public void setSystemDiskPolicyRetentionDays(Long systemDiskPolicyRetentionDays) {
        this.systemDiskPolicyRetentionDays = systemDiskPolicyRetentionDays;
    }

    public Long getSystemDiskPolicyRetentionDays() {
        return this.systemDiskPolicyRetentionDays;
    }

    public void setSystemDiskPolicyRetentionLastWeek(Boolean systemDiskPolicyRetentionLastWeek) {
        this.systemDiskPolicyRetentionLastWeek = systemDiskPolicyRetentionLastWeek;
    }

    public Boolean getSystemDiskPolicyRetentionLastWeek() {
        return this.systemDiskPolicyRetentionLastWeek;
    }

    public void setSystemDiskPolicyTimePeriod(Long systemDiskPolicyTimePeriod) {
        this.systemDiskPolicyTimePeriod = systemDiskPolicyTimePeriod;
    }

    public Long getSystemDiskPolicyTimePeriod() {
        return this.systemDiskPolicyTimePeriod;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "ecs.aliyuncs.com.ModifyAutoSnapshotPolicy.2014-05-26";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("DataDiskPolicyEnabled", this.dataDiskPolicyEnabled);
        txtParams.put("DataDiskPolicyRetentionDays", this.dataDiskPolicyRetentionDays);
        txtParams.put("DataDiskPolicyRetentionLastWeek", this.dataDiskPolicyRetentionLastWeek);
        txtParams.put("DataDiskPolicyTimePeriod", this.dataDiskPolicyTimePeriod);
        txtParams.put("SystemDiskPolicyEnabled", this.systemDiskPolicyEnabled);
        txtParams.put("SystemDiskPolicyRetentionDays", this.systemDiskPolicyRetentionDays);
        txtParams.put("SystemDiskPolicyRetentionLastWeek", this.systemDiskPolicyRetentionLastWeek);
        txtParams.put("SystemDiskPolicyTimePeriod", this.systemDiskPolicyTimePeriod);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<ModifyAutoSnapshotPolicyResponse> getResponseClass() {
        return ModifyAutoSnapshotPolicyResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(dataDiskPolicyRetentionDays, 3L,
                "dataDiskPolicyRetentionDays");
        RequestCheckUtils.checkMinValue(dataDiskPolicyRetentionDays, 1L,
                "dataDiskPolicyRetentionDays");
        RequestCheckUtils.checkMaxValue(dataDiskPolicyTimePeriod, 4L, "dataDiskPolicyTimePeriod");
        RequestCheckUtils.checkMinValue(dataDiskPolicyTimePeriod, 1L, "dataDiskPolicyTimePeriod");
        RequestCheckUtils.checkMaxValue(systemDiskPolicyRetentionDays, 3L,
                "systemDiskPolicyRetentionDays");
        RequestCheckUtils.checkMinValue(systemDiskPolicyRetentionDays, 1L,
                "systemDiskPolicyRetentionDays");
        RequestCheckUtils.checkMaxValue(systemDiskPolicyTimePeriod, 4L,
                "systemDiskPolicyTimePeriod");
        RequestCheckUtils.checkMinValue(systemDiskPolicyTimePeriod, 1L,
                "systemDiskPolicyTimePeriod");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
