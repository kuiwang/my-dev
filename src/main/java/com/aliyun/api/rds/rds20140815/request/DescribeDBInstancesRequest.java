package com.aliyun.api.rds.rds20140815.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.rds.rds20140815.response.DescribeDBInstancesResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: rds.aliyuncs.com.DescribeDBInstances.2014-08-15 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:44
 */
public class DescribeDBInstancesRequest implements AliyunRequest<DescribeDBInstancesResponse> {

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
     * 实例状态，取值参见附录：实例状态表。 不填默认返回所有
     */
    private String dBInstanceStatus;

    /**
     * Primary:主实例 Readonly：只读实例
     */
    private String dBInstanceType;

    /**
     * 数据库类型，取值范围MySQL|SQLServer， 不填，默认返回所有
     */
    private String engine;

    /**
     * 页码，大于0，且不超过Integer的最大值 默认值：1<br />
     * 支持最大值为：2147483647<br />
     * 支持最小值为：0
     */
    private Long pageNumber;

    /**
     * 每页记录数，取值：30|50|100 默认值：30<br />
     * 支持最大值为：100<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    /**
     * 实例的region
     */
    private String regionId;

    public void setdBInstanceStatus(String dBInstanceStatus) {
        this.dBInstanceStatus = dBInstanceStatus;
    }

    public String getdBInstanceStatus() {
        return this.dBInstanceStatus;
    }

    public void setdBInstanceType(String dBInstanceType) {
        this.dBInstanceType = dBInstanceType;
    }

    public String getdBInstanceType() {
        return this.dBInstanceType;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return this.engine;
    }

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
        return "rds.aliyuncs.com.DescribeDBInstances.2014-08-15";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("DBInstanceStatus", this.dBInstanceStatus);
        txtParams.put("DBInstanceType", this.dBInstanceType);
        txtParams.put("Engine", this.engine);
        txtParams.put("PageNumber", this.pageNumber);
        txtParams.put("PageSize", this.pageSize);
        txtParams.put("RegionId", this.regionId);
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

    public Class<DescribeDBInstancesResponse> getResponseClass() {
        return DescribeDBInstancesResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(pageNumber, 2147483647L, "pageNumber");
        RequestCheckUtils.checkMinValue(pageNumber, 0L, "pageNumber");
        RequestCheckUtils.checkMaxValue(pageSize, 100L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
        RequestCheckUtils.checkNotEmpty(regionId, "regionId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
