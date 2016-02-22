package com.aliyun.api.mts.mts20140618.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.mts.mts20140618.response.SearchTranscodeJobListResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: mts.aliyuncs.com.SearchTranscodeJobList.2014-06-18 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:43
 */
public class SearchTranscodeJobListRequest
        implements AliyunRequest<SearchTranscodeJobListResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 转码任务状态：All表示所有状态，Queuing表示排队中，Transcoding表示转码中，
     * TranscodeSuccess表示转码成功，TranscodeFail表示转码失败，TranscodeCancelled表示转码取消
     */
    private String jobState;

    /**
     * 创建转码任务时间范围中的下限值，比如[2014-09-26 16:35:00,2014-09-26
     * 17:35:00]此范围的下限就是示例值
     */
    private String lowerBoundOfJobCreatedTime;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * 当前页号
     */
    private Long pageNumber;

    /**
     * 分页查询时设置的每页行数页面大小<br />
     * 支持最大值为：100<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 创建转码任务时间的上限，比如[2014-09-26 16:35:00,2014-09-26 17:35:00]此范围的上限就是示例值
     */
    private String upperBoundOfJobCreatedTime;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(pageSize, 100L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
    }

    @Override
    public String getApiMethodName() {
        return "mts.aliyuncs.com.SearchTranscodeJobList.2014-06-18";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getJobState() {
        return this.jobState;
    }

    public String getLowerBoundOfJobCreatedTime() {
        return this.lowerBoundOfJobCreatedTime;
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
    public Class<SearchTranscodeJobListResponse> getResponseClass() {
        return SearchTranscodeJobListResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("JobState", this.jobState);
        txtParams.put("LowerBoundOfJobCreatedTime", this.lowerBoundOfJobCreatedTime);
        txtParams.put("PageNumber", this.pageNumber);
        txtParams.put("PageSize", this.pageSize);
        txtParams.put("UpperBoundOfJobCreatedTime", this.upperBoundOfJobCreatedTime);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getUpperBoundOfJobCreatedTime() {
        return this.upperBoundOfJobCreatedTime;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setJobState(String jobState) {
        this.jobState = jobState;
    }

    public void setLowerBoundOfJobCreatedTime(String lowerBoundOfJobCreatedTime) {
        this.lowerBoundOfJobCreatedTime = lowerBoundOfJobCreatedTime;
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

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setUpperBoundOfJobCreatedTime(String upperBoundOfJobCreatedTime) {
        this.upperBoundOfJobCreatedTime = upperBoundOfJobCreatedTime;
    }
}
