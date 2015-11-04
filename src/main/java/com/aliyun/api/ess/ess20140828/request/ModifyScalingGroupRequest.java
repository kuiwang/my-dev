package com.aliyun.api.ess.ess20140828.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ess.ess20140828.response.ModifyScalingGroupResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ess.aliyuncs.com.ModifyScalingGroup.2014-08-28 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:41
 */
public class ModifyScalingGroupRequest implements AliyunRequest<ModifyScalingGroupResponse> {

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
     * Scaling Group关联的Scaling Configuration Id。
     */
    private String activeScalingConfigurationId;

    /**
     * 默认的冷却时间，单位：秒。 可选，默认值：300秒（默认值系统可配置）。
     * Cooldown是指，当有一个伸缩活动被成功执行后的一段时间内，该Scaling Group不执行其他的伸缩活动。 取值范围：[0,
     * 86400]<br />
     * 支持最大值为：86400<br />
     * 支持最小值为：0
     */
    private Long defaultCooldown;

    /**
     * caling Group下实例个数的最大值。用于控制成本。 弹性伸缩服务在扩展规模，即在需要创建实例时，会保证Scaling
     * Group内的实例个数不大于该值。 MaxSize的值必须大于或等于MinSize的值。 取值范围：[0, 100]
     * 这个最大值需要做到用户级别可配置。 注：包含伸缩组自动创建和用户手工加入的既有ECS实例。
     */
    private Long maxSize;

    /**
     * Scaling Group下实例个数的最小值。用于确保服务的可用性。 弹性伸缩服务在缩小规模，即在需要释放实例时，会保证Scaling
     * Group内的实例个数不小于该值。 取值范围：[0, 100] 注：包含伸缩组自动创建和用户手工加入的既有ECS实例。
     */
    private Long minSize;

    /**
     * 当需要释放实例时，按照指定的策略选择要释放的实例。 取值： OldestInstance：取实例中最早创建的实例
     * NewestInstance：取实例中最新创建的实例 OldestScalingConfiguration：取采用最早伸缩配置创建的实例
     * 可以输入多个，最多可以输入2个。
     */
    private String removalPolicy1;

    /**
     * 当需要释放实例时，按照指定的策略选择要释放的实例。 取值： OldestInstance：取实例中最早创建的实例
     * NewestInstance：取实例中最新创建的实例 OldestScalingConfiguration：取采用最早伸缩配置创建的实例
     * 可以输入多个，最多可以输入2个。
     */
    private String removalPolicy2;

    /**
     * 伸缩组的ID
     */
    private String scalingGroupId;

    /**
     * 伸缩组的名称。英文或中文字符为2-40 个字符（中英文长度一样），以大小字母或中文开头，可包含数字，"_"或"-"。。
     */
    private String scalingGroupName;

    public void setActiveScalingConfigurationId(String activeScalingConfigurationId) {
        this.activeScalingConfigurationId = activeScalingConfigurationId;
    }

    public String getActiveScalingConfigurationId() {
        return this.activeScalingConfigurationId;
    }

    public void setDefaultCooldown(Long defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
    }

    public Long getDefaultCooldown() {
        return this.defaultCooldown;
    }

    public void setMaxSize(Long maxSize) {
        this.maxSize = maxSize;
    }

    public Long getMaxSize() {
        return this.maxSize;
    }

    public void setMinSize(Long minSize) {
        this.minSize = minSize;
    }

    public Long getMinSize() {
        return this.minSize;
    }

    public void setRemovalPolicy1(String removalPolicy1) {
        this.removalPolicy1 = removalPolicy1;
    }

    public String getRemovalPolicy1() {
        return this.removalPolicy1;
    }

    public void setRemovalPolicy2(String removalPolicy2) {
        this.removalPolicy2 = removalPolicy2;
    }

    public String getRemovalPolicy2() {
        return this.removalPolicy2;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public void setScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
    }

    public String getScalingGroupName() {
        return this.scalingGroupName;
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
        return "ess.aliyuncs.com.ModifyScalingGroup.2014-08-28";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("ActiveScalingConfigurationId", this.activeScalingConfigurationId);
        txtParams.put("DefaultCooldown", this.defaultCooldown);
        txtParams.put("MaxSize", this.maxSize);
        txtParams.put("MinSize", this.minSize);
        txtParams.put("RemovalPolicy.1", this.removalPolicy1);
        txtParams.put("RemovalPolicy.2", this.removalPolicy2);
        txtParams.put("ScalingGroupId", this.scalingGroupId);
        txtParams.put("ScalingGroupName", this.scalingGroupName);
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

    public Class<ModifyScalingGroupResponse> getResponseClass() {
        return ModifyScalingGroupResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(defaultCooldown, 86400L, "defaultCooldown");
        RequestCheckUtils.checkMinValue(defaultCooldown, 0L, "defaultCooldown");
        RequestCheckUtils.checkNotEmpty(scalingGroupId, "scalingGroupId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
