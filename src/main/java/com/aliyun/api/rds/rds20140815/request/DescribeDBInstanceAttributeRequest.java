package com.aliyun.api.rds.rds20140815.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.rds.rds20140815.response.DescribeDBInstanceAttributeResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: rds.aliyuncs.com.DescribeDBInstanceAttribute.2014-08-15 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:44
 */
public class DescribeDBInstanceAttributeRequest
        implements AliyunRequest<DescribeDBInstanceAttributeResponse> {

    /**
     * 实例名，可以一次输入多个，以英文半角“,”分隔
     */
    private String dBInstanceId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(dBInstanceId, "dBInstanceId");
    }

    @Override
    public String getApiMethodName() {
        return "rds.aliyuncs.com.DescribeDBInstanceAttribute.2014-08-15";
    }

    public String getdBInstanceId() {
        return this.dBInstanceId;
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

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    @Override
    public Class<DescribeDBInstanceAttributeResponse> getResponseClass() {
        return DescribeDBInstanceAttributeResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("DBInstanceId", this.dBInstanceId);
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

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
