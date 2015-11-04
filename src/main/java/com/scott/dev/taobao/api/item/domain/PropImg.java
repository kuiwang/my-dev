package com.scott.dev.taobao.api.item.domain;

import java.util.Date;

/*
 * 商品属性图片结构
 */
public class PropImg {

    /*
     * 属性图片的id，和商品相对应
     */
    private Number id;

    /*
     * 图片链接地址
     */
    private String url;

    /*
     * 图片所对应的属性组合的字符串
     */
    private String properties;

    /*
     * 图片放在第几张（多图时可设置）
     */
    private Number position;

    /*
     * 图片创建时间 时间格式：yyyy-MM-dd HH:mm:ss
     */
    private Date created;

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public Number getPosition() {
        return position;
    }

    public void setPosition(Number position) {
        this.position = position;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
