package com.aliyun.api.rds.rds20140815.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.rds.rds20140815.response.CreateDBInstanceForChannelResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: rds.aliyuncs.com.CreateDBInstanceForChannel.2014-08-15 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:43
 */
public class CreateDBInstanceForChannelRequest implements
        AliyunRequest<CreateDBInstanceForChannelResponse> {

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
     * 数据库帐户名操作帐号，需惟一性检查，由小写字母，数字、下划线组成，字母开头，长度不超过16个字符。
     */
    private String accountName;

    /**
     * 操作密码，由字母、数字或下划线组成，长度为6~32位
     */
    private String accountPassword;

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

    /**
     * Postpaid，按量付费，目前只有这一种
     */
    private String payType;

    /**
     * 数据中心，长度不超过50个字符
     */
    private String regionId;

    /**
     * 允许访问该实例下所有数据库的IP名单，以逗号隔开，不可重复，最多100个；支持格式：%，0.0.0.0/0，10.23.12.24（IP
     * ），或者10.23.12.24/24（CIDR模式，无类域间路由，/24表示了地址中前缀的长度，范围[1,32]）
     * 其中，0.0.0.0/0，表示不限制，用户输入%提示报错
     */
    private String securityIPList;

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public String getAccountPassword() {
        return this.accountPassword;
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

    public void setdBInstanceDescription(String dBInstanceDescription) {
        this.dBInstanceDescription = dBInstanceDescription;
    }

    public String getdBInstanceDescription() {
        return this.dBInstanceDescription;
    }

    public void setdBInstanceNetType(String dBInstanceNetType) {
        this.dBInstanceNetType = dBInstanceNetType;
    }

    public String getdBInstanceNetType() {
        return this.dBInstanceNetType;
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

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayType() {
        return this.payType;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
    }

    public String getSecurityIPList() {
        return this.securityIPList;
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
        return "rds.aliyuncs.com.CreateDBInstanceForChannel.2014-08-15";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("AccountName", this.accountName);
        txtParams.put("AccountPassword", this.accountPassword);
        txtParams.put("ClientToken", this.clientToken);
        txtParams.put("DBInstanceClass", this.dBInstanceClass);
        txtParams.put("DBInstanceDescription", this.dBInstanceDescription);
        txtParams.put("DBInstanceNetType", this.dBInstanceNetType);
        txtParams.put("DBInstanceStorage", this.dBInstanceStorage);
        txtParams.put("Engine", this.engine);
        txtParams.put("EngineVersion", this.engineVersion);
        txtParams.put("PayType", this.payType);
        txtParams.put("RegionId", this.regionId);
        txtParams.put("SecurityIPList", this.securityIPList);
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

    public Class<CreateDBInstanceForChannelResponse> getResponseClass() {
        return CreateDBInstanceForChannelResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(accountName, "accountName");
        RequestCheckUtils.checkNotEmpty(accountPassword, "accountPassword");
        RequestCheckUtils.checkNotEmpty(clientToken, "clientToken");
        RequestCheckUtils.checkNotEmpty(dBInstanceClass, "dBInstanceClass");
        RequestCheckUtils.checkNotEmpty(dBInstanceNetType, "dBInstanceNetType");
        RequestCheckUtils.checkNotEmpty(dBInstanceStorage, "dBInstanceStorage");
        RequestCheckUtils.checkNotEmpty(engine, "engine");
        RequestCheckUtils.checkNotEmpty(engineVersion, "engineVersion");
        RequestCheckUtils.checkNotEmpty(payType, "payType");
        RequestCheckUtils.checkNotEmpty(regionId, "regionId");
        RequestCheckUtils.checkNotEmpty(securityIPList, "securityIPList");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
