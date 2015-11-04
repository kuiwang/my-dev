package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaToolsItemsTopGetResponse;

/**
 * TOP API: taobao.simba.tools.items.top.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:22
 */
public class SimbaToolsItemsTopGetRequest implements TaobaoRequest<SimbaToolsItemsTopGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 输入的必须是一个符合ipv4或者ipv6格式的IP地址
     */
    private String ip;

    /**
     * 关键词
     */
    private String keyword;

    /**
     * 主人昵称
     */
    private String nick;

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return this.ip;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.simba.tools.items.top.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("ip", this.ip);
        txtParams.put("keyword", this.keyword);
        txtParams.put("nick", this.nick);
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

    public Class<SimbaToolsItemsTopGetResponse> getResponseClass() {
        return SimbaToolsItemsTopGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(ip, "ip");
        RequestCheckUtils.checkNotEmpty(keyword, "keyword");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
