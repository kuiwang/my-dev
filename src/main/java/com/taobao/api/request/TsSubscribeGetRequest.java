package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TsSubscribeGetResponse;

/**
 * TOP API: taobao.ts.subscribe.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:29
 */
public class TsSubscribeGetRequest implements TaobaoRequest<TsSubscribeGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 订购用户昵称<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String nick;

    /**
     * 服务收费项code<br />
     * 支持最大长度为：64<br />
     * 支持的最大列表长度为：64
     */
    private String servcieItemCode;

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public void setServcieItemCode(String servcieItemCode) {
        this.servcieItemCode = servcieItemCode;
    }

    public String getServcieItemCode() {
        return this.servcieItemCode;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.ts.subscribe.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("nick", this.nick);
        txtParams.put("servcie_item_code", this.servcieItemCode);
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

    public Class<TsSubscribeGetResponse> getResponseClass() {
        return TsSubscribeGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(nick, "nick");
        RequestCheckUtils.checkMaxLength(nick, 32, "nick");
        RequestCheckUtils.checkNotEmpty(servcieItemCode, "servcieItemCode");
        RequestCheckUtils.checkMaxLength(servcieItemCode, 64, "servcieItemCode");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
