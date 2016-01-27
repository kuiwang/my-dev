package com.aliyun.api.ess.ess20140828.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ess.ess20140828.response.CreateScalingGroupResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ess.aliyuncs.com.CreateScalingGroup.2014-08-28 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:40
 */
public class CreateScalingGroupRequest implements AliyunRequest<CreateScalingGroupResponse> {

    /**
     * 创建ECS实例后，需要加IP白名单的RDS实例，可以输入多个，最多可以输入10个。任何一个出错则报错。
     */
    private String dBInstanceId1;

    /**
     * 创建ECS实例后，需要加IP白名单的RDS实例，可以输入多个，最多可以输入10个。任何一个出错则报错。
     */
    private String dBInstanceId2;

    /**
     * 创建ECS实例后，需要加IP白名单的RDS实例，可以输入多个，最多可以输入10个。任何一个出错则报错。
     */
    private String dBInstanceId3;

    /**
     * 默认的冷却时间，单位：秒。 可选，默认值：300秒（默认值系统可配置）。
     * Cooldown是指，当有一个伸缩活动被成功执行后的一段时间内，该Scaling Group不执行其他的伸缩活动。 取值范围：[0,
     * 86400]
     */
    private Long defaultCooldown;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 扩展ECS实例后，需要加入的SLB信息，仅支持一个
     */
    private String loadBalancerId;

    /**
     * Scaling Group下实例个数的最大值。用于控制成本。 弹性伸缩服务在扩展规模，即在需要创建实例时，会保证Scaling
     * Group内的实例个数不大于该值。 MaxSize的值必须大于或等于MinSize的值。 取值范围：[0, 100]
     * 这个最大值需要做到用户级别可配置。 注：包含伸缩组自动创建和用户手工加入的既有ECS实例。
     */
    private Long maxSize;

    /**
     * Scaling Group下实例个数的最小值。用于确保服务的可用性。 弹性伸缩服务在缩小规模，即在需要释放实例时，会保证Scaling
     * Group内的实例个数不小于该值。 取值范围：[0, 100] 注：包含伸缩组自动创建和用户手工加入的既有ECS实例。
     */
    private Long minSize;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * Scaling Group所在的Region。只支持cn-hangzhou格式，不支持cn-hangzhou-dg-01格式。
     */
    private String regionId;

    /**
     * 当需要释放实例时，按照指定的策略选择要释放的实例。 取值： OldestInstance：取实例中最早创建的实例
     * NewestInstance：取实例中最新创建的实例 OldestScalingConfiguration：取采用最早伸缩配置创建的实例
     * 默认值是：OldestScalingConfiguration、OldestInstance
     * 可以输入多个，最多可以输入2个。任何一个出错则报错。
     */
    private String removalPolicy1;

    /**
     * 当需要释放实例时，按照指定的策略选择要释放的实例。 取值： OldestInstance：取实例中最早创建的实例
     * NewestInstance：取实例中最新创建的实例 OldestScalingConfiguration：取采用最早伸缩配置创建的实例
     * 默认值是：OldestScalingConfiguration、OldestInstance
     * 可以输入多个，最多可以输入2个。任何一个出错则报错。
     */
    private String removalPolicy2;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * Scaling Group名称，同一region，同一用户账号下唯一。
     * 如果没有指定该参数，默认值为实例的ScalingGroupId。英文或中文字符为2-40
     * 个字符，以大小字母或中文开头，可包含数字，"_"或"-"。
     */
    private String scalingGroupName;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(maxSize, "maxSize");
        RequestCheckUtils.checkNotEmpty(regionId, "regionId");
    }

    @Override
    public String getApiMethodName() {
        return "ess.aliyuncs.com.CreateScalingGroup.2014-08-28";
    }

    public String getdBInstanceId1() {
        return this.dBInstanceId1;
    }

    public String getdBInstanceId2() {
        return this.dBInstanceId2;
    }

    public String getdBInstanceId3() {
        return this.dBInstanceId3;
    }

    public Long getDefaultCooldown() {
        return this.defaultCooldown;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public Long getMaxSize() {
        return this.maxSize;
    }

    public Long getMinSize() {
        return this.minSize;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public String getRemovalPolicy1() {
        return this.removalPolicy1;
    }

    public String getRemovalPolicy2() {
        return this.removalPolicy2;
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    @Override
    public Class<CreateScalingGroupResponse> getResponseClass() {
        return CreateScalingGroupResponse.class;
    }

    public String getScalingGroupName() {
        return this.scalingGroupName;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("DBInstanceId.1", this.dBInstanceId1);
        txtParams.put("DBInstanceId.2", this.dBInstanceId2);
        txtParams.put("DBInstanceId.3", this.dBInstanceId3);
        txtParams.put("DefaultCooldown", this.defaultCooldown);
        txtParams.put("LoadBalancerId", this.loadBalancerId);
        txtParams.put("MaxSize", this.maxSize);
        txtParams.put("MinSize", this.minSize);
        txtParams.put("RegionId", this.regionId);
        txtParams.put("RemovalPolicy.1", this.removalPolicy1);
        txtParams.put("RemovalPolicy.2", this.removalPolicy2);
        txtParams.put("ScalingGroupName", this.scalingGroupName);
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

    public void setdBInstanceId1(String dBInstanceId1) {
        this.dBInstanceId1 = dBInstanceId1;
    }

    public void setdBInstanceId2(String dBInstanceId2) {
        this.dBInstanceId2 = dBInstanceId2;
    }

    public void setdBInstanceId3(String dBInstanceId3) {
        this.dBInstanceId3 = dBInstanceId3;
    }

    public void setDefaultCooldown(Long defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public void setMaxSize(Long maxSize) {
        this.maxSize = maxSize;
    }

    public void setMinSize(Long minSize) {
        this.minSize = minSize;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public void setRemovalPolicy1(String removalPolicy1) {
        this.removalPolicy1 = removalPolicy1;
    }

    public void setRemovalPolicy2(String removalPolicy2) {
        this.removalPolicy2 = removalPolicy2;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public void setScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
