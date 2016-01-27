package com.scott.dev.taobao.api.tae.domain;

/**
 * 卖家发布的商品图文详情信息
 */
public class DescInfo {

    /**
     * 卖家发布的商品图文详情信息内容
     */
    private String content;

    /**
     * 卖家发布的商品图文详情来源平台
     */
    private String type;

    public String getContent() {
        return this.content;
    }

    public String getType() {
        return this.type;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setType(String type) {
        this.type = type;
    }

}
