package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WirelessQrcodeGetResponse;

/**
 * TOP API: taobao.wireless.qrcode.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:49
 */
public class WirelessQrcodeGetRequest implements TaobaoRequest<WirelessQrcodeGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 二维码高度
     */
    private Long height;

    /**
     * 用户的淘宝nick
     */
    private String nick;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * url参数
     */
    private String urlparam;

    /**
     * 二维码宽度
     */
    private Long width;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(height, "height");
        RequestCheckUtils.checkNotEmpty(nick, "nick");
        RequestCheckUtils.checkNotEmpty(width, "width");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wireless.qrcode.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getHeight() {
        return this.height;
    }

    public String getNick() {
        return this.nick;
    }

    @Override
    public Class<WirelessQrcodeGetResponse> getResponseClass() {
        return WirelessQrcodeGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("height", this.height);
        txtParams.put("nick", this.nick);
        txtParams.put("urlparam", this.urlparam);
        txtParams.put("width", this.width);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getUrlparam() {
        return this.urlparam;
    }

    public Long getWidth() {
        return this.width;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setUrlparam(String urlparam) {
        this.urlparam = urlparam;
    }

    public void setWidth(Long width) {
        this.width = width;
    }
}
