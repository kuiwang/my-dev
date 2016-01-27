package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * feed的内容区域，可以是封面，也可以是内容
 *
 * @author auto create
 * @since 1.0, null
 */
public class FeedTile extends TaobaoObject {

    private static final long serialVersionUID = 6239263141295957714L;

    /**
     * type=pic或cover时，返回的图片地址
     */
    @ApiField("path")
    private String path;

    /**
     * type=cover或type=pic时有效，指图片高度
     */
    @ApiField("pic_height")
    private Long picHeight;

    /**
     * type=cover或type=pic时有效，指图片宽度
     */
    @ApiField("pic_width")
    private Long picWidth;

    /**
     * type=cover时有效，0时，feed的title不压封面 1时feed的title压封面
     */
    @ApiField("template")
    private Long template;

    /**
     * type=text时，此内容有值
     */
    @ApiField("text")
    private String text;

    /**
     * feed tile的类型，可以为：cover, pic, text, picItem
     */
    @ApiField("type")
    private String type;

    public String getPath() {
        return this.path;
    }

    public Long getPicHeight() {
        return this.picHeight;
    }

    public Long getPicWidth() {
        return this.picWidth;
    }

    public Long getTemplate() {
        return this.template;
    }

    public String getText() {
        return this.text;
    }

    public String getType() {
        return this.type;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setPicHeight(Long picHeight) {
        this.picHeight = picHeight;
    }

    public void setPicWidth(Long picWidth) {
        this.picWidth = picWidth;
    }

    public void setTemplate(Long template) {
        this.template = template;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setType(String type) {
        this.type = type;
    }

}
