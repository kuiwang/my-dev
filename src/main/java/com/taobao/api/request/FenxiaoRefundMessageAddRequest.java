package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoRefundMessageAddResponse;

/**
 * TOP API: taobao.fenxiao.refund.message.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoRefundMessageAddRequest implements
        TaobaoUploadRequest<FenxiaoRefundMessageAddResponse> {

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 留言凭证
     */
    private FileItem image;

    /**
     * 留言内容
     */
    private String messageContent;

    /**
     * 发生退款的子采购单id
     */
    private Long subOrderId;

    public void setImage(FileItem image) {
        this.image = image;
    }

    public FileItem getImage() {
        return this.image;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getMessageContent() {
        return this.messageContent;
    }

    public void setSubOrderId(Long subOrderId) {
        this.subOrderId = subOrderId;
    }

    public Long getSubOrderId() {
        return this.subOrderId;
    }

    private Map<String, String> headerMap = new TaobaoHashMap();

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.refund.message.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("message_content", this.messageContent);
        txtParams.put("sub_order_id", this.subOrderId);
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

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("image", this.image);
        return params;
    }

    public Class<FenxiaoRefundMessageAddResponse> getResponseClass() {
        return FenxiaoRefundMessageAddResponse.class;
    }

    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(messageContent, "messageContent");
        RequestCheckUtils.checkNotEmpty(subOrderId, "subOrderId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
