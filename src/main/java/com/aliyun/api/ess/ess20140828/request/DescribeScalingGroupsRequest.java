package com.aliyun.api.ess.ess20140828.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ess.ess20140828.response.DescribeScalingGroupsResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ess.aliyuncs.com.DescribeScalingGroups.2014-08-28 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:41
 */
public class DescribeScalingGroupsRequest implements AliyunRequest<DescribeScalingGroupsResponse> {

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
     * PageNumber<br />
     * 支持最小值为：1
     */
    private Long pageNumber;

    /**
     * PageSize<br />
     * 支持最大值为：50
     */
    private Long pageSize;

    /**
     * RegionId
     */
    private String regionId;

    /**
     * ScalingGroupId
     */
    private String scalingGroupId1;

    /**
     * ScalingGroupId.10
     */
    private String scalingGroupId10;

    /**
     * ScalingGroupId.
     */
    private String scalingGroupId11;

    /**
     * ScalingGroupId.
     */
    private String scalingGroupId12;

    /**
     * ScalingGroupId.
     */
    private String scalingGroupId13;

    /**
     * ScalingGroupId.
     */
    private String scalingGroupId14;

    /**
     * ScalingGroupId.
     */
    private String scalingGroupId15;

    /**
     * ScalingGroupId.
     */
    private String scalingGroupId16;

    /**
     * ScalingGroupId.
     */
    private String scalingGroupId17;

    /**
     * ScalingGroupId.
     */
    private String scalingGroupId18;

    /**
     * ScalingGroupId.
     */
    private String scalingGroupId19;

    /**
     * ScalingGroupId
     */
    private String scalingGroupId2;

    /**
     * ScalingGroupId.
     */
    private String scalingGroupId20;

    /**
     * ScalingGroupId.3
     */
    private String scalingGroupId3;

    /**
     * ScalingGroupId.
     */
    private String scalingGroupId4;

    /**
     * ScalingGroupId.
     */
    private String scalingGroupId5;

    /**
     * ScalingGroupId.
     */
    private String scalingGroupId6;

    /**
     * ScalingGroupId.
     */
    private String scalingGroupId7;

    /**
     * ScalingGroupId.
     */
    private String scalingGroupId8;

    /**
     * ScalingGroupId.
     */
    private String scalingGroupId9;

    /**
     * ScalingGroupName.1
     */
    private String scalingGroupName1;

    /**
     * ScalingGroupName.1
     */
    private String scalingGroupName10;

    /**
     * ScalingGroupName.1
     */
    private String scalingGroupName11;

    /**
     * ScalingGroupName.1
     */
    private String scalingGroupName12;

    /**
     * ScalingGroupName.1
     */
    private String scalingGroupName13;

    /**
     * ScalingGroupName.1
     */
    private String scalingGroupName14;

    /**
     * ScalingGroupName.1
     */
    private String scalingGroupName15;

    /**
     * ScalingGroupName.1
     */
    private String scalingGroupName16;

    /**
     * ScalingGroupName.1
     */
    private String scalingGroupName17;

    /**
     * ScalingGroupName.1
     */
    private String scalingGroupName18;

    /**
     * ScalingGroupName.1
     */
    private String scalingGroupName19;

    /**
     * ScalingGroupName.1
     */
    private String scalingGroupName2;

    /**
     * ScalingGroupName.1
     */
    private String scalingGroupName20;

    /**
     * ScalingGroupName.1
     */
    private String scalingGroupName3;

    /**
     * ScalingGroupName.1
     */
    private String scalingGroupName4;

    /**
     * ScalingGroupName.1
     */
    private String scalingGroupName5;

    /**
     * ScalingGroupName.1
     */
    private String scalingGroupName6;

    /**
     * ScalingGroupName.1ScalingGroupName.1
     */
    private String scalingGroupName7;

    /**
     * ScalingGroupName.1
     */
    private String scalingGroupName8;

    /**
     * ScalingGroupName.1
     */
    private String scalingGroupName9;

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

    public void setScalingGroupId1(String scalingGroupId1) {
        this.scalingGroupId1 = scalingGroupId1;
    }

    public String getScalingGroupId1() {
        return this.scalingGroupId1;
    }

    public void setScalingGroupId10(String scalingGroupId10) {
        this.scalingGroupId10 = scalingGroupId10;
    }

    public String getScalingGroupId10() {
        return this.scalingGroupId10;
    }

    public void setScalingGroupId11(String scalingGroupId11) {
        this.scalingGroupId11 = scalingGroupId11;
    }

    public String getScalingGroupId11() {
        return this.scalingGroupId11;
    }

    public void setScalingGroupId12(String scalingGroupId12) {
        this.scalingGroupId12 = scalingGroupId12;
    }

    public String getScalingGroupId12() {
        return this.scalingGroupId12;
    }

    public void setScalingGroupId13(String scalingGroupId13) {
        this.scalingGroupId13 = scalingGroupId13;
    }

    public String getScalingGroupId13() {
        return this.scalingGroupId13;
    }

    public void setScalingGroupId14(String scalingGroupId14) {
        this.scalingGroupId14 = scalingGroupId14;
    }

    public String getScalingGroupId14() {
        return this.scalingGroupId14;
    }

    public void setScalingGroupId15(String scalingGroupId15) {
        this.scalingGroupId15 = scalingGroupId15;
    }

    public String getScalingGroupId15() {
        return this.scalingGroupId15;
    }

    public void setScalingGroupId16(String scalingGroupId16) {
        this.scalingGroupId16 = scalingGroupId16;
    }

    public String getScalingGroupId16() {
        return this.scalingGroupId16;
    }

    public void setScalingGroupId17(String scalingGroupId17) {
        this.scalingGroupId17 = scalingGroupId17;
    }

    public String getScalingGroupId17() {
        return this.scalingGroupId17;
    }

    public void setScalingGroupId18(String scalingGroupId18) {
        this.scalingGroupId18 = scalingGroupId18;
    }

    public String getScalingGroupId18() {
        return this.scalingGroupId18;
    }

    public void setScalingGroupId19(String scalingGroupId19) {
        this.scalingGroupId19 = scalingGroupId19;
    }

    public String getScalingGroupId19() {
        return this.scalingGroupId19;
    }

    public void setScalingGroupId2(String scalingGroupId2) {
        this.scalingGroupId2 = scalingGroupId2;
    }

    public String getScalingGroupId2() {
        return this.scalingGroupId2;
    }

    public void setScalingGroupId20(String scalingGroupId20) {
        this.scalingGroupId20 = scalingGroupId20;
    }

    public String getScalingGroupId20() {
        return this.scalingGroupId20;
    }

    public void setScalingGroupId3(String scalingGroupId3) {
        this.scalingGroupId3 = scalingGroupId3;
    }

    public String getScalingGroupId3() {
        return this.scalingGroupId3;
    }

    public void setScalingGroupId4(String scalingGroupId4) {
        this.scalingGroupId4 = scalingGroupId4;
    }

    public String getScalingGroupId4() {
        return this.scalingGroupId4;
    }

    public void setScalingGroupId5(String scalingGroupId5) {
        this.scalingGroupId5 = scalingGroupId5;
    }

    public String getScalingGroupId5() {
        return this.scalingGroupId5;
    }

    public void setScalingGroupId6(String scalingGroupId6) {
        this.scalingGroupId6 = scalingGroupId6;
    }

    public String getScalingGroupId6() {
        return this.scalingGroupId6;
    }

    public void setScalingGroupId7(String scalingGroupId7) {
        this.scalingGroupId7 = scalingGroupId7;
    }

    public String getScalingGroupId7() {
        return this.scalingGroupId7;
    }

    public void setScalingGroupId8(String scalingGroupId8) {
        this.scalingGroupId8 = scalingGroupId8;
    }

    public String getScalingGroupId8() {
        return this.scalingGroupId8;
    }

    public void setScalingGroupId9(String scalingGroupId9) {
        this.scalingGroupId9 = scalingGroupId9;
    }

    public String getScalingGroupId9() {
        return this.scalingGroupId9;
    }

    public void setScalingGroupName1(String scalingGroupName1) {
        this.scalingGroupName1 = scalingGroupName1;
    }

    public String getScalingGroupName1() {
        return this.scalingGroupName1;
    }

    public void setScalingGroupName10(String scalingGroupName10) {
        this.scalingGroupName10 = scalingGroupName10;
    }

    public String getScalingGroupName10() {
        return this.scalingGroupName10;
    }

    public void setScalingGroupName11(String scalingGroupName11) {
        this.scalingGroupName11 = scalingGroupName11;
    }

    public String getScalingGroupName11() {
        return this.scalingGroupName11;
    }

    public void setScalingGroupName12(String scalingGroupName12) {
        this.scalingGroupName12 = scalingGroupName12;
    }

    public String getScalingGroupName12() {
        return this.scalingGroupName12;
    }

    public void setScalingGroupName13(String scalingGroupName13) {
        this.scalingGroupName13 = scalingGroupName13;
    }

    public String getScalingGroupName13() {
        return this.scalingGroupName13;
    }

    public void setScalingGroupName14(String scalingGroupName14) {
        this.scalingGroupName14 = scalingGroupName14;
    }

    public String getScalingGroupName14() {
        return this.scalingGroupName14;
    }

    public void setScalingGroupName15(String scalingGroupName15) {
        this.scalingGroupName15 = scalingGroupName15;
    }

    public String getScalingGroupName15() {
        return this.scalingGroupName15;
    }

    public void setScalingGroupName16(String scalingGroupName16) {
        this.scalingGroupName16 = scalingGroupName16;
    }

    public String getScalingGroupName16() {
        return this.scalingGroupName16;
    }

    public void setScalingGroupName17(String scalingGroupName17) {
        this.scalingGroupName17 = scalingGroupName17;
    }

    public String getScalingGroupName17() {
        return this.scalingGroupName17;
    }

    public void setScalingGroupName18(String scalingGroupName18) {
        this.scalingGroupName18 = scalingGroupName18;
    }

    public String getScalingGroupName18() {
        return this.scalingGroupName18;
    }

    public void setScalingGroupName19(String scalingGroupName19) {
        this.scalingGroupName19 = scalingGroupName19;
    }

    public String getScalingGroupName19() {
        return this.scalingGroupName19;
    }

    public void setScalingGroupName2(String scalingGroupName2) {
        this.scalingGroupName2 = scalingGroupName2;
    }

    public String getScalingGroupName2() {
        return this.scalingGroupName2;
    }

    public void setScalingGroupName20(String scalingGroupName20) {
        this.scalingGroupName20 = scalingGroupName20;
    }

    public String getScalingGroupName20() {
        return this.scalingGroupName20;
    }

    public void setScalingGroupName3(String scalingGroupName3) {
        this.scalingGroupName3 = scalingGroupName3;
    }

    public String getScalingGroupName3() {
        return this.scalingGroupName3;
    }

    public void setScalingGroupName4(String scalingGroupName4) {
        this.scalingGroupName4 = scalingGroupName4;
    }

    public String getScalingGroupName4() {
        return this.scalingGroupName4;
    }

    public void setScalingGroupName5(String scalingGroupName5) {
        this.scalingGroupName5 = scalingGroupName5;
    }

    public String getScalingGroupName5() {
        return this.scalingGroupName5;
    }

    public void setScalingGroupName6(String scalingGroupName6) {
        this.scalingGroupName6 = scalingGroupName6;
    }

    public String getScalingGroupName6() {
        return this.scalingGroupName6;
    }

    public void setScalingGroupName7(String scalingGroupName7) {
        this.scalingGroupName7 = scalingGroupName7;
    }

    public String getScalingGroupName7() {
        return this.scalingGroupName7;
    }

    public void setScalingGroupName8(String scalingGroupName8) {
        this.scalingGroupName8 = scalingGroupName8;
    }

    public String getScalingGroupName8() {
        return this.scalingGroupName8;
    }

    public void setScalingGroupName9(String scalingGroupName9) {
        this.scalingGroupName9 = scalingGroupName9;
    }

    public String getScalingGroupName9() {
        return this.scalingGroupName9;
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
        return "ess.aliyuncs.com.DescribeScalingGroups.2014-08-28";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("PageNumber", this.pageNumber);
        txtParams.put("PageSize", this.pageSize);
        txtParams.put("RegionId", this.regionId);
        txtParams.put("ScalingGroupId.1", this.scalingGroupId1);
        txtParams.put("ScalingGroupId.10", this.scalingGroupId10);
        txtParams.put("ScalingGroupId.11", this.scalingGroupId11);
        txtParams.put("ScalingGroupId.12", this.scalingGroupId12);
        txtParams.put("ScalingGroupId.13", this.scalingGroupId13);
        txtParams.put("ScalingGroupId.14", this.scalingGroupId14);
        txtParams.put("ScalingGroupId.15", this.scalingGroupId15);
        txtParams.put("ScalingGroupId.16", this.scalingGroupId16);
        txtParams.put("ScalingGroupId.17", this.scalingGroupId17);
        txtParams.put("ScalingGroupId.18", this.scalingGroupId18);
        txtParams.put("ScalingGroupId.19", this.scalingGroupId19);
        txtParams.put("ScalingGroupId.2", this.scalingGroupId2);
        txtParams.put("ScalingGroupId.20", this.scalingGroupId20);
        txtParams.put("ScalingGroupId.3", this.scalingGroupId3);
        txtParams.put("ScalingGroupId.4", this.scalingGroupId4);
        txtParams.put("ScalingGroupId.5", this.scalingGroupId5);
        txtParams.put("ScalingGroupId.6", this.scalingGroupId6);
        txtParams.put("ScalingGroupId.7", this.scalingGroupId7);
        txtParams.put("ScalingGroupId.8", this.scalingGroupId8);
        txtParams.put("ScalingGroupId.9", this.scalingGroupId9);
        txtParams.put("ScalingGroupName.1", this.scalingGroupName1);
        txtParams.put("ScalingGroupName.10", this.scalingGroupName10);
        txtParams.put("ScalingGroupName.11", this.scalingGroupName11);
        txtParams.put("ScalingGroupName.12", this.scalingGroupName12);
        txtParams.put("ScalingGroupName.13", this.scalingGroupName13);
        txtParams.put("ScalingGroupName.14", this.scalingGroupName14);
        txtParams.put("ScalingGroupName.15", this.scalingGroupName15);
        txtParams.put("ScalingGroupName.16", this.scalingGroupName16);
        txtParams.put("ScalingGroupName.17", this.scalingGroupName17);
        txtParams.put("ScalingGroupName.18", this.scalingGroupName18);
        txtParams.put("ScalingGroupName.19", this.scalingGroupName19);
        txtParams.put("ScalingGroupName.2", this.scalingGroupName2);
        txtParams.put("ScalingGroupName.20", this.scalingGroupName20);
        txtParams.put("ScalingGroupName.3", this.scalingGroupName3);
        txtParams.put("ScalingGroupName.4", this.scalingGroupName4);
        txtParams.put("ScalingGroupName.5", this.scalingGroupName5);
        txtParams.put("ScalingGroupName.6", this.scalingGroupName6);
        txtParams.put("ScalingGroupName.7", this.scalingGroupName7);
        txtParams.put("ScalingGroupName.8", this.scalingGroupName8);
        txtParams.put("ScalingGroupName.9", this.scalingGroupName9);
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

    public Class<DescribeScalingGroupsResponse> getResponseClass() {
        return DescribeScalingGroupsResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMinValue(pageNumber, 1L, "pageNumber");
        RequestCheckUtils.checkMaxValue(pageSize, 50L, "pageSize");
        RequestCheckUtils.checkNotEmpty(regionId, "regionId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
