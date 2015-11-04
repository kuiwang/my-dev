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
     * 图片对应的url
     */
    private String imageUrl;

    /*
     * 图片顺序
     */
    private Number imagePosition;

    /*
     * 图片类型（PRODUCT：产品图片 EXTPRODUCT：产品辅图 PROPERTIES：产品属性图片 ）
     */
    private String type;

    /*
     * 当图片类型为属性图片时，表示图片对应的属性pv对
     */
    private String properties;

    public Number getImageId() {
        return imageId;
    }

    public void setImageId(Number imageId) {
        this.imageId = imageId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Number getImagePosition() {
        return imagePosition;
    }

    public void setImagePosition(Number imagePosition) {
        this.imagePosition = imagePosition;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }
}
