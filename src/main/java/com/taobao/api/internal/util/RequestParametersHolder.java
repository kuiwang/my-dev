package com.taobao.api.internal.util;

import java.util.HashMap;
import java.util.Map;

/**
 * API请求参数容器。
 * 
 * @author fengsheng
 * @since Sep 19, 2014
 */
public class RequestParametersHolder {

    private TaobaoHashMap applicationParams;

    private TaobaoHashMap protocalMustParams;

    private TaobaoHashMap protocalOptParams;

    private String requestUrl;

    private String responseBody;

    public Map<String, String> getAllParams() {
        Map<String, String> params = new HashMap<String, String>();
        if ((protocalMustParams != null) && !protocalMustParams.isEmpty()) {
            params.putAll(protocalMustParams);
        }
        if ((protocalOptParams != null) && !protocalOptParams.isEmpty()) {
            params.putAll(protocalOptParams);
        }
        if ((applicationParams != null) && !applicationParams.isEmpty()) {
            params.putAll(applicationParams);
        }
        return params;
    }

    public TaobaoHashMap getApplicationParams() {
        return this.applicationParams;
    }

    public TaobaoHashMap getProtocalMustParams() {
        return this.protocalMustParams;
    }

    public TaobaoHashMap getProtocalOptParams() {
        return this.protocalOptParams;
    }

    public String getRequestUrl() {
        return this.requestUrl;
    }

    public String getResponseBody() {
        return this.responseBody;
    }

    public void setApplicationParams(TaobaoHashMap applicationParams) {
        this.applicationParams = applicationParams;
    }

    public void setProtocalMustParams(TaobaoHashMap protocalMustParams) {
        this.protocalMustParams = protocalMustParams;
    }

    public void setProtocalOptParams(TaobaoHashMap protocalOptParams) {
        this.protocalOptParams = protocalOptParams;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

}
