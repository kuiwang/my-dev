package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.fuwu.sale.link.gen response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FuwuSaleLinkGenResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2371782486888113923L;

    /**
     * 通过营销链接接口生成的营销链接短地址
     */
    @ApiField("url")
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

}
