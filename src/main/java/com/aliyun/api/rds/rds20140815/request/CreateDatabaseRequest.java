package com.aliyun.api.rds.rds20140815.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.rds.rds20140815.response.CreateDatabaseResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: rds.aliyuncs.com.CreateDatabase.2014-08-15 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:43
 */
public class CreateDatabaseRequest implements AliyunRequest<CreateDatabaseResponse> {

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
     * 字符集，取值范围限定如下字符集： MySQL类型：utf8|gbk|latin1|utf8mb4(5.5和5.6有)
     * SQLServer类型： Chinese_PRC_CI_AS Chinese_PRC_CS_AS
     * SQL_Latin1_General_CP1_CI_AS SQL_Latin1_General_CP1_CS_AS
     * Chinese_PRC_BIN
     */
    private String characterSetName;

    /**
     * 数据库描述
     */
    private String createDatabase;

    /**
     * 数据库描述，不超过256个字符
     */
    private String dBDescription;

    /**
     * 实例名
     */
    private String dBInstanceId;

    /**
     * 数据库名，由小写字母，数字、下划线组成，字母开头，长度不超过64个字符
     */
    private String dBName;

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    public void setCreateDatabase(String createDatabase) {
        this.createDatabase = createDatabase;
    }

    public String getCreateDatabase() {
        return this.createDatabase;
    }

    public void setdBDescription(String dBDescription) {
        this.dBDescription = dBDescription;
    }

    public String getdBDescription() {
        return this.dBDescription;
    }

    public void setdBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
    }

    public String getdBInstanceId() {
        return this.dBInstanceId;
    }

    public void setdBName(String dBName) {
        this.dBName = dBName;
    }

    public String getdBName() {
        return this.dBName;
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
        return "rds.aliyuncs.com.CreateDatabase.2014-08-15";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("CharacterSetName", this.characterSetName);
        txtParams.put("CreateDatabase", this.createDatabase);
        txtParams.put("DBDescription", this.dBDescription);
        txtParams.put("DBInstanceId", this.dBInstanceId);
        txtParams.put("DBName", this.dBName);
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

    public Class<CreateDatabaseResponse> getResponseClass() {
        return CreateDatabaseResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(characterSetName, "characterSetName");
        RequestCheckUtils.checkNotEmpty(dBInstanceId, "dBInstanceId");
        RequestCheckUtils.checkNotEmpty(dBName, "dBName");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
