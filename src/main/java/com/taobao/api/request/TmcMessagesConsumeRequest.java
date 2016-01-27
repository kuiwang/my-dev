package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmcMessagesConsumeResponse;

/**
 * TOP API: taobao.tmc.messages.consume request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:33
 */
public class TmcMessagesConsumeRequest implements TaobaoRequest<TmcMessagesConsumeResponse> {

    /**
     * 用户分组名称，不传表示消费默认分组，如果应用没有设置用户分组，传入分组名称将会返回错误
     */
    private String groupName;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 每次批量消费消息的条数<br />
     * 支持最大值为：200<br />
     * 支持最小值为：10
     */
    private Long quantity;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(quantity, 200L, "quantity");
        RequestCheckUtils.checkMinValue(quantity, 10L, "quantity");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.tmc.messages.consume";
    }

    public String getGroupName() {
        return this.groupName;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    @Override
    public Class<TmcMessagesConsumeResponse> getResponseClass() {
        return TmcMessagesConsumeResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("group_name", this.groupName);
        txtParams.put("quantity", this.quantity);
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

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
