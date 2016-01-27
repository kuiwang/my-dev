package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * com.aliyun.ess.coordinator.model.ScheduledTaskModel
 *
 * @author auto create
 * @since 1.0, null
 */
public class ScheduledTaskModel extends TaobaoObject {

    private static final long serialVersionUID = 4754795777355622922L;

    /**
     * 定时任务的描述信息
     */
    @ApiField("Description")
    private String description;

    /**
     * 默认600秒
     * 当之前的伸缩活动的cooldown的时间过长或者伸缩组已被停止时，导致错过了定时任务，在LaunchExpirationTime内
     * ，系统会自动重试定时触发，否则放弃本次定时触发
     */
    @ApiField("LaunchExpirationTime")
    private Long launchExpirationTime;

    /**
     * 触发的时间点，按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     * 如果指定了RecurrenceType，则此时间点默认为重复的起始时间点RecurrenceStartTime
     */
    @ApiField("LaunchTime")
    private String launchTime;

    /**
     * Recurrence时间范围的结束值，按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     * 指定EndTime必须同时指定Time否则报错 指定了RecurrenceType，则必须指定RecurrenceEndTime
     */
    @ApiField("RecurrenceEndTime")
    private String recurrenceEndTime;

    /**
     * Hourly，Daily，Weekly，Monthly
     */
    @ApiField("RecurrenceType")
    private String recurrenceType;

    /**
     * 不同循环类型有不同的取值类型
     */
    @ApiField("RecurrenceValue")
    private String recurrenceValue;

    /**
     * 伸缩规则的Ari
     */
    @ApiField("ScheduledAction")
    private String scheduledAction;

    /**
     * 定时任务ID
     */
    @ApiField("ScheduledTaskId")
    private String scheduledTaskId;

    /**
     * 定时任务名称
     */
    @ApiField("ScheduledTaskName")
    private String scheduledTaskName;

    /**
     * True为启动任务
     */
    @ApiField("TaskEnabled")
    private Boolean taskEnabled;

    public String getDescription() {
        return this.description;
    }

    public Long getLaunchExpirationTime() {
        return this.launchExpirationTime;
    }

    public String getLaunchTime() {
        return this.launchTime;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLaunchExpirationTime(Long launchExpirationTime) {
        this.launchExpirationTime = launchExpirationTime;
    }

    public void setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
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

}
