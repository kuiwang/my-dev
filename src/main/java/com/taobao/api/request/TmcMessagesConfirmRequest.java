package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmcMessagesConfirmResponse;

/**
 * TOP API: taobao.tmc.messages.confirm request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:33
 */
public class TmcMessagesConfirmRequest implements TaobaoRequest<TmcMessagesConfirmResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 处理失败的消息ID列表
     */
    private String fMessageIds;

    /**
     * 分组名称，不传代表默认分组
     */
    private String groupName;

    /**
     * 处理成功的消息ID列表 最大 200个ID
     */
    private String sMessageIds;

    public void setfMessageIds(String fMessageIds) {
        this.fMessageIds = fMessageIds;
    }

    public String getfMessageIds() {
        return this.fMessageIds;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setsMessageIds(String sMessageIds) {
        this.sMessageIds = sMessageIds;
    }

    public String getsMessageIds() {
        return this.sMessageIds;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.tmc.messages.confirm";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("f_message_ids", this.fMessageIds);
        txtParams.put("group_name", this.groupName);
        txtParams.put("s_message_ids", this.sMessageIds);
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

    public Class<TmcMessagesConfirmResponse> getResponseClass() {
        return TmcMessagesConfirmResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(fMessageIds, 200, "fMessageIds");
        RequestCheckUtils.checkNotEmpty(sMessageIds, "sMessageIds");
        RequestCheckUtils.checkMaxListSize(sMessageIds, 200, "sMessageIds");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
