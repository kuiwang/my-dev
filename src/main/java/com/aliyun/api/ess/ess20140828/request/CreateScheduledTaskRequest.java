package com.aliyun.api.ess.ess20140828.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ess.ess20140828.response.CreateScheduledTaskResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ess.aliyuncs.com.CreateScheduledTask.2014-08-28 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:40
 */
public class CreateScheduledTaskRequest implements AliyunRequest<CreateScheduledTaskResponse> {

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
     * 定时任务的描述信息 长度限制在2~200个英文字符，可以支持中文。（中英文长度一样）
     */
    private String description;

    /**
     * 默认600秒
     * 当前正在发生伸缩活动或者伸缩组已被停止时，导致错过了定时任务，在LaunchExpirationTime内，系统会自动重试定时触发
     * ，否则放弃本次定时触发 取值范围：[0, 86400]<br />
     * 支持最大值为：86400<br />
     * 支持最小值为：0
     */
    private Long launchExpirationTime;

    /**
     * 触发的时间点，按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     * 如果指定了RecurrenceType，则此时间点默认为重复的起始时间点RecurrenceStartTime
     * 不能填写自创建或修改当天起3个月后的时间。
     */
    private String launchTime;

    /**
     * Recurrence时间范围的结束值，按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     * 
     * 指定了RecurrenceType，则必须指定RecurrenceEndTime 不能填写自创建或修改当天起3个月后的时间。
     */
    private String recurrenceEndTime;

    /**
     * Daily，Weekly，Monthly
     */
    private String recurrenceType;

    /**
     * 不同循环类型有不同的取值类型
     */
    private String recurrenceValue;

    /**
     * 定时任务所在的Region
     */
    private String regionId;

    /**
     * 伸缩规则的Ari
     */
    private String scheduledAction;

    /**
     * 定时任务的名称，同一region，同一用户账号下唯一。 如果没有指定该参数，默认值为实例的ScheduledScalingTaskId
     * 英文或中文字符为2-40 个字符（中英文长度一样），以大小字母或中文开头，可包含数字，"_"或"-"。
     */
    private String scheduledTaskName;

    /**
     * Ture为启动任务 False为停止任务 默认为True
     */
    private Boolean taskEnabled;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setLaunchExpirationTime(Long launchExpirationTime) {
        this.launchExpirationTime = launchExpirationTime;
    }

    public Long getLaunchExpirationTime() {
        return this.launchExpirationTime;
    }

    public void setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
    }

    public String getLaunchTime() {
        return this.launchTime;
    }

    public void setRecurrenceEndTime(String recurrenceEndTime) {
        this.recurrenceEndTime = recurrenceEndTime;
    }

    public String getRecurrenceEndTime() {
        return this.recurrenceEndTime;
    }

    public void setRecurrenceType(String recurrenceType) {
        this.recurrenceType = recurrenceType;
    }

    public String getRecurrenceType() {
        return this.recurrenceType;
    }

    public void setRecurrenceValue(String recurrenceValue) {
        this.recurrenceValue = recurrenceValue;
    }

    public String getRecurrenceValue() {
        return this.recurrenceValue;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setScheduledAction(String scheduledAction) {
        this.scheduledAction = scheduledAction;
    }

    public String getScheduledAction() {
        return this.scheduledAction;
    }

    public void setScheduledTaskName(String scheduledTaskName) {
        this.scheduledTaskName = scheduledTaskName;
    }

    public String getScheduledTaskName() {
        return this.scheduledTaskName;
    }

    public void setTaskEnabled(Boolean taskEnabled) {
        this.taskEnabled = taskEnabled;
    }

    public Boolean getTaskEnabled() {
        return this.taskEnabled;
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
        return "ess.aliyuncs.com.CreateScheduledTask.2014-08-28";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("Description", this.description);
        txtParams.put("LaunchExpirationTime", this.launchExpirationTime);
        txtParams.put("LaunchTime", this.launchTime);
        txtParams.put("RecurrenceEndTime", this.recurrenceEndTime);
        txtParams.put("RecurrenceType", this.recurrenceType);
        txtParams.put("RecurrenceValue", this.recurrenceValue);
        txtParams.put("RegionId", this.regionId);
        txtParams.put("ScheduledAction", this.scheduledAction);
        txtParams.put("ScheduledTaskName", this.scheduledTaskName);
        txtParams.put("TaskEnabled", this.taskEnabled);
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

    public Class<CreateScheduledTaskResponse> getResponseClass() {
        return CreateScheduledTaskResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(launchExpirationTime, 86400L, "launchExpirationTime");
        RequestCheckUtils.checkMinValue(launchExpirationTime, 0L, "launchExpirationTime");
        RequestCheckUtils.checkNotEmpty(regionId, "regionId");
        RequestCheckUtils.checkNotEmpty(scheduledAction, "scheduledAction");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
