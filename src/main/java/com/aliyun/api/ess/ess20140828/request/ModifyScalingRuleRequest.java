package com.aliyun.api.ess.ess20140828.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ess.ess20140828.response.ModifyScalingRuleResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ess.aliyuncs.com.ModifyScalingRule.2014-08-28 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:41
 */
public class ModifyScalingRuleRequest implements AliyunRequest<ModifyScalingRuleResponse> {

    /**
     * 调整方式，取值： QuantityChangeInCapacity – 按指定个数调整实例（取值范围(0, 100] U (-100,
     * 0]） PercentChangeInCapacity – 按指定百分比调整实例 TotalCapacity –
     * 调整实例个数到指定值（取值范围[0, 100]）
     */
    private String adjustmentType;

    /**
     * 指定调整值，整数
     */
    private Long adjustmentValue;

    /**
     * 冷却时间。 如果设置了Rule的Cooldown，将重载Scaling Group的DefaultCooldown。
     * 如果没设置Rule的Cooldown，则按DefaultCooldown来执行，但不是用DefaultCooldown来覆盖此属性
     * 默认值为：空
     */
    private Long cooldown;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * 伸缩规则id
     */
    private String scalingRuleId;

    /**
     * ScalingRuleName
     */
    private String scalingRuleName;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(scalingRuleId, "scalingRuleId");
    }

    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    public Long getAdjustmentValue() {
        return this.adjustmentValue;
    }

    @Override
    public String getApiMethodName() {
        return "ess.aliyuncs.com.ModifyScalingRule.2014-08-28";
    }

    public Long getCooldown() {
        return this.cooldown;
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

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    @Override
    public Class<ModifyScalingRuleResponse> getResponseClass() {
        return ModifyScalingRuleResponse.class;
    }

    public String getScalingRuleId() {
        return this.scalingRuleId;
    }

    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("AdjustmentType", this.adjustmentType);
        txtParams.put("AdjustmentValue", this.adjustmentValue);
        txtParams.put("Cooldown", this.cooldown);
        txtParams.put("ScalingRuleId", this.scalingRuleId);
        txtParams.put("ScalingRuleName", this.scalingRuleName);
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

    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    public void setAdjustmentValue(Long adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
    }

    public void setCooldown(Long cooldown) {
        this.cooldown = cooldown;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public void setScalingRuleId(String scalingRuleId) {
        this.scalingRuleId = scalingRuleId;
    }

    public void setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
