package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * url列表
 *
 * @author auto create
 * @since 1.0, null
 */
public class UrlList extends TaobaoObject {

    private static final long serialVersionUID = 1517653242397459118L;

    /**
     * url列表
     */
    @ApiField("url")
    private String url;

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
