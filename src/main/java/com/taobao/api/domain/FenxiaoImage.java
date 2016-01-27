package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 产品的各种图片信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoImage extends TaobaoObject {

    private static final long serialVersionUID = 4842485296822295838L;

    /**
     * 图片id
     */
    @ApiField("image_id")
    private Long imageId;

    /**
     * 图片顺序
     */
    @ApiField("image_position")
    private Long imagePosition;

    /**
     * 图片对应的url
     */
    @ApiField("image_url")
    private String imageUrl;

    /**
     * 当图片类型为属性图片时，表示图片对应的属性pv对。
     */
    @ApiField("properties")
    private String properties;

    /**
     * 图片类型（PRODUCT：产品图片 EXTPRODUCT：产品辅图 PROPERTIES：产品属性图片 ）
     */
    @ApiField("type")
    private String type;

    public Long getImageId() {
        return this.imageId;
    }

    public Long getImagePosition() {
        return this.imagePosition;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getProperties() {
        return this.properties;
    }

    public String getType() {
        return this.type;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public void setImagePosition(Long imagePosition) {
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
