package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmcGroupAddResponse;

/**
 * TOP API: taobao.tmc.group.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:33
 */
public class TmcGroupAddRequest implements TaobaoRequest<TmcGroupAddResponse> {

    /**
     * 分组名称，同一个应用下需要保证唯一性，最长32个字符。添加分组后，消息通道会为用户的消息分配独立分组，但之前的消息还是存储于默认分组中。
     * 不能以default开头，default开头为系统默认组。<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String groupName;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 用户昵称列表，以半角逗号分隔，支持子账号，支持增量添加用户
     */
    private String nicks;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(groupName, "groupName");
        RequestCheckUtils.checkMaxLength(groupName, 32, "groupName");
        RequestCheckUtils.checkNotEmpty(nicks, "nicks");
        RequestCheckUtils.checkMaxListSize(nicks, 200, "nicks");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.tmc.group.add";
    }

    public String getGroupName() {
        return this.groupName;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNicks() {
        return this.nicks;
    }

    @Override
    public Class<TmcGroupAddResponse> getResponseClass() {
        return TmcGroupAddResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("group_name", this.groupName);
        txtParams.put("nicks", this.nicks);
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

    public void setNicks(String nicks) {
        this.nicks = nicks;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
