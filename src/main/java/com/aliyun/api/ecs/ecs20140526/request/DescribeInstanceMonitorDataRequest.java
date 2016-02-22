package com.aliyun.api.ecs.ecs20140526.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ecs.ecs20140526.response.DescribeInstanceMonitorDataResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ecs.aliyuncs.com.DescribeInstanceMonitorData.2014-05-26 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:36
 */
public class DescribeInstanceMonitorDataRequest
        implements AliyunRequest<DescribeInstanceMonitorDataResponse> {

    /**
     * 获取数据的结束时间点：ISO8601 表示法，并使用UTC时间。格式为：
     * YYYY-MM-DDThh:mm:ssZ。如果秒不是00，则自动取为下一分钟开始时
     */
    private String endTime;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 指定监控的实例ID
     */
    private String instanceId;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * 获取监控数据的精度，默认60秒，只能为60的倍数。
     */
    private Long period;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * 获取数据的起始时间点：ISO8601 表示法，并使用UTC时间。格式为：
     * YYYY-MM-DDThh:mm:ssZ。如果秒不是00，则自动取为下一分钟开始时
     */
    private String startTime;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(endTime, "endTime");
        RequestCheckUtils.checkNotEmpty(instanceId, "instanceId");
        RequestCheckUtils.checkNotEmpty(startTime, "startTime");
    }

    @Override
    public String getApiMethodName() {
        return "ecs.aliyuncs.com.DescribeInstanceMonitorData.2014-05-26";
    }

    public String getEndTime() {
        return this.endTime;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public Long getPeriod() {
        return this.period;
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    @Override
    public Class<DescribeInstanceMonitorDataResponse> getResponseClass() {
        return DescribeInstanceMonitorDataResponse.class;
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
        txtParams.put("EndTime", this.endTime);
        txtParams.put("InstanceId", this.instanceId);
        txtParams.put("Period", this.period);
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

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public void setPeriod(Long period) {
        this.period = period;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
