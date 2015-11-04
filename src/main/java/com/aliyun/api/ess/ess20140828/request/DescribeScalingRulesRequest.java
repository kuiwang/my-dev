package com.aliyun.api.ess.ess20140828.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ess.ess20140828.response.DescribeScalingRulesResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ess.aliyuncs.com.DescribeScalingRules.2014-08-28 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:41
 */
public class DescribeScalingRulesRequest implements AliyunRequest<DescribeScalingRulesResponse> {

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
     * 伸缩规则所在的区域
     */
    private String regionId;

    /**
     * 伸缩组的ID
     */
    private String scalingGroupId;

    /**
     * 伸缩规则的Ari，可以输入多个，最多可以支持10个。返回查询结果时略去失效的ScalingRuleAri，并且不报错。
     */
    private String scalingRuleAri1;

    /**
     * ScalingRuleAri.1
     */
    private String scalingRuleAri10;

    /**
     * ScalingRuleAri.1
     */
    private String scalingRuleAri2;

    /**
     * ScalingRuleAri.1
     */
    private String scalingRuleAri3;

    /**
     * ScalingRuleAri.1
     */
    private String scalingRuleAri4;

    /**
     * ScalingRuleAri.1
     */
    private String scalingRuleAri5;

    /**
     * ScalingRuleAri.1
     */
    private String scalingRuleAri6;

    /**
     * ScalingRuleAri.1
     */
    private String scalingRuleAri7;

    /**
     * ScalingRuleAri.1
     */
    private String scalingRuleAri8;

    /**
     * ScalingRuleAri.1
     */
    private String scalingRuleAri9;

    /**
     * 伸缩规则的ID，可以输入多个，最多可以支持10个。返回查询结果时略去失效的ScalingRuleId，并且不报错。
     */
    private String scalingRuleId1;

    /**
     * ScalingRuleId.
     */
    private String scalingRuleId10;

    /**
     * ScalingRuleId
     */
    private String scalingRuleId2;

    /**
     * ScalingRuleId.
     */
    private String scalingRuleId3;

    /**
     * ScalingRuleId.
     */
    private String scalingRuleId4;

    /**
     * ScalingRuleId.
     */
    private String scalingRuleId5;

    /**
     * ScalingRuleId.
     */
    private String scalingRuleId6;

    /**
     * ScalingRuleId.
     */
    private String scalingRuleId7;

    /**
     * ScalingRuleId.
     */
    private String scalingRuleId8;

    /**
     * ScalingRuleId.
     */
    private String scalingRuleId9;

    /**
     * 伸缩规则的Name，可以输入多个，最多可以支持10个。返回查询结果时略去失效的ScalingRuleName，并且不报错。
     */
    private String scalingRuleName1;

    /**
     * ScalingRuleName.1
     */
    private String scalingRuleName10;

    /**
     * ScalingRuleName.1
     */
    private String scalingRuleName2;

    /**
     * ScalingRuleName.1
     */
    private String scalingRuleName3;

    /**
     * ScalingRuleName.1
     */
    private String scalingRuleName4;

    /**
     * ScalingRuleName.1
     */
    private String scalingRuleName5;

    /**
     * ScalingRuleName.1
     */
    private String scalingRuleName6;

    /**
     * ScalingRuleName.1
     */
    private String scalingRuleName7;

    /**
     * ScalingRuleName.1
     */
    private String scalingRuleName8;

    /**
     * ScalingRuleName.1
     */
    private String scalingRuleName9;

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

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public void setScalingRuleAri1(String scalingRuleAri1) {
        this.scalingRuleAri1 = scalingRuleAri1;
    }

    public String getScalingRuleAri1() {
        return this.scalingRuleAri1;
    }

    public void setScalingRuleAri10(String scalingRuleAri10) {
        this.scalingRuleAri10 = scalingRuleAri10;
    }

    public String getScalingRuleAri10() {
        return this.scalingRuleAri10;
    }

    public void setScalingRuleAri2(String scalingRuleAri2) {
        this.scalingRuleAri2 = scalingRuleAri2;
    }

    public String getScalingRuleAri2() {
        return this.scalingRuleAri2;
    }

    public void setScalingRuleAri3(String scalingRuleAri3) {
        this.scalingRuleAri3 = scalingRuleAri3;
    }

    public String getScalingRuleAri3() {
        return this.scalingRuleAri3;
    }

    public void setScalingRuleAri4(String scalingRuleAri4) {
        this.scalingRuleAri4 = scalingRuleAri4;
    }

    public String getScalingRuleAri4() {
        return this.scalingRuleAri4;
    }

    public void setScalingRuleAri5(String scalingRuleAri5) {
        this.scalingRuleAri5 = scalingRuleAri5;
    }

    public String getScalingRuleAri5() {
        return this.scalingRuleAri5;
    }

    public void setScalingRuleAri6(String scalingRuleAri6) {
        this.scalingRuleAri6 = scalingRuleAri6;
    }

    public String getScalingRuleAri6() {
        return this.scalingRuleAri6;
    }

    public void setScalingRuleAri7(String scalingRuleAri7) {
        this.scalingRuleAri7 = scalingRuleAri7;
    }

    public String getScalingRuleAri7() {
        return this.scalingRuleAri7;
    }

    public void setScalingRuleAri8(String scalingRuleAri8) {
        this.scalingRuleAri8 = scalingRuleAri8;
    }

    public String getScalingRuleAri8() {
        return this.scalingRuleAri8;
    }

    public void setScalingRuleAri9(String scalingRuleAri9) {
        this.scalingRuleAri9 = scalingRuleAri9;
    }

    public String getScalingRuleAri9() {
        return this.scalingRuleAri9;
    }

    public void setScalingRuleId1(String scalingRuleId1) {
        this.scalingRuleId1 = scalingRuleId1;
    }

    public String getScalingRuleId1() {
        return this.scalingRuleId1;
    }

    public void setScalingRuleId10(String scalingRuleId10) {
        this.scalingRuleId10 = scalingRuleId10;
    }

    public String getScalingRuleId10() {
        return this.scalingRuleId10;
    }

    public void setScalingRuleId2(String scalingRuleId2) {
        this.scalingRuleId2 = scalingRuleId2;
    }

    public String getScalingRuleId2() {
        return this.scalingRuleId2;
    }

    public void setScalingRuleId3(String scalingRuleId3) {
        this.scalingRuleId3 = scalingRuleId3;
    }

    public String getScalingRuleId3() {
        return this.scalingRuleId3;
    }

    public void setScalingRuleId4(String scalingRuleId4) {
        this.scalingRuleId4 = scalingRuleId4;
    }

    public String getScalingRuleId4() {
        return this.scalingRuleId4;
    }

    public void setScalingRuleId5(String scalingRuleId5) {
        this.scalingRuleId5 = scalingRuleId5;
    }

    public String getScalingRuleId5() {
        return this.scalingRuleId5;
    }

    public void setScalingRuleId6(String scalingRuleId6) {
        this.scalingRuleId6 = scalingRuleId6;
    }

    public String getScalingRuleId6() {
        return this.scalingRuleId6;
    }

    public void setScalingRuleId7(String scalingRuleId7) {
        this.scalingRuleId7 = scalingRuleId7;
    }

    public String getScalingRuleId7() {
        return this.scalingRuleId7;
    }

    public void setScalingRuleId8(String scalingRuleId8) {
        this.scalingRuleId8 = scalingRuleId8;
    }

    public String getScalingRuleId8() {
        return this.scalingRuleId8;
    }

    public void setScalingRuleId9(String scalingRuleId9) {
        this.scalingRuleId9 = scalingRuleId9;
    }

    public String getScalingRuleId9() {
        return this.scalingRuleId9;
    }

    public void setScalingRuleName1(String scalingRuleName1) {
        this.scalingRuleName1 = scalingRuleName1;
    }

    public String getScalingRuleName1() {
        return this.scalingRuleName1;
    }

    public void setScalingRuleName10(String scalingRuleName10) {
        this.scalingRuleName10 = scalingRuleName10;
    }

    public String getScalingRuleName10() {
        return this.scalingRuleName10;
    }

    public void setScalingRuleName2(String scalingRuleName2) {
        this.scalingRuleName2 = scalingRuleName2;
    }

    public String getScalingRuleName2() {
        return this.scalingRuleName2;
    }

    public void setScalingRuleName3(String scalingRuleName3) {
        this.scalingRuleName3 = scalingRuleName3;
    }

    public String getScalingRuleName3() {
        return this.scalingRuleName3;
    }

    public void setScalingRuleName4(String scalingRuleName4) {
        this.scalingRuleName4 = scalingRuleName4;
    }

    public String getScalingRuleName4() {
        return this.scalingRuleName4;
    }

    public void setScalingRuleName5(String scalingRuleName5) {
        this.scalingRuleName5 = scalingRuleName5;
    }

    public String getScalingRuleName5() {
        return this.scalingRuleName5;
    }

    public void setScalingRuleName6(String scalingRuleName6) {
        this.scalingRuleName6 = scalingRuleName6;
    }

    public String getScalingRuleName6() {
        return this.scalingRuleName6;
    }

    public void setScalingRuleName7(String scalingRuleName7) {
        this.scalingRuleName7 = scalingRuleName7;
    }

    public String getScalingRuleName7() {
        return this.scalingRuleName7;
    }

    public void setScalingRuleName8(String scalingRuleName8) {
        this.scalingRuleName8 = scalingRuleName8;
    }

    public String getScalingRuleName8() {
        return this.scalingRuleName8;
    }

    public void setScalingRuleName9(String scalingRuleName9) {
        this.scalingRuleName9 = scalingRuleName9;
    }

    public String getScalingRuleName9() {
        return this.scalingRuleName9;
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
        return "ess.aliyuncs.com.DescribeScalingRules.2014-08-28";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("PageNumber", this.pageNumber);
        txtParams.put("PageSize", this.pageSize);
        txtParams.put("RegionId", this.regionId);
        txtParams.put("ScalingGroupId", this.scalingGroupId);
        txtParams.put("ScalingRuleAri.1", this.scalingRuleAri1);
        txtParams.put("ScalingRuleAri.10", this.scalingRuleAri10);
        txtParams.put("ScalingRuleAri.2", this.scalingRuleAri2);
        txtParams.put("ScalingRuleAri.3", this.scalingRuleAri3);
        txtParams.put("ScalingRuleAri.4", this.scalingRuleAri4);
        txtParams.put("ScalingRuleAri.5", this.scalingRuleAri5);
        txtParams.put("ScalingRuleAri.6", this.scalingRuleAri6);
        txtParams.put("ScalingRuleAri.7", this.scalingRuleAri7);
        txtParams.put("ScalingRuleAri.8", this.scalingRuleAri8);
        txtParams.put("ScalingRuleAri.9", this.scalingRuleAri9);
        txtParams.put("ScalingRuleId.1", this.scalingRuleId1);
        txtParams.put("ScalingRuleId.10", this.scalingRuleId10);
        txtParams.put("ScalingRuleId.2", this.scalingRuleId2);
        txtParams.put("ScalingRuleId.3", this.scalingRuleId3);
        txtParams.put("ScalingRuleId.4", this.scalingRuleId4);
        txtParams.put("ScalingRuleId.5", this.scalingRuleId5);
        txtParams.put("ScalingRuleId.6", this.scalingRuleId6);
        txtParams.put("ScalingRuleId.7", this.scalingRuleId7);
        txtParams.put("ScalingRuleId.8", this.scalingRuleId8);
        txtParams.put("ScalingRuleId.9", this.scalingRuleId9);
        txtParams.put("ScalingRuleName.1", this.scalingRuleName1);
        txtParams.put("ScalingRuleName.10", this.scalingRuleName10);
        txtParams.put("ScalingRuleName.2", this.scalingRuleName2);
        txtParams.put("ScalingRuleName.3", this.scalingRuleName3);
        txtParams.put("ScalingRuleName.4", this.scalingRuleName4);
        txtParams.put("ScalingRuleName.5", this.scalingRuleName5);
        txtParams.put("ScalingRuleName.6", this.scalingRuleName6);
        txtParams.put("ScalingRuleName.7", this.scalingRuleName7);
        txtParams.put("ScalingRuleName.8", this.scalingRuleName8);
        txtParams.put("ScalingRuleName.9", this.scalingRuleName9);
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

    public Class<DescribeScalingRulesResponse> getResponseClass() {
        return DescribeScalingRulesResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(pageSize, 50L, "pageSize");
        RequestCheckUtils.checkNotEmpty(regionId, "regionId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
