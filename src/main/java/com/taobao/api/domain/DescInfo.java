package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 卖家发布的商品图文详情信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class DescInfo extends TaobaoObject {

    private static final long serialVersionUID = 8417589147424978767L;

    /**
     * 卖家发布的商品图文详情信息内容
     */
    @ApiField("content")
    private String content;

    /**
     * 卖家发布的商品图文详情来源平台
     */
    @ApiField("type")
    private String type;

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
