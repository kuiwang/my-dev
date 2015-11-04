package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * com.aliyun.ess.coordinator.model.ScalingRuleModel
 *
 * @author auto create
 * @since 1.0, null
 */
public class ScalingRuleModel extends TaobaoObject {

    private static final long serialVersionUID = 7218347947952971983L;

    /**
     * 调整方式，取值： QuantityChangeInCapacity – 按指定个数调整实例（取值范围(0, 100] U (-100,
     * 0]） PercentChangeInCapacity – 按指定百分比调整实例 TotalCapacity –
     * 调整实例个数到指定值（取值范围[0, 100]）
     */
    @ApiField("AdjustmentType")
    private String adjustmentType;

    /**
     * 指定调整值，整数
     */
    @ApiField("AdjustmentValue")
    private Long adjustmentValue;

    /**
     * 冷却时间。 如果设置了Rule的Cooldown，将重载Scaling Group的DefaultCooldown。
     */
    @ApiField("Cooldown")
    private Long cooldown;

    /**
     * 伸缩组的ID
     */
    @ApiField("ScalingGroupId")
    private String scalingGroupId;

    /**
     * 伸缩规则的唯一标识符
     */
    @ApiField("ScalingRuleAri")
    private String scalingRuleAri;

    /**
     * 伸缩规则的ID
     */
    @ApiField("ScalingRuleId")
    private String scalingRuleId;

    /**
     * Scaling Rule名称，用户账号下唯一，非伸缩组下唯一。
     */
    @ApiField("ScalingRuleName")
    private String scalingRuleName;

    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    public Long getAdjustmentValue() {
        return this.adjustmentValue;
    }

    public void setAdjustmentValue(Long adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
    }

    public Long getCooldown() {
        return this.cooldown;
    }

    public void setCooldown(Long cooldown) {
        this.cooldown = cooldown;
    }

    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    public String getScalingRuleAri() {
        return this.scalingRuleAri;
    }

    public void setScalingRuleAri(String scalingRuleAri) {
        this.scalingRuleAri = scalingRuleAri;
    }

    public String getScalingRuleId() {
        return this.scalingRuleId;
    }

    public void setScalingRuleId(String scalingRuleId) {
        this.scalingRuleId = scalingRuleId;
    }

    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public void setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
    }

}
