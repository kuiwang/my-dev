package com.aliyun.api.rds.rds20140815.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.rds.rds20140815.response.CreatePostpaidDBInstanceResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: rds.aliyuncs.com.CreatePostpaidDBInstance.2014-08-15 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:43
 */
public class CreatePostpaidDBInstanceRequest
        implements AliyunRequest<CreatePostpaidDBInstanceResponse> {

    /**
     * 用于保证幂等性
     */
    private String clientToken;

    /**
     * 实例规格，可选值：见实例规格附表
     */
    private String dBInstanceClass;

    /**
     * 不能以http://,https开头 开始以中文，英文字母开头 可以包含中文，英文字符，_，-，数字字符長度2~256
     */
    private String dBInstanceDescription;

    /**
     * 实例IP的网络类型： Internet代表公网， Intranet代表私网；
     */
    private String dBInstanceNetType;

    /**
     * 自定义存储空间，取值范围：mysql为[5,1000]，sql server为[10，1000]。 单位：GB
     */
    private Long dBInstanceStorage;

    /**
     * 数据库类型，取值范围为MySQL|SQLServer
     */
    private String engine;

    /**
     * 数据库版本号 取值如下： MySQL：5.5/5.6SQLServer：2008r2
     */
    private String engineVersion;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * 数据中心，长度不超过50个字符
     */
    private String regionId;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * 允许访问该实例下所有数据库的IP名单，以逗号隔开，不可重复，最多100个；支持格式：%，0.0.0.0/0，10.23.12.24（IP
     * ），或者10.23.12.24/24（CIDR模式，无类域间路由，/24表示了地址中前缀的长度，范围[1,32]）
     * 其中，0.0.0.0/0，表示不限制，用户输入%提示报错
     */
    private String securityIPList;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(clientToken, "clientToken");
        RequestCheckUtils.checkNotEmpty(dBInstanceClass, "dBInstanceClass");
        RequestCheckUtils.checkNotEmpty(dBInstanceNetType, "dBInstanceNetType");
        RequestCheckUtils.checkNotEmpty(dBInstanceStorage, "dBInstanceStorage");
        RequestCheckUtils.checkNotEmpty(engine, "engine");
        RequestCheckUtils.checkNotEmpty(engineVersion, "engineVersion");
        RequestCheckUtils.checkNotEmpty(regionId, "regionId");
        RequestCheckUtils.checkNotEmpty(securityIPList, "securityIPList");
    }

    @Override
    public String getApiMethodName() {
        return "rds.aliyuncs.com.CreatePostpaidDBInstance.2014-08-15";
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public String getdBInstanceClass() {
        return this.dBInstanceClass;
    }

    public String getdBInstanceDescription() {
        return this.dBInstanceDescription;
    }

    public String getdBInstanceNetType() {
        return this.dBInstanceNetType;
    }

    public Long getdBInstanceStorage() {
        return this.dBInstanceStorage;
    }

    public String getEngine() {
        return this.engine;
    }

    public String getEngineVersion() {
        return this.engineVersion;
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

    public String getRegionId() {
        return this.regionId;
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    @Override
    public Class<CreatePostpaidDBInstanceResponse> getResponseClass() {
        return CreatePostpaidDBInstanceResponse.class;
    }

    public String getSecurityIPList() {
        return this.securityIPList;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("ClientToken", this.clientToken);
        txtParams.put("DBInstanceClass", this.dBInstanceClass);
        txtParams.put("DBInstanceDescription", this.dBInstanceDescription);
        txtParams.put("DBInstanceNetType", this.dBInstanceNetType);
        txtParams.put("DBInstanceStorage", this.dBInstanceStorage);
        txtParams.put("Engine", this.engine);
        txtParams.put("EngineVersion", this.engineVersion);
        txtParams.put("RegionId", this.regionId);
        txtParams.put("SecurityIPList", this.securityIPList);
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

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public void setdBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    public void setdBInstanceDescription(String dBInstanceDescription) {
        this.dBInstanceDescription = dBInstanceDescription;
    }

    public void setdBInstanceNetType(String dBInstanceNetType) {
        this.dBInstanceNetType = dBInstanceNetType;
    }

    public void setdBInstanceStorage(Long dBInstanceStorage) {
        this.dBInstanceStorage = dBInstanceStorage;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public void setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
