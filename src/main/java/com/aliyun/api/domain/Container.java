package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 容器
 *
 * @author auto create
 * @since 1.0, null
 */
public class Container extends TaobaoObject {

    private static final long serialVersionUID = 2586634616621447886L;

    /**
     * 容器格式，范围flv|mp4|ts(m3u8)
     */
    @ApiField("Format")
    private String format;

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

}
