package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RefundRefuseResponse;

/**
 * TOP API: taobao.refund.refuse request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:29
 */
public class RefundRefuseRequest implements TaobaoUploadRequest<RefundRefuseResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 退款单号
     */
    private Long refundId;

    /**
     * 可选值为：售中：onsale，售后：aftersale，天猫退款为必填项。
     */
    private String refundPhase;

    /**
     * 退款版本号，天猫退款为必填项。
     */
    private Long refundVersion;

    /**
     * 拒绝退款时的说明信息，长度2-200<br />
     * 支持最大长度为：200<br />
     * 支持的最大列表长度为：200
     */
    private String refuseMessage;

    /**
     * 拒绝退款时的退款凭证，一般是卖家拒绝退款时使用的发货凭证，最大长度130000字节，支持的图片格式：GIF, JPG,
     * PNG。天猫退款为必填项。<br />
     * 支持的文件类型为：gif,jpg,png<br />
     * 支持的最大列表长度为：130000
     */
    private FileItem refuseProof;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(refundId, "refundId");
        RequestCheckUtils.checkNotEmpty(refuseMessage, "refuseMessage");
        RequestCheckUtils.checkMaxLength(refuseMessage, 200, "refuseMessage");
        RequestCheckUtils.checkMaxLength(refuseProof, 130000, "refuseProof");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.refund.refuse";
    }

    @Override
    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("refuse_proof", this.refuseProof);
        return params;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getRefundId() {
        return this.refundId;
    }

    public String getRefundPhase() {
        return this.refundPhase;
    }

    public Long getRefundVersion() {
        return this.refundVersion;
    }

    public String getRefuseMessage() {
        return this.refuseMessage;
    }

    public FileItem getRefuseProof() {
        return this.refuseProof;
    }

    @Override
    public Class<RefundRefuseResponse> getResponseClass() {
        return RefundRefuseResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("refund_id", this.refundId);
        txtParams.put("refund_phase", this.refundPhase);
        txtParams.put("refund_version", this.refundVersion);
        txtParams.put("refuse_message", this.refuseMessage);
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

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    public void setRefundPhase(String refundPhase) {
        this.refundPhase = refundPhase;
    }

    public void setRefundVersion(Long refundVersion) {
        this.refundVersion = refundVersion;
    }

    public void setRefuseMessage(String refuseMessage) {
        this.refuseMessage = refuseMessage;
    }

    public void setRefuseProof(FileItem refuseProof) {
        this.refuseProof = refuseProof;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
