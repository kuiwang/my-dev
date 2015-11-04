package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlibabaLaiwangPpMenuAddResponse;

/**
 * TOP API: alibaba.laiwang.pp.menu.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:50
 */
public class AlibabaLaiwangPpMenuAddRequest implements
        TaobaoRequest<AlibabaLaiwangPpMenuAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 菜单的定义,将定义转换成对应的json格式传入。
     */
    private String menudef;

    public void setMenudef(String menudef) {
        this.menudef = menudef;
    }

    public String getMenudef() {
        return this.menudef;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "alibaba.laiwang.pp.menu.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("menudef", this.menudef);
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

    public Class<AlibabaLaiwangPpMenuAddResponse> getResponseClass() {
        return AlibabaLaiwangPpMenuAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(menudef, "menudef");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
