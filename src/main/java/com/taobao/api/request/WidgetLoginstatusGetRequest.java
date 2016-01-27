package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WidgetLoginstatusGetResponse;

/**
 * TOP API: taobao.widget.loginstatus.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:30
 */
public class WidgetLoginstatusGetRequest implements TaobaoRequest<WidgetLoginstatusGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 指定判断当前浏览器登陆用户是否此昵称用户，并且返回是否登陆。如果用户不一致返回未登陆，如果用户一致且已登录返回已登陆
     */
    private String nick;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "taobao.widget.loginstatus.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNick() {
        return this.nick;
    }

    @Override
    public Class<WidgetLoginstatusGetResponse> getResponseClass() {
        return WidgetLoginstatusGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("nick", this.nick);
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

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
