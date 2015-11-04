package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmcGroupDeleteResponse;

/**
 * TOP API: taobao.tmc.group.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:33
 */
public class TmcGroupDeleteRequest implements TaobaoRequest<TmcGroupDeleteResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 分组名称，分组删除后，用户的消息将会存储于默认分组中。警告：由于分组已经删除，用户之前未消费的消息将无法再获取。不能以default开头
     * ，default开头为系统默认组。
     */
    private String groupName;

    /**
     * 用户列表，不传表示删除整个分组，如果用户全部删除后，也会自动删除整个分组
     */
    private String nicks;

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setNicks(String nicks) {
        this.nicks = nicks;
    }

    public String getNicks() {
        return this.nicks;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.tmc.group.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("group_name", this.groupName);
        txtParams.put("nicks", this.nicks);
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

    public Class<TmcGroupDeleteResponse> getResponseClass() {
        return TmcGroupDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(groupName, "groupName");
        RequestCheckUtils.checkMaxListSize(nicks, 20, "nicks");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
