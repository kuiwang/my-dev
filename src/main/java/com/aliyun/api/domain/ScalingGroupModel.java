package com.aliyun.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * com.aliyun.ess.coordinator.model.ScalingGroupModel
 *
 * @author auto create
 * @since 1.0, null
 */
public class ScalingGroupModel extends TaobaoObject {

    private static final long serialVersionUID = 6383422153468719616L;

    /**
     * 已成功加入伸缩组，并正常运行的ECS实例数量
     */
    @ApiField("ActiveCapacity")
    private Long activeCapacity;

    /**
     * Scaling Group关联的Scaling Configuration Id。
     */
    @ApiField("ActiveScalingConfigurationId")
    private String activeScalingConfigurationId;

    /**
     * 创建时间。按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     */
    @ApiField("CreationTime")
    private String creationTime;

    /**
     * 创建ECS实例后，需要加IP白名单的RDS实例，可以输出多个，以< DBInstanceId>分割。
     */
    @ApiListField("DBInstanceIds")
    @ApiField("String")
    private List<String> dBInstanceIds;

    /**
     * 默认的冷却时间，单位：秒。 可选，默认值：300秒 Cooldown是指，当有一个伸缩活动被成功执行后的一段时间内，该Scaling
     * Group不执行其他的伸缩活动。
     */
    @ApiField("DefaultCooldown")
    private Long defaultCooldown;

    /**
     * Active、Inactive或Deleting
     */
    @ApiField("LifecycleState")
    private String lifecycleState;

    /**
     * 扩展ECS实例后，需要加入的SLB信息，仅支持一个。（未来可能会支持多个）
     */
    @ApiField("LoadBalancerId")
    private String loadBalancerId;

    /**
     * Scaling Group下实例个数的最大值。用于控制成本。 弹性伸缩服务在扩展规模，即在需要创建实例时，会保证Scaling
     * Group内的实例个数不大于该值。 MaxSize的值必须大于或等于MinSize的值。 取值范围：[0, 100]
     * 这个最大值需要做到用户级别可配置。 注：包含伸缩组自动创建和用户手工加入的既有ECS实例。
     */
    @ApiField("MaxSize")
    private Long maxSize;

    /**
     * Scaling Group下实例个数的最小值。用于确保服务的可用性。 弹性伸缩服务在缩小规模，即在需要释放实例时，会保证Scaling
     * Group内的实例个数不小于该值。 取值范围：[0, 100] 注：包含伸缩组自动创建和用户手工加入的既有ECS实例。
     */
    @ApiField("MinSize")
    private Long minSize;

    /**
     * 正在加入伸缩组，还在创建和配置过程中的ECS实例数量
     */
    @ApiField("PendingCapacity")
    private Long pendingCapacity;

    /**
     * Scaling Group所在的Region
     */
    @ApiField("RegionId")
    private String regionId;

    /**
     * 当需要释放实例时，按照指定的策略选择要释放的实例。 取值： OldestInstance：取实例中最早创建的实例
     * NewestInstance：取实例中最新创建的实例 OldestScalingConfiguration：取采用最早伸缩配置创建的实例
     * 可以输出多个，以< RemovalPolicy >分割。
     */
    @ApiListField("RemovalPolicies")
    @ApiField("String")
    private List<String> removalPolicies;

    /**
     * 正在加入伸缩组，还在创建和配置过程中的ECS实例数量
     */
    @ApiField("RemovingCapacity")
    private Long removingCapacity;

    /**
     * 伸缩组的ID
     */
    @ApiField("ScalingGroupId")
    private String scalingGroupId;

    /**
     * Scaling Group名称，用户账号下唯一
     */
    @ApiField("ScalingGroupName")
    private String scalingGroupName;

    /**
     * 伸缩组内所有ECS实例的数量
     */
    @ApiField("TotalCapacity")
    private Long totalCapacity;

    public Long getActiveCapacity() {
        return this.activeCapacity;
    }

    public void setActiveCapacity(Long activeCapacity) {
        this.activeCapacity = activeCapacity;
    }

    public String getActiveScalingConfigurationId() {
        return this.activeScalingConfigurationId;
    }

    public void setActiveScalingConfigurationId(String activeScalingConfigurationId) {
        this.activeScalingConfigurationId = activeScalingConfigurationId;
    }

    public String getCreationTime() {
        return this.creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public List<String> getdBInstanceIds() {
        return this.dBInstanceIds;
    }

    public void setdBInstanceIds(List<String> dBInstanceIds) {
        this.dBInstanceIds = dBInstanceIds;
    }

    public Long getDefaultCooldown() {
        return this.defaultCooldown;
    }

    public void setDefaultCooldown(Long defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
    }

    public String getLifecycleState() {
        return this.lifecycleState;
    }

    public void setLifecycleState(String lifecycleState) {
        this.lifecycleState = lifecycleState;
    }

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public Long getMaxSize() {
        return this.maxSize;
    }

    public void setMaxSize(Long maxSize) {
        this.maxSize = maxSize;
    }

    public Long getMinSize() {
        return this.minSize;
    }

    public void setMinSize(Long minSize) {
        this.minSize = minSize;
    }

    public Long getPendingCapacity() {
        return this.pendingCapacity;
    }

    public void setPendingCapacity(Long pendingCapacity) {
        this.pendingCapacity = pendingCapacity;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public List<String> getRemovalPolicies() {
        return this.removalPolicies;
    }

    public void setRemovalPolicies(List<String> removalPolicies) {
        this.removalPolicies = removalPolicies;
    }

    public Long getRemovingCapacity() {
        return this.removingCapacity;
    }

    public void setRemovingCapacity(Long removingCapacity) {
        this.removingCapacity = removingCapacity;
    }

    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    public String getScalingGroupName() {
        return this.scalingGroupName;
    }

    public void setScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
    }

    public Long getTotalCapacity() {
        return this.totalCapacity;
    }

    public void setTotalCapacity(Long totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

}
