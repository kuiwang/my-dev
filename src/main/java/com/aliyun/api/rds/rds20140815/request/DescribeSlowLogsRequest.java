package com.aliyun.api.rds.rds20140815.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.rds.rds20140815.response.DescribeSlowLogsResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: rds.aliyuncs.com.DescribeSlowLogs.2014-08-15 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:45
 */
public class DescribeSlowLogsRequest implements AliyunRequest<DescribeSlowLogsResponse> {

    /**
     * 实例名
     */
    private String dBInstanceId;

    /**
     * DB名称
     */
    private String dBName;

    /**
     * 查询结束日期，不能小于查询开始日期，格式：YYYY-MM-DDZ
     */
    private String endTime;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * 页码，大于0，且不超过Integer的最大值 默认值：1<br />
     * 支持最大值为：65535<br />
     * 支持最小值为：1
     */
    private Long pageNumber;

    /**
     * 每页记录数，取值：30|50|100 默认值：30<br />
     * 支持最大值为：100<br />
     * 支持最小值为：30
     */
    private Long pageSize;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * 排序依据，取值： 1 TotalExecutionCounts:总执行次数最多 2 TotalQueryTimes:总执行时间最多 3
     * TotalLogicalReads:总逻辑读最多 4 TotalPhysicalReads:总物理读最多
     * 此参数对SQLServer实例有效
     */
    private String sortKey;

    /**
     * 查询开始日期， 格式：YYYY-MM-DDZ
     */
    private String startTime;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(dBInstanceId, "dBInstanceId");
        RequestCheckUtils.checkNotEmpty(endTime, "endTime");
        RequestCheckUtils.checkMaxValue(pageNumber, 65535L, "pageNumber");
        RequestCheckUtils.checkMinValue(pageNumber, 1L, "pageNumber");
        RequestCheckUtils.checkMaxValue(pageSize, 100L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 30L, "pageSize");
        RequestCheckUtils.checkNotEmpty(startTime, "startTime");
    }

    @Override
    public String getApiMethodName() {
        return "rds.aliyuncs.com.DescribeSlowLogs.2014-08-15";
    }

    public String getdBInstanceId() {
        return this.dBInstanceId;
    }

    public String getdBName() {
        return this.dBName;
    }

    public String getEndTime() {
        return this.endTime;
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

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    @Override
    public Class<DescribeSlowLogsResponse> getResponseClass() {
        return DescribeSlowLogsResponse.class;
    }

    public String getSortKey() {
        return this.sortKey;
    }

    public String getStartTime() {
        return this.startTime;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("DBInstanceId", this.dBInstanceId);
        txtParams.put("DBName", this.dBName);
        txtParams.put("EndTime", this.endTime);
        txtParams.put("PageNumber", this.pageNumber);
        txtParams.put("PageSize", this.pageSize);
        txtParams.put("SortKey", this.sortKey);
        txtParams.put("StartTime", this.startTime);
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

    public void setdBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
    }

    public void setdBName(String dBName) {
        this.dBName = dBName;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
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

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
