package com.aliyun.api.ess.ess20140828.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ess.ess20140828.response.DescribeScalingActivitiesResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ess.aliyuncs.com.DescribeScalingActivities.2014-08-28 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:40
 */
public class DescribeScalingActivitiesRequest implements
        AliyunRequest<DescribeScalingActivitiesResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

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
     * 伸缩活动所在的region
     */
    private String regionId;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * 伸缩活动的ID，可以输入多个，最多可以支持20个。返回查询结果时略去失效的ScalingRuleId，并且不报错。
     */
    private String scalingActivityId1;

    /**
     * ScalingActivityId.
     */
    private String scalingActivityId10;

    /**
     * ScalingActivityId.
     */
    private String scalingActivityId11;

    /**
     * ScalingActivityId.
     */
    private String scalingActivityId12;

    /**
     * ScalingActivityId.
     */
    private String scalingActivityId13;

    /**
     * ScalingActivityId.
     */
    private String scalingActivityId14;

    /**
     * ScalingActivityId.
     */
    private String scalingActivityId15;

    /**
     * ScalingActivityId.
     */
    private String scalingActivityId16;

    /**
     * ScalingActivityId.
     */
    private String scalingActivityId17;

    /**
     * ScalingActivityId.
     */
    private String scalingActivityId18;

    /**
     * ScalingActivityId.
     */
    private String scalingActivityId19;

    /**
     * ScalingActivityId
     */
    private String scalingActivityId2;

    /**
     * ScalingActivityId
     */
    private String scalingActivityId20;

    /**
     * ScalingActivityId.
     */
    private String scalingActivityId3;

    /**
     * ScalingActivityId.
     */
    private String scalingActivityId4;

    /**
     * ScalingActivityId.
     */
    private String scalingActivityId5;

    /**
     * ScalingActivityId.
     */
    private String scalingActivityId6;

    /**
     * ScalingActivityId.
     */
    private String scalingActivityId7;

    /**
     * ScalingActivityId.
     */
    private String scalingActivityId8;

    /**
     * ScalingActivityId.
     */
    private String scalingActivityId9;

    /**
     * 伸缩组的ID
     */
    private String scalingGroupId;

    /**
     * 伸缩活动的状态。 取值：Successful, Failed，InProgress，Warning
     */
    private String statusCode;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(pageSize, 50L, "pageSize");
        RequestCheckUtils.checkNotEmpty(regionId, "regionId");
    }

    @Override
    public String getApiMethodName() {
        return "ess.aliyuncs.com.DescribeScalingActivities.2014-08-28";
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

    public Long getPageNumber() {
        return this.pageNumber;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    @Override
    public Class<DescribeScalingActivitiesResponse> getResponseClass() {
        return DescribeScalingActivitiesResponse.class;
    }

    public String getScalingActivityId1() {
        return this.scalingActivityId1;
    }

    public String getScalingActivityId10() {
        return this.scalingActivityId10;
    }

    public String getScalingActivityId11() {
        return this.scalingActivityId11;
    }

    public String getScalingActivityId12() {
        return this.scalingActivityId12;
    }

    public String getScalingActivityId13() {
        return this.scalingActivityId13;
    }

    public String getScalingActivityId14() {
        return this.scalingActivityId14;
    }

    public String getScalingActivityId15() {
        return this.scalingActivityId15;
    }

    public String getScalingActivityId16() {
        return this.scalingActivityId16;
    }

    public String getScalingActivityId17() {
        return this.scalingActivityId17;
    }

    public String getScalingActivityId18() {
        return this.scalingActivityId18;
    }

    public String getScalingActivityId19() {
        return this.scalingActivityId19;
    }

    public String getScalingActivityId2() {
        return this.scalingActivityId2;
    }

    public String getScalingActivityId20() {
        return this.scalingActivityId20;
    }

    public String getScalingActivityId3() {
        return this.scalingActivityId3;
    }

    public String getScalingActivityId4() {
        return this.scalingActivityId4;
    }

    public String getScalingActivityId5() {
        return this.scalingActivityId5;
    }

    public String getScalingActivityId6() {
        return this.scalingActivityId6;
    }

    public String getScalingActivityId7() {
        return this.scalingActivityId7;
    }

    public String getScalingActivityId8() {
        return this.scalingActivityId8;
    }

    public String getScalingActivityId9() {
        return this.scalingActivityId9;
    }

    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("PageNumber", this.pageNumber);
        txtParams.put("PageSize", this.pageSize);
        txtParams.put("RegionId", this.regionId);
        txtParams.put("ScalingActivityId.1", this.scalingActivityId1);
        txtParams.put("ScalingActivityId.10", this.scalingActivityId10);
        txtParams.put("ScalingActivityId.11", this.scalingActivityId11);
        txtParams.put("ScalingActivityId.12", this.scalingActivityId12);
        txtParams.put("ScalingActivityId.13", this.scalingActivityId13);
        txtParams.put("ScalingActivityId.14", this.scalingActivityId14);
        txtParams.put("ScalingActivityId.15", this.scalingActivityId15);
        txtParams.put("ScalingActivityId.16", this.scalingActivityId16);
        txtParams.put("ScalingActivityId.17", this.scalingActivityId17);
        txtParams.put("ScalingActivityId.18", this.scalingActivityId18);
        txtParams.put("ScalingActivityId.19", this.scalingActivityId19);
        txtParams.put("ScalingActivityId.2", this.scalingActivityId2);
        txtParams.put("ScalingActivityId.20", this.scalingActivityId20);
        txtParams.put("ScalingActivityId.3", this.scalingActivityId3);
        txtParams.put("ScalingActivityId.4", this.scalingActivityId4);
        txtParams.put("ScalingActivityId.5", this.scalingActivityId5);
        txtParams.put("ScalingActivityId.6", this.scalingActivityId6);
        txtParams.put("ScalingActivityId.7", this.scalingActivityId7);
        txtParams.put("ScalingActivityId.8", this.scalingActivityId8);
        txtParams.put("ScalingActivityId.9", this.scalingActivityId9);
        txtParams.put("ScalingGroupId", this.scalingGroupId);
        txtParams.put("StatusCode", this.statusCode);
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

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public void setScalingActivityId1(String scalingActivityId1) {
        this.scalingActivityId1 = scalingActivityId1;
    }

    public void setScalingActivityId10(String scalingActivityId10) {
        this.scalingActivityId10 = scalingActivityId10;
    }

    public void setScalingActivityId11(String scalingActivityId11) {
        this.scalingActivityId11 = scalingActivityId11;
    }

    public void setScalingActivityId12(String scalingActivityId12) {
        this.scalingActivityId12 = scalingActivityId12;
    }

    public void setScalingActivityId13(String scalingActivityId13) {
        this.scalingActivityId13 = scalingActivityId13;
    }

    public void setScalingActivityId14(String scalingActivityId14) {
        this.scalingActivityId14 = scalingActivityId14;
    }

    public void setScalingActivityId15(String scalingActivityId15) {
        this.scalingActivityId15 = scalingActivityId15;
    }

    public void setScalingActivityId16(String scalingActivityId16) {
        this.scalingActivityId16 = scalingActivityId16;
    }

    public void setScalingActivityId17(String scalingActivityId17) {
        this.scalingActivityId17 = scalingActivityId17;
    }

    public void setScalingActivityId18(String scalingActivityId18) {
        this.scalingActivityId18 = scalingActivityId18;
    }

    public void setScalingActivityId19(String scalingActivityId19) {
        this.scalingActivityId19 = scalingActivityId19;
    }

    public void setScalingActivityId2(String scalingActivityId2) {
        this.scalingActivityId2 = scalingActivityId2;
    }

    public void setScalingActivityId20(String scalingActivityId20) {
        this.scalingActivityId20 = scalingActivityId20;
    }

    public void setScalingActivityId3(String scalingActivityId3) {
        this.scalingActivityId3 = scalingActivityId3;
    }

    public void setScalingActivityId4(String scalingActivityId4) {
        this.scalingActivityId4 = scalingActivityId4;
    }

    public void setScalingActivityId5(String scalingActivityId5) {
        this.scalingActivityId5 = scalingActivityId5;
    }

    public void setScalingActivityId6(String scalingActivityId6) {
        this.scalingActivityId6 = scalingActivityId6;
    }

    public void setScalingActivityId7(String scalingActivityId7) {
        this.scalingActivityId7 = scalingActivityId7;
    }

    public void setScalingActivityId8(String scalingActivityId8) {
        this.scalingActivityId8 = scalingActivityId8;
    }

    public void setScalingActivityId9(String scalingActivityId9) {
        this.scalingActivityId9 = scalingActivityId9;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
