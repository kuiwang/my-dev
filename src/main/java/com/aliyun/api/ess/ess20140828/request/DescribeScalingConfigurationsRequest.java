package com.aliyun.api.ess.ess20140828.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ess.ess20140828.response.DescribeScalingConfigurationsResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ess.aliyuncs.com.DescribeScalingConfigurations.2014-08-28
 * request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:41
 */
public class DescribeScalingConfigurationsRequest implements
        AliyunRequest<DescribeScalingConfigurationsResponse> {

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
     * PageNumber
     */
    private Long pageNumber;

    /**
     * PageSize<br />
     * 支持最大值为：50
     */
    private Long pageSize;

    /**
     * 伸缩配置所在的region
     */
    private String regionId;

    /**
     * 伸缩配置ID，可以输入多个，最多可以支持10个。返回查询结果时略去失效的ScalingConfigurationId，并且不报错。
     */
    private String scalingConfigurationId1;

    /**
     * ScalingConfigurationId.1
     */
    private String scalingConfigurationId10;

    /**
     * ScalingConfigurationId
     */
    private String scalingConfigurationId2;

    /**
     * ScalingConfigurationId
     */
    private String scalingConfigurationId3;

    /**
     * ScalingConfigurationId.1
     */
    private String scalingConfigurationId4;

    /**
     * ScalingConfigurationId.1
     */
    private String scalingConfigurationId5;

    /**
     * ScalingConfigurationId.1
     */
    private String scalingConfigurationId6;

    /**
     * ScalingConfigurationId.7
     */
    private String scalingConfigurationId7;

    /**
     * ScalingConfigurationId.1
     */
    private String scalingConfigurationId8;

    /**
     * ScalingConfigurationId.1
     */
    private String scalingConfigurationId9;

    /**
     * 伸缩组名称，可以输入多个，最多可以支持10个。返回查询结果时略去失效的ScalingGroupName，并且不报错。
     */
    private String scalingConfigurationName1;

    /**
     * ScalingConfigurationName.1
     */
    private String scalingConfigurationName10;

    /**
     * ScalingConfigurationName.1
     */
    private String scalingConfigurationName2;

    /**
     * ScalingConfigurationName.1
     */
    private String scalingConfigurationName3;

    /**
     * ScalingConfigurationName.1
     */
    private String scalingConfigurationName4;

    /**
     * ScalingConfigurationName.1
     */
    private String scalingConfigurationName5;

    /**
     * ScalingConfigurationName.1
     */
    private String scalingConfigurationName6;

    /**
     * ScalingConfigurationName.1
     */
    private String scalingConfigurationName7;

    /**
     * ScalingConfigurationName.1
     */
    private String scalingConfigurationName8;

    /**
     * ScalingConfigurationName.1
     */
    private String scalingConfigurationName9;

    /**
     * 伸缩组ID
     */
    private String scalingGroupId;

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Long getPageNumber() {
        return this.pageNumber;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setScalingConfigurationId1(String scalingConfigurationId1) {
        this.scalingConfigurationId1 = scalingConfigurationId1;
    }

    public String getScalingConfigurationId1() {
        return this.scalingConfigurationId1;
    }

    public void setScalingConfigurationId10(String scalingConfigurationId10) {
        this.scalingConfigurationId10 = scalingConfigurationId10;
    }

    public String getScalingConfigurationId10() {
        return this.scalingConfigurationId10;
    }

    public void setScalingConfigurationId2(String scalingConfigurationId2) {
        this.scalingConfigurationId2 = scalingConfigurationId2;
    }

    public String getScalingConfigurationId2() {
        return this.scalingConfigurationId2;
    }

    public void setScalingConfigurationId3(String scalingConfigurationId3) {
        this.scalingConfigurationId3 = scalingConfigurationId3;
    }

    public String getScalingConfigurationId3() {
        return this.scalingConfigurationId3;
    }

    public void setScalingConfigurationId4(String scalingConfigurationId4) {
        this.scalingConfigurationId4 = scalingConfigurationId4;
    }

    public String getScalingConfigurationId4() {
        return this.scalingConfigurationId4;
    }

    public void setScalingConfigurationId5(String scalingConfigurationId5) {
        this.scalingConfigurationId5 = scalingConfigurationId5;
    }

    public String getScalingConfigurationId5() {
        return this.scalingConfigurationId5;
    }

    public void setScalingConfigurationId6(String scalingConfigurationId6) {
        this.scalingConfigurationId6 = scalingConfigurationId6;
    }

    public String getScalingConfigurationId6() {
        return this.scalingConfigurationId6;
    }

    public void setScalingConfigurationId7(String scalingConfigurationId7) {
        this.scalingConfigurationId7 = scalingConfigurationId7;
    }

    public String getScalingConfigurationId7() {
        return this.scalingConfigurationId7;
    }

    public void setScalingConfigurationId8(String scalingConfigurationId8) {
        this.scalingConfigurationId8 = scalingConfigurationId8;
    }

    public String getScalingConfigurationId8() {
        return this.scalingConfigurationId8;
    }

    public void setScalingConfigurationId9(String scalingConfigurationId9) {
        this.scalingConfigurationId9 = scalingConfigurationId9;
    }

    public String getScalingConfigurationId9() {
        return this.scalingConfigurationId9;
    }

    public void setScalingConfigurationName1(String scalingConfigurationName1) {
        this.scalingConfigurationName1 = scalingConfigurationName1;
    }

    public String getScalingConfigurationName1() {
        return this.scalingConfigurationName1;
    }

    public void setScalingConfigurationName10(String scalingConfigurationName10) {
        this.scalingConfigurationName10 = scalingConfigurationName10;
    }

    public String getScalingConfigurationName10() {
        return this.scalingConfigurationName10;
    }

    public void setScalingConfigurationName2(String scalingConfigurationName2) {
        this.scalingConfigurationName2 = scalingConfigurationName2;
    }

    public String getScalingConfigurationName2() {
        return this.scalingConfigurationName2;
    }

    public void setScalingConfigurationName3(String scalingConfigurationName3) {
        this.scalingConfigurationName3 = scalingConfigurationName3;
    }

    public String getScalingConfigurationName3() {
        return this.scalingConfigurationName3;
    }

    public void setScalingConfigurationName4(String scalingConfigurationName4) {
        this.scalingConfigurationName4 = scalingConfigurationName4;
    }

    public String getScalingConfigurationName4() {
        return this.scalingConfigurationName4;
    }

    public void setScalingConfigurationName5(String scalingConfigurationName5) {
        this.scalingConfigurationName5 = scalingConfigurationName5;
    }

    public String getScalingConfigurationName5() {
        return this.scalingConfigurationName5;
    }

    public void setScalingConfigurationName6(String scalingConfigurationName6) {
        this.scalingConfigurationName6 = scalingConfigurationName6;
    }

    public String getScalingConfigurationName6() {
        return this.scalingConfigurationName6;
    }

    public void setScalingConfigurationName7(String scalingConfigurationName7) {
        this.scalingConfigurationName7 = scalingConfigurationName7;
    }

    public String getScalingConfigurationName7() {
        return this.scalingConfigurationName7;
    }

    public void setScalingConfigurationName8(String scalingConfigurationName8) {
        this.scalingConfigurationName8 = scalingConfigurationName8;
    }

    public String getScalingConfigurationName8() {
        return this.scalingConfigurationName8;
    }

    public void setScalingConfigurationName9(String scalingConfigurationName9) {
        this.scalingConfigurationName9 = scalingConfigurationName9;
    }

    public String getScalingConfigurationName9() {
        return this.scalingConfigurationName9;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    public String getScalingGroupId() {
        return this.scalingGroupId;
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
        return "ess.aliyuncs.com.DescribeScalingConfigurations.2014-08-28";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("PageNumber", this.pageNumber);
        txtParams.put("PageSize", this.pageSize);
        txtParams.put("RegionId", this.regionId);
        txtParams.put("ScalingConfigurationId.1", this.scalingConfigurationId1);
        txtParams.put("ScalingConfigurationId.10", this.scalingConfigurationId10);
        txtParams.put("ScalingConfigurationId.2", this.scalingConfigurationId2);
        txtParams.put("ScalingConfigurationId.3", this.scalingConfigurationId3);
        txtParams.put("ScalingConfigurationId.4", this.scalingConfigurationId4);
        txtParams.put("ScalingConfigurationId.5", this.scalingConfigurationId5);
        txtParams.put("ScalingConfigurationId.6", this.scalingConfigurationId6);
        txtParams.put("ScalingConfigurationId.7", this.scalingConfigurationId7);
        txtParams.put("ScalingConfigurationId.8", this.scalingConfigurationId8);
        txtParams.put("ScalingConfigurationId.9", this.scalingConfigurationId9);
        txtParams.put("ScalingConfigurationName.1", this.scalingConfigurationName1);
        txtParams.put("ScalingConfigurationName.10", this.scalingConfigurationName10);
        txtParams.put("ScalingConfigurationName.2", this.scalingConfigurationName2);
        txtParams.put("ScalingConfigurationName.3", this.scalingConfigurationName3);
        txtParams.put("ScalingConfigurationName.4", this.scalingConfigurationName4);
        txtParams.put("ScalingConfigurationName.5", this.scalingConfigurationName5);
        txtParams.put("ScalingConfigurationName.6", this.scalingConfigurationName6);
        txtParams.put("ScalingConfigurationName.7", this.scalingConfigurationName7);
        txtParams.put("ScalingConfigurationName.8", this.scalingConfigurationName8);
        txtParams.put("ScalingConfigurationName.9", this.scalingConfigurationName9);
        txtParams.put("ScalingGroupId", this.scalingGroupId);
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

    public Class<DescribeScalingConfigurationsResponse> getResponseClass() {
        return DescribeScalingConfigurationsResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(pageSize, 50L, "pageSize");
        RequestCheckUtils.checkNotEmpty(regionId, "regionId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
