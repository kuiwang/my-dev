package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * com.aliyun.ess.coordinator.model.ScalingActivityModel
 *
 * @author auto create
 * @since 1.0, null
 */
public class ScalingActivityModel extends TaobaoObject {

    private static final long serialVersionUID = 2525915528471123395L;

    /**
     * 当前状态，取值：Successful, Failed，InProgress，Warning
     */
    @ApiField("ActivityCode")
    private String activityCode;

    /**
     * 触发伸缩活动的原因（如，XX小时XX分钟定时任务触发等等）
     */
    @ApiField("Cause")
    private String cause;

    /**
     * 伸缩活动的描述信息
     */
    @ApiField("Description")
    private String description;

    /**
     * 运行时间。按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     */
    @ApiField("EndTime")
    private String endTime;

    /**
     * 运行进度。0～100
     */
    @ApiField("Progress")
    private Long progress;

    /**
     * Activity ID。
     */
    @ApiField("ScalingActivityId")
    private String scalingActivityId;

    /**
     * 所属的Scaling Group。
     */
    @ApiField("ScalingGroupId")
    private String scalingGroupId;

    /**
     * 开始时间。按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     */
    @ApiField("StartTime")
    private String startTime;

    /**
     * 结果消息。（如Min～Max边界检查不成功等）
     */
    @ApiField("StatusMessage")
    private String statusMessage;

    public String getActivityCode() {
        return this.activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public String getCause() {
        return this.cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Long getProgress() {
        return this.progress;
    }

    public void setProgress(Long progress) {
        this.progress = progress;
    }

    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    public void setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
    }

    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

}
