package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmcMessageProduceResponse;

/**
 * TOP API: taobao.tmc.message.produce request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:33
 */
public class TmcMessageProduceRequest implements TaobaoRequest<TmcMessageProduceResponse> {

    /**
     * 消息内容的JSON表述，必须按照topic的定义来填充<br />
     * 支持最大长度为：2000<br />
     * 支持的最大列表长度为：2000
     */
    private String content;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    /**
     * 发布消息关联的主题<br />
     * 支持最大长度为：256<br />
     * 支持的最大列表长度为：256
     */
    private String topic;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(content, "content");
        RequestCheckUtils.checkMaxLength(content, 2000, "content");
        RequestCheckUtils.checkNotEmpty(topic, "topic");
        RequestCheckUtils.checkMaxLength(topic, 256, "topic");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.tmc.message.produce";
    }

    public String getContent() {
        return this.content;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<TmcMessageProduceResponse> getResponseClass() {
        return TmcMessageProduceResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("content", this.content);
        txtParams.put("topic", this.topic);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getTopic() {
        return this.topic;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
