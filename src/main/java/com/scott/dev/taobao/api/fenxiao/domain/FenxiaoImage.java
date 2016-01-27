package com.scott.dev.taobao.api.fenxiao.domain;

/*
 * 产品的各种图片信息
 */
public class FenxiaoImage {

    /*
     *图片id
     */
    private Number imageId;

    /*
     * 图片顺序
     */
    private Number imagePosition;

    /*
     * 图片对应的url
     */
    private String imageUrl;

    /*
     * 当图片类型为属性图片时，表示图片对应的属性pv对
     */
    private String properties;

    /*
     * 图片类型（PRODUCT：产品图片 EXTPRODUCT：产品辅图 PROPERTIES：产品属性图片 ）
     */
    private String type;

    public Number getImageId() {
        return imageId;
    }

    public Number getImagePosition() {
        return imagePosition;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getProperties() {
        return properties;
    }

    public String getType() {
        return type;
    }

    public void setImageId(Number imageId) {
        this.imageId = imageId;
    }

    public void setImagePosition(Number imagePosition) {
        this.imagePosition = imagePosition;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public void setType(String type) {
        this.type = type;
    }
}
