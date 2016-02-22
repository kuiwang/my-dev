package com.aliyun.api.ecs.ecs20130110.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ecs.ecs20130110.response.DescribeSecurityGroupsResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ecs.aliyuncs.com.DescribeSecurityGroups.2013-01-10 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:37
 */
public class DescribeSecurityGroupsRequest
        implements AliyunRequest<DescribeSecurityGroupsResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * 当前页码，起始值为1，默认值为1<br />
     * 支持最小值为：1
     */
    private Long pageNumber;

    /**
     * 分页查询时设置的每页行数，最大值50，默认值为10<br />
     * 支持最大值为：50<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    /**
     * 数据中心id
     */
    private String regionId;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMinValue(pageNumber, 1L, "pageNumber");
        RequestCheckUtils.checkMaxValue(pageSize, 50L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
        RequestCheckUtils.checkNotEmpty(regionId, "regionId");
    }

    @Override
    public String getApiMethodName() {
        return "ecs.aliyuncs.com.DescribeSecurityGroups.2013-01-10";
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
    public Class<DescribeSecurityGroupsResponse> getResponseClass() {
        return DescribeSecurityGroupsResponse.class;
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

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
