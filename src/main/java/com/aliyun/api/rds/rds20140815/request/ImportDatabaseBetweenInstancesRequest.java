package com.aliyun.api.rds.rds20140815.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.rds.rds20140815.response.ImportDatabaseBetweenInstancesResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: rds.aliyuncs.com.ImportDatabaseBetweenInstances.2014-08-15
 * request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:46
 */
public class ImportDatabaseBetweenInstancesRequest
        implements AliyunRequest<ImportDatabaseBetweenInstancesResponse> {

    /**
     * 待迁移实例的DB信息，JSON串格式，见DBInfo参数，示例：{"DBNames":["mydb","mydb2"]}
     * 对于MySQL实例，值为数组 {"DBNames":{"srcdb":"destdb"," srcdb2":"destmydb2"]}
     * 对于SQLServer实例，值为key-value对，key为原db，目标为迁移目标db，此项必填，key和value值也不能相同
     */
    private String dBInfo;

    /**
     * 实例名
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

    /**
     * 源实例名，不能与待迁移实例相同
     */
    private String sourceDBInstanceId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(dBInfo, "dBInfo");
        RequestCheckUtils.checkNotEmpty(dBInstanceId, "dBInstanceId");
        RequestCheckUtils.checkNotEmpty(sourceDBInstanceId, "sourceDBInstanceId");
    }

    @Override
    public String getApiMethodName() {
        return "rds.aliyuncs.com.ImportDatabaseBetweenInstances.2014-08-15";
    }

    public String getdBInfo() {
        return this.dBInfo;
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
    public Class<ImportDatabaseBetweenInstancesResponse> getResponseClass() {
        return ImportDatabaseBetweenInstancesResponse.class;
    }

    public String getSourceDBInstanceId() {
        return this.sourceDBInstanceId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("DBInfo", this.dBInfo);
        txtParams.put("DBInstanceId", this.dBInstanceId);
        txtParams.put("SourceDBInstanceId", this.sourceDBInstanceId);
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

    public void setdBInfo(String dBInfo) {
        this.dBInfo = dBInfo;
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

    public void setSourceDBInstanceId(String sourceDBInstanceId) {
        this.sourceDBInstanceId = sourceDBInstanceId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
