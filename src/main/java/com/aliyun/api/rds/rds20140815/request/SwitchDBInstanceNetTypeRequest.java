package com.aliyun.api.rds.rds20140815.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.rds.rds20140815.response.SwitchDBInstanceNetTypeResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: rds.aliyuncs.com.SwitchDBInstanceNetType.2014-08-15 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:47
 */
public class SwitchDBInstanceNetTypeRequest
        implements AliyunRequest<SwitchDBInstanceNetTypeResponse> {

    /**
     * 新的用户连接，用户连接DB的地（前辍），需惟一性检查，由小写字母数字，中划线组成，字母开头，长度不超过30个字符
     */
    private String connectionStringPrefix;

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
     * 端口号,参数大小范围：3001~3999<br />
     * 支持最大值为：3999<br />
     * 支持最小值为：3001
     */
    private Long port;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(connectionStringPrefix, "connectionStringPrefix");
        RequestCheckUtils.checkNotEmpty(dBInstanceId, "dBInstanceId");
        RequestCheckUtils.checkMaxValue(port, 3999L, "port");
        RequestCheckUtils.checkMinValue(port, 3001L, "port");
    }

    @Override
    public String getApiMethodName() {
        return "rds.aliyuncs.com.SwitchDBInstanceNetType.2014-08-15";
    }

    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
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

    public Long getPort() {
        return this.port;
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    @Override
    public Class<SwitchDBInstanceNetTypeResponse> getResponseClass() {
        return SwitchDBInstanceNetTypeResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("ConnectionStringPrefix", this.connectionStringPrefix);
        txtParams.put("DBInstanceId", this.dBInstanceId);
        txtParams.put("Port", this.port);
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

    public void setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
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

    public void setPort(Long port) {
        this.port = port;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
