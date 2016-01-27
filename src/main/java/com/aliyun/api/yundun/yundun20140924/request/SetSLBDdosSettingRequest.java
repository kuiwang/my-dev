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

    /**
     * bps
     */
    private Long bps;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * instanceId
     */
    private String instanceId;

    /**
     * isLayer7
     */
    private Boolean isLayer7;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * pps
     */
    private Long pps;

    /**
     * qps
     */
    private Long qps;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * sipConn
     */
    private Long sipConn;

    /**
     * sipNew
     */
    private Long sipNew;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(bps, "bps");
        RequestCheckUtils.checkNotEmpty(instanceId, "instanceId");
        RequestCheckUtils.checkNotEmpty(isLayer7, "isLayer7");
        RequestCheckUtils.checkNotEmpty(pps, "pps");
        RequestCheckUtils.checkNotEmpty(qps, "qps");
        RequestCheckUtils.checkNotEmpty(sipConn, "sipConn");
        RequestCheckUtils.checkNotEmpty(sipNew, "sipNew");
    }

    @Override
    public String getApiMethodName() {
        return "yundun.aliyuncs.com.setSLBDdosSetting.2014-09-24";
    }

    public Long getBps() {
        return this.bps;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public Boolean getIsLayer7() {
        return this.isLayer7;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public Long getPps() {
        return this.pps;
    }

    public Long getQps() {
        return this.qps;
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    @Override
    public Class<SetSLBDdosSettingResponse> getResponseClass() {
        return SetSLBDdosSettingResponse.class;
    }

    public Long getSipConn() {
        return this.sipConn;
    }

    public Long getSipNew() {
        return this.sipNew;
    }

    @Override
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

    public void setBps(Long bps) {
        this.bps = bps;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public void setIsLayer7(Boolean isLayer7) {
        this.isLayer7 = isLayer7;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public void setPps(Long pps) {
        this.pps = pps;
    }

    public void setQps(Long qps) {
        this.qps = qps;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public void setSipConn(Long sipConn) {
        this.sipConn = sipConn;
    }

    public void setSipNew(Long sipNew) {
        this.sipNew = sipNew;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
