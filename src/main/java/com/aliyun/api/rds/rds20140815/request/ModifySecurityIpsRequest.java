package com.aliyun.api.rds.rds20140815.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.rds.rds20140815.response.ModifySecurityIpsResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: rds.aliyuncs.com.ModifySecurityIps.2014-08-15 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:46
 */
public class ModifySecurityIpsRequest implements AliyunRequest<ModifySecurityIpsResponse> {

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
     * 实例名
     */
    private String dBInstanceId;

    /**
     * 允许访问该实例下所有数据库的IP名单，以逗号隔开，不可重复，最多100个；支持格式：0.0.0.0/0，10.23.12.24（IP），
     * 或者10.23.12.24/24（CIDR模式，无类域间路由，/24表示了地址中前缀的长度，范围[1,32]）其中，
     * 0.0.0.0/0，表示不限制
     */
    private String securityIps;

    public void setdBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
    }

    public String getdBInstanceId() {
        return this.dBInstanceId;
    }

    public void setSecurityIps(String securityIps) {
        this.securityIps = securityIps;
    }

    public String getSecurityIps() {
        return this.securityIps;
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
        return "rds.aliyuncs.com.ModifySecurityIps.2014-08-15";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("DBInstanceId", this.dBInstanceId);
        txtParams.put("SecurityIps", this.securityIps);
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

    public Class<ModifySecurityIpsResponse> getResponseClass() {
        return ModifySecurityIpsResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(dBInstanceId, "dBInstanceId");
        RequestCheckUtils.checkNotEmpty(securityIps, "securityIps");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
