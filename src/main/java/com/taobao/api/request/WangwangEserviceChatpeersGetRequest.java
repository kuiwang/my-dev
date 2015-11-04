package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WangwangEserviceChatpeersGetResponse;

/**
 * TOP API: taobao.wangwang.eservice.chatpeers.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class WangwangEserviceChatpeersGetRequest implements
        TaobaoRequest<WangwangEserviceChatpeersGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 字符集
     */
    private String charset;

    /**
     * 聊天用户ID：cntaobao+淘宝nick，例如cntaobaotest
     */
    private String chatId;

    /**
     * 查询结束日期。如2010-03-24，与起始日期跨度不能超过7天
     */
    private String endDate;

    /**
     * 查询起始日期。如2010-02-01，与当前日期间隔小于1个月。
     */
    private String startDate;

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getCharset() {
        return this.charset;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wangwang.eservice.chatpeers.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("charset", this.charset);
        txtParams.put("chat_id", this.chatId);
        txtParams.put("end_date", this.endDate);
        txtParams.put("start_date", this.startDate);
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

    public Class<WangwangEserviceChatpeersGetResponse> getResponseClass() {
        return WangwangEserviceChatpeersGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(chatId, "chatId");
        RequestCheckUtils.checkNotEmpty(endDate, "endDate");
        RequestCheckUtils.checkNotEmpty(startDate, "startDate");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
