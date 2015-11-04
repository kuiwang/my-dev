package com.aliyun.api.rds.rds20140815.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.rds.rds20140815.response.CreateAccountResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: rds.aliyuncs.com.CreateAccount.2014-08-15 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:43
 */
public class CreateAccountRequest implements AliyunRequest<CreateAccountResponse> {

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
     * 帐号备注，长度不超过256个字符
     */
    private String accountDescription;

    /**
     * 数据库帐户名操作帐号，需惟一性检查，由小写字母，数字、下划线组成，字母开头，长度不超过16个字符。
     */
    private String accountName;

    /**
     * 操作密码，由字母、数字或下划线组成，长度为6~32位
     */
    private String accountPassword;

    /**
     * 实例名
     */
    private String dBInstanceId;

    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }

    public String getAccountDescription() {
        return this.accountDescription;
    }

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

    public void setdBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
    }

    public String getdBInstanceId() {
        return this.dBInstanceId;
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
        return "rds.aliyuncs.com.CreateAccount.2014-08-15";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("AccountDescription", this.accountDescription);
        txtParams.put("AccountName", this.accountName);
        txtParams.put("AccountPassword", this.accountPassword);
        txtParams.put("DBInstanceId", this.dBInstanceId);
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

    public Class<CreateAccountResponse> getResponseClass() {
        return CreateAccountResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(accountName, "accountName");
        RequestCheckUtils.checkNotEmpty(accountPassword, "accountPassword");
        RequestCheckUtils.checkNotEmpty(dBInstanceId, "dBInstanceId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
