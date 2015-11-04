package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WeitaoMenuCreateResponse;

/**
 * TOP API: taobao.weitao.menu.create request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:49
 */
public class WeitaoMenuCreateRequest implements TaobaoRequest<WeitaoMenuCreateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 支持的type共4种，宝贝分类、h5 url、wangwang和tel，具体见示例：[{ "name": "宝贝分类",
     * "sub_button": [ { "name": "新品", "type": "shopCat", "catId": "111111"
     * }, { "name": "特惠宝贝", "type": "shopCat", "catId": "213214" }, {
     * "name": "特惠宝贝", "type": "shopCat", "catId": "21342435" }] }, {
     * "name": "活动", "sub_button": [ { "name": "我的微官网", "type": "view",
     * "url": "http://mweb.taobao.com" }, {"name": "我的特惠品", "type": "view"
     * ,"url": "http://mpromotion.taobao.com" }, { "name": "我的活动", "type":
     * "view", "url":
     * "http://test.we.app.jae.m.taobao.com?seller_nick=test&seller_id=123124"
     * }] }, { "name": "客服", "sub_button": [ { "name": "客服", "type":
     * "wangwang", "wangwang": "商家测试帐号xx" }, {{ "name": "电话", "type":
     * "tel", "tel": "66668888" }] }]
     */
    private String menuString;

    public void setMenuString(String menuString) {
        this.menuString = menuString;
    }

    public String getMenuString() {
        return this.menuString;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.weitao.menu.create";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("menu_string", this.menuString);
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

    public Class<WeitaoMenuCreateResponse> getResponseClass() {
        return WeitaoMenuCreateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(menuString, "menuString");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
