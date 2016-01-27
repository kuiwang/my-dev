package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbNotifyMessageConfirmResponse;

/**
 * TOP API: taobao.wlb.notify.message.confirm request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:14
 */
public class WlbNotifyMessageConfirmRequest implements
        TaobaoRequest<WlbNotifyMessageConfirmResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 物流宝通知消息的id，通过taobao.wlb.notify.message.page.
     * get接口得到的WlbMessage数据结构中的id字段
     */
    private Long messageId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(messageId, "messageId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wlb.notify.message.confirm";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getMessageId() {
        return this.messageId;
    }

    @Override
    public Class<WlbNotifyMessageConfirmResponse> getResponseClass() {
        return WlbNotifyMessageConfirmResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("message_id", this.messageId);
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

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
