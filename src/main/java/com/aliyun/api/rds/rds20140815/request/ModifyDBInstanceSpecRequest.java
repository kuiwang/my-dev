package com.aliyun.api.rds.rds20140815.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.rds.rds20140815.response.ModifyDBInstanceSpecResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: rds.aliyuncs.com.ModifyDBInstanceSpec.2014-08-15 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:46
 */
public class ModifyDBInstanceSpecRequest implements AliyunRequest<ModifyDBInstanceSpecResponse> {

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
     * 目标实例级别
     */
    private String dBInstanceClass;

    /**
     * 待升降级的实例
     */
    private String dBInstanceId;

    /**
     * 自定义存储空间，取值范围：mysql为[5,1000],sqlserver为[10,1000].此参数替代型号中的最大存储空间，
     * 见实例规格附表 单位：GB 只能升级<br />
     * 支持最大值为：1000<br />
     * 支持最小值为：5
     */
    private Long dBInstanceStorage;

    /**
     * Postpaid，按量付费，目前只有这一种
     */
    private String payType;

    public void setdBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    public String getdBInstanceClass() {
        return this.dBInstanceClass;
    }

    public void setdBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
    }

    public String getdBInstanceId() {
        return this.dBInstanceId;
    }

    public void setdBInstanceStorage(Long dBInstanceStorage) {
        this.dBInstanceStorage = dBInstanceStorage;
    }

    public Long getdBInstanceStorage() {
        return this.dBInstanceStorage;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayType() {
        return this.payType;
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
        return "rds.aliyuncs.com.ModifyDBInstanceSpec.2014-08-15";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("DBInstanceClass", this.dBInstanceClass);
        txtParams.put("DBInstanceId", this.dBInstanceId);
        txtParams.put("DBInstanceStorage", this.dBInstanceStorage);
        txtParams.put("PayType", this.payType);
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

    public Class<ModifyDBInstanceSpecResponse> getResponseClass() {
        return ModifyDBInstanceSpecResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(dBInstanceId, "dBInstanceId");
        RequestCheckUtils.checkMaxValue(dBInstanceStorage, 1000L, "dBInstanceStorage");
        RequestCheckUtils.checkMinValue(dBInstanceStorage, 5L, "dBInstanceStorage");
        RequestCheckUtils.checkNotEmpty(payType, "payType");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
