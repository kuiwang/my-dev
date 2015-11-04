package com.scott.dev.taobao.api.item.domain;

import java.util.Date;

/*
 * ItemImg结构
 */
public class ItemImg {

    /*
     * 图片链接地址
     */
    private String url;

    /*
     * 图片放在第几张（多图时可设置）
     */
    private Number position;

    /*
     * 图片创建时间 时间格式：yyyy-MM-dd HH:mm:ss
     */
    private Date created;

    /*
     * 商品图片的id，和商品相对应（主图id默认为0）
     */
    private Number id;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }
}
