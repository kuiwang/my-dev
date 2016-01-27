package com.scott.dev.taobao.api.multimedia.domain;

import java.util.Date;

/**
 * 图片
 */
public class Picture {

    /**
     * 图片上传的来源，有电脑版本宝贝发布，手机版本宝贝发布
     */
    private String clientType;

    /**
     * 图片的创建时间
     */
    private Date created;

    /**
     * 图片是否删除的标记
     */
    private String deleted;

    /**
     * 图片在后台处理之后的md5值 当md5值为32位长度的字符串时为图片搬家后的文件md5验证码 md5值为长整数时为图片替换后的时间戳
     */
    private String md5;

    /**
     * 图片的修改时间
     */
    private Date modified;

    /**
     * 图片分类ID
     */
    private Long pictureCategoryId;

    /**
     * 图片ID
     */
    private Long pictureId;

    /**
     * 返回的是绝对路径如：http://img07.taobaocdn.com/imgextra/i7/22670458/
     * T2dD0kXb4cXXXXXXXX_!!22670458.jpg
     */
    private String picturePath;

    /**
     * 图片相素,格式:长x宽，如450x150
     */
    private String pixel;

    /**
     * 图片是否被引用
     */
    private Boolean referenced;

    /**
     * 图片大小,bite单位
     */
    private Long sizes;

    /**
     * 图片状态,unfroze代表没有被冻结，froze代表被冻结,pass代表排查通过
     */
    private String status;

    /**
     * 图片标题
     */
    private String title;

    /**
     * 卖家ID
     */
    private Long uid;

    public String getClientType() {
        return this.clientType;
    }

    public Date getCreated() {
        return this.created;
    }

    public String getDeleted() {
        return this.deleted;
    }

    public String getMd5() {
        return this.md5;
    }

    public Date getModified() {
        return this.modified;
    }

    public Long getPictureCategoryId() {
        return this.pictureCategoryId;
    }

    public Long getPictureId() {
        return this.pictureId;
    }

    public String getPicturePath() {
        return this.picturePath;
    }

    public String getPixel() {
        return this.pixel;
    }

    public Boolean getReferenced() {
        return this.referenced;
    }

    public Long getSizes() {
        return this.sizes;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTitle() {
        return this.title;
    }

    public Long getUid() {
        return this.uid;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setPictureCategoryId(Long pictureCategoryId) {
        this.pictureCategoryId = pictureCategoryId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public void setPixel(String pixel) {
        this.pixel = pixel;
    }

    public void setReferenced(Boolean referenced) {
        this.referenced = referenced;
    }

    public void setSizes(Long sizes) {
        this.sizes = sizes;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

}
