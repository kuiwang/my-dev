package com.scott.dev.taobao.api.item.domain;

import java.util.Date;

/*
 * 产品图片
 */
public class ProductImg {

    /*
     * 产品图片ID
     */
    private Number id;

    /*
     * 图片所属产品的ID
     */
    private Number productId;

    /*
     * 图片地址.(绝对地址,格式:http://host/image_path)
     */
    private String url;

    /*
     * 图片序号。产品里的图片展示顺序，数据越小越靠前。要求是正整数
     */
    private Number position;

    /*
     * 添加时间.格式:yyyy-mm-dd hh:mm:ss
     */
    private Date created;

    /*
     * 修改时间.格式:yyyy-mm-dd hh:mm:ss
     */
    private Date modified;

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public Number getProductId() {
        return productId;
    }

    public void setProductId(Number productId) {
        this.productId = productId;
    }

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

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}
