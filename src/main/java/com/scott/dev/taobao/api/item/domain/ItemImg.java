package com.scott.dev.taobao.api.item.domain;

import java.util.Date;

/*
 * ItemImg结构
 */
public class ItemImg {

    /*
     * 图片创建时间 时间格式：yyyy-MM-dd HH:mm:ss
     */
    private Date created;

    /*
     * 商品图片的id，和商品相对应（主图id默认为0）
     */
    private Number id;

    /*
     * 图片放在第几张（多图时可设置）
     */
    private Number position;

    /*
     * 图片链接地址
     */
    private String url;

    public Date getCreated() {
        return created;
    }

    public Number getId() {
        return id;
    }

    public Number getPosition() {
        return position;
    }

    public String getUrl() {
        return url;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public void setPosition(Number position) {
        this.position = position;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
