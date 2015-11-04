package com.scott.dev.taobao.api.multimedia.domain;

import java.util.Date;

/**
 * 图片分类
 */
public class PictureCategory {

    /**
     * 图片类目的创建时间
     */
    private Date created;

    /**
     * 图片分类的修改时间
     */
    private Date modified;

    /**
     * 一级分类的parent_id为0 二级分类的则为其父分类的picture_category_id
     */
    private Long parentId;

    /**
     * 图片分类ID
     */
    private Long pictureCategoryId;

    /**
     * 图片分类名
     */
    private String pictureCategoryName;

    /**
     * 图片分类排序
     */
    private Long position;

    /**
     * 图片分类型别，sys-fixture代表店铺装修分类(系统分类)，sys-auction代表宝贝图片分类(系统分类)，user-
     * define代表用户自定义分类
     */
    private String type;

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getPictureCategoryId() {
        return this.pictureCategoryId;
    }

    public void setPictureCategoryId(Long pictureCategoryId) {
        this.pictureCategoryId = pictureCategoryId;
    }

    public String getPictureCategoryName() {
        return this.pictureCategoryName;
    }

    public void setPictureCategoryName(String pictureCategoryName) {
        this.pictureCategoryName = pictureCategoryName;
    }

    public Long getPosition() {
        return this.position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
