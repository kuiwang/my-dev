package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.sp.service.site.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SpServiceSiteGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6725766414392554319L;

    /**
     * 返回站点信息的Json字符串
     */
    @ApiField("value")
    private String value;

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
