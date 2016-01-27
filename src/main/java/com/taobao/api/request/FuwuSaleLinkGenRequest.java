package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FuwuSaleLinkGenResponse;

/**
 * TOP API: taobao.fuwu.sale.link.gen request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class FuwuSaleLinkGenRequest implements TaobaoRequest<FuwuSaleLinkGenResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 用户需要营销的目标人群中的用户nick
     */
    private String nick;

    /**
     * 从服务商后台，营销链接功能中生成的参数串直接复制使用。不要修改，否则抛错。
     */
    private String paramStr;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(paramStr, "paramStr");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fuwu.sale.link.gen";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNick() {
        return this.nick;
    }

    public String getParamStr() {
        return this.paramStr;
    }

    @Override
    public Class<FuwuSaleLinkGenResponse> getResponseClass() {
        return FuwuSaleLinkGenResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("nick", this.nick);
        txtParams.put("param_str", this.paramStr);
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

    public void setParamStr(String paramStr) {
        this.paramStr = paramStr;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
