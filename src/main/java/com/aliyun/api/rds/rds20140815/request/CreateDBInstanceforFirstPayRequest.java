package com.aliyun.api.rds.rds20140815.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.rds.rds20140815.response.CreateDBInstanceforFirstPayResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: rds.aliyuncs.com.CreateDBInstanceforFirstPay.2014-08-15 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:43
 */
public class CreateDBInstanceforFirstPayRequest implements
        AliyunRequest<CreateDBInstanceforFirstPayResponse> {

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
     * 字符集
     */
    private String characterSetName;

    /**
     * 用于保证幂等性。
     */
    private String clientToken;

    /**
     * 实例规格
     */
    private String dBInstanceClass;

    /**
     * 实例IP的网络类型： Internet代表公网， Intranet代表私网；
     */
    private String dBInstanceNetType;

    /**
     * 实例的描述或备注信息，不超过256个字节 可用字符限制说清楚，像ECS的靠拢。
     */
    private String dBInstanceRemarks;

    /**
     * 自定义存储空间，取值范围：mysql为[5,1000]，sql server为[10，1000]。 单位：GB
     */
    private Long dBInstanceStorage;

    /**
     * 数据库类型，取值范围为MySQL|SQLServer。
     */
    private String engine;

    /**
     * 数据库版本号 取值如下： MySQL：5.1/5.5/5.6，默认为5.5 SQLServer：2008r2，默认为2008r2
     */
    private String engineVersion;

    /**
     * 数据中心，长度不超过50个字符<br />
     * 支持最大长度为：50<br />
     * 支持的最大列表长度为：50
     */
    private String regionId;

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public void setdBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    public String getdBInstanceClass() {
        return this.dBInstanceClass;
    }

    public void setdBInstanceNetType(String dBInstanceNetType) {
        this.dBInstanceNetType = dBInstanceNetType;
    }

    public String getdBInstanceNetType() {
        return this.dBInstanceNetType;
    }

    public void setdBInstanceRemarks(String dBInstanceRemarks) {
        this.dBInstanceRemarks = dBInstanceRemarks;
    }

    public String getdBInstanceRemarks() {
        return this.dBInstanceRemarks;
    }

    public void setdBInstanceStorage(Long dBInstanceStorage) {
        this.dBInstanceStorage = dBInstanceStorage;
    }

    public Long getdBInstanceStorage() {
        return this.dBInstanceStorage;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public String getEngineVersion() {
        return this.engineVersion;
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
        return "rds.aliyuncs.com.CreateDBInstanceforFirstPay.2014-08-15";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("CharacterSetName", this.characterSetName);
        txtParams.put("ClientToken", this.clientToken);
        txtParams.put("DBInstanceClass", this.dBInstanceClass);
        txtParams.put("DBInstanceNetType", this.dBInstanceNetType);
        txtParams.put("DBInstanceRemarks", this.dBInstanceRemarks);
        txtParams.put("DBInstanceStorage", this.dBInstanceStorage);
        txtParams.put("Engine", this.engine);
        txtParams.put("EngineVersion", this.engineVersion);
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

    public Class<CreateDBInstanceforFirstPayResponse> getResponseClass() {
        return CreateDBInstanceforFirstPayResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(clientToken, "clientToken");
        RequestCheckUtils.checkNotEmpty(dBInstanceClass, "dBInstanceClass");
        RequestCheckUtils.checkNotEmpty(dBInstanceNetType, "dBInstanceNetType");
        RequestCheckUtils.checkNotEmpty(dBInstanceStorage, "dBInstanceStorage");
        RequestCheckUtils.checkNotEmpty(engine, "engine");
        RequestCheckUtils.checkNotEmpty(regionId, "regionId");
        RequestCheckUtils.checkMaxLength(regionId, 50, "regionId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
