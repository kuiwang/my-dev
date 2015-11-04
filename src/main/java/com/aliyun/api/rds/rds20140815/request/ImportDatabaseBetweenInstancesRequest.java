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
public class ImportDatabaseBetweenInstancesRequest implements
        AliyunRequest<ImportDatabaseBetweenInstancesResponse> {

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
     * 待迁移实例的DB信息，JSON串格式，见DBInfo参数，示例：{"DBNames":["mydb","mydb2"]}
     * 对于MySQL实例，值为数组 {"DBNames":{"srcdb":"destdb"," srcdb2":"destmydb2"]}
     * 对于SQLServer实例，值为key-value对，key为原db，目标为迁移目标db，此项必填，key和value值也不能相同
     */
    private String dBInfo;

    /**
     * 实例名
     */
    private String dBInstanceId;

    /**
     * 源实例名，不能与待迁移实例相同
     */
    private String sourceDBInstanceId;

    public void setdBInfo(String dBInfo) {
        this.dBInfo = dBInfo;
    }

    public String getdBInfo() {
        return this.dBInfo;
    }

    public void setdBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
    }

    public String getdBInstanceId() {
        return this.dBInstanceId;
    }

    public void setSourceDBInstanceId(String sourceDBInstanceId) {
        this.sourceDBInstanceId = sourceDBInstanceId;
    }

    public String getSourceDBInstanceId() {
        return this.sourceDBInstanceId;
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
        return "rds.aliyuncs.com.ImportDatabaseBetweenInstances.2014-08-15";
    }

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

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<ImportDatabaseBetweenInstancesResponse> getResponseClass() {
        return ImportDatabaseBetweenInstancesResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(dBInfo, "dBInfo");
        RequestCheckUtils.checkNotEmpty(dBInstanceId, "dBInstanceId");
        RequestCheckUtils.checkNotEmpty(sourceDBInstanceId, "sourceDBInstanceId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
