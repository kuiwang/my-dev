package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ShopUpdateResponse;

/**
 * TOP API: taobao.shop.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class ShopUpdateRequest implements TaobaoRequest<ShopUpdateResponse> {

    /**
     * 店铺公告。不超过1024个字符
     */
    private String bulletin;

    /**
     * 店铺描述。10～2000个字符以内
     */
    private String desc;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    /**
     * 店铺标题。不超过30个字符；过滤敏感词，如淘咖啡、阿里巴巴等。title, bulletin和desc至少必须传一个
     */
    private String title;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "taobao.shop.update";
    }

    public String getBulletin() {
        return this.bulletin;
    }

    public String getDesc() {
        return this.desc;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<ShopUpdateResponse> getResponseClass() {
        return ShopUpdateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("bulletin", this.bulletin);
        txtParams.put("desc", this.desc);
        txtParams.put("title", this.title);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setBulletin(String bulletin) {
        this.bulletin = bulletin;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
