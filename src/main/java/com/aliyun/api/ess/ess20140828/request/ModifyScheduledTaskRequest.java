package com.aliyun.api.ess.ess20140828.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ess.ess20140828.response.ModifyScheduledTaskResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ess.aliyuncs.com.ModifyScheduledTask.2014-08-28 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:41
 */
public class ModifyScheduledTaskRequest implements AliyunRequest<ModifyScheduledTaskResponse> {

    /**
     * 定时任务的描述信息 长度限制在2~200个英文字符，可以支持中文。（中英文长度一样）
     */
    private String description;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 默认600秒
     * 当之前的伸缩活动的cooldown的时间过长或者伸缩组已被停止时，导致错过了定时任务，在LaunchExpirationTime内
     * ，系统会自动重试定时触发，否则放弃本次定时触发 取值范围：[0, 86400]<br />
     * 支持最大值为：86400<br />
     * 支持最小值为：0
     */
    private Long launchExpirationTime;

    /**
     * 触发的时间点，按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     * 如果指定了RecurrenceType，则此时间点默认为重复的起始时间点RecurrenceStartTime
     */
    private String launchTime;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * Recurrence时间范围的结束值，按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     * 
     * 指定了RecurrenceType，则必须指定RecurrenceEndTime
     */
    private String recurrenceEndTime;

    /**
     * Hourly，Daily，Weekly，Monthly
     */
    private String recurrenceType;

    /**
     * 不同循环类型有不同的取值类型
     */
    private String recurrenceValue;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * 伸缩规则的Ari
     */
    private String scheduledAction;

    /**
     * 定时任务的ID
     */
    private String scheduledTaskId;

    /**
     * 定时任务的名称，同一region，同一用户账号下唯一。 如果没有指定该参数，默认值为实例的ScheduledScalingTaskId
     * 英文或中文字符为2-40 个字符（中英文长度一样），以大小字母或中文开头，可包含数字，"_"或"-"。
     */
    private String scheduledTaskName;

    /**
     * True为启动任务
     */
    private Boolean taskEnabled;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(launchExpirationTime, 86400L, "launchExpirationTime");
        RequestCheckUtils.checkMinValue(launchExpirationTime, 0L, "launchExpirationTime");
        RequestCheckUtils.checkNotEmpty(scheduledTaskId, "scheduledTaskId");
    }

    @Override
    public String getApiMethodName() {
        return "ess.aliyuncs.com.ModifyScheduledTask.2014-08-28";
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getLaunchExpirationTime() {
        return this.launchExpirationTime;
    }

    public String getLaunchTime() {
        return this.launchTime;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getRecurrenceEndTime() {
        return this.recurrenceEndTime;
    }

    public String getRecurrenceType() {
        return this.recurrenceType;
    }

    public String getRecurrenceValue() {
        return this.recurrenceValue;
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    @Override
    public Class<ModifyScheduledTaskResponse> getResponseClass() {
        return ModifyScheduledTaskResponse.class;
    }

    public String getScheduledAction() {
        return this.scheduledAction;
    }

    public String getScheduledTaskId() {
        return this.scheduledTaskId;
    }

    public String getScheduledTaskName() {
        return this.scheduledTaskName;
    }

    public Boolean getTaskEnabled() {
        return this.taskEnabled;
    }

    @Override
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
        txtParams.put("ScheduledAction", this.scheduledAction);
        txtParams.put("ScheduledTaskId", this.scheduledTaskId);
        txtParams.put("ScheduledTaskName", this.scheduledTaskName);
        txtParams.put("TaskEnabled", this.taskEnabled);
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLaunchExpirationTime(Long launchExpirationTime) {
        this.launchExpirationTime = launchExpirationTime;
    }

    public void setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public void setRecurrenceEndTime(String recurrenceEndTime) {
        this.recurrenceEndTime = recurrenceEndTime;
    }

    public void setRecurrenceType(String recurrenceType) {
        this.recurrenceType = recurrenceType;
    }

    public void setRecurrenceValue(String recurrenceValue) {
        this.recurrenceValue = recurrenceValue;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public void setScheduledAction(String scheduledAction) {
        this.scheduledAction = scheduledAction;
    }

    public void setScheduledTaskId(String scheduledTaskId) {
        this.scheduledTaskId = scheduledTaskId;
    }

    public void setScheduledTaskName(String scheduledTaskName) {
        this.scheduledTaskName = scheduledTaskName;
    }

    public void setTaskEnabled(Boolean taskEnabled) {
        this.taskEnabled = taskEnabled;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
