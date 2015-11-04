package com.aliyun.api.yundun.yundun20140924.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.yundun.yundun20140924.response.SetSLBDdosSettingResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: yundun.aliyuncs.com.setSLBDdosSetting.2014-09-24 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:47
 */
public class SetSLBDdosSettingRequest implements AliyunRequest<SetSLBDdosSettingResponse> {

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
     * bps
     */
    private Long bps;

    /**
     * instanceId
     */
    private String instanceId;

    /**
     * isLayer7
     */
    private Boolean isLayer7;

    /**
     * pps
     */
    private Long pps;

    /**
     * qps
     */
    private Long qps;

    /**
     * sipConn
     */
    private Long sipConn;

    /**
     * sipNew
     */
    private Long sipNew;

    public void setBps(Long bps) {
        this.bps = bps;
    }

    public Long getBps() {
        return this.bps;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setIsLayer7(Boolean isLayer7) {
        this.isLayer7 = isLayer7;
    }

    public Boolean getIsLayer7() {
        return this.isLayer7;
    }

    public void setPps(Long pps) {
        this.pps = pps;
    }

    public Long getPps() {
        return this.pps;
    }

    public void setQps(Long qps) {
        this.qps = qps;
    }

    public Long getQps() {
        return this.qps;
    }

    public void setSipConn(Long sipConn) {
        this.sipConn = sipConn;
    }

    public Long getSipConn() {
        return this.sipConn;
    }

    public void setSipNew(Long sipNew) {
        this.sipNew = sipNew;
    }

    public Long getSipNew() {
        return this.sipNew;
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
        return "yundun.aliyuncs.com.setSLBDdosSetting.2014-09-24";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("bps", this.bps);
        txtParams.put("instanceId", this.instanceId);
        txtParams.put("isLayer7", this.isLayer7);
        txtParams.put("pps", this.pps);
        txtParams.put("qps", this.qps);
        txtParams.put("sipConn", this.sipConn);
        txtParams.put("sipNew", this.sipNew);
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

    public Class<SetSLBDdosSettingResponse> getResponseClass() {
        return SetSLBDdosSettingResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(bps, "bps");
        RequestCheckUtils.checkNotEmpty(instanceId, "instanceId");
        RequestCheckUtils.checkNotEmpty(isLayer7, "isLayer7");
        RequestCheckUtils.checkNotEmpty(pps, "pps");
        RequestCheckUtils.checkNotEmpty(qps, "qps");
        RequestCheckUtils.checkNotEmpty(sipConn, "sipConn");
        RequestCheckUtils.checkNotEmpty(sipNew, "sipNew");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
