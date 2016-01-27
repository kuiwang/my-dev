package com.scott.dev.taobao.api.multimedia.domain;

import java.util.Date;

/**
 * 多媒体平台文件，包括文件的一些基本信息
 */
public class File {

    /**
     * 申请cdn资源的分配的userId
     */
    private Long cdnUserId;

    /**
     * 文件是否删除
     */
    private String deleted;

    /**
     * 该文件所属目录的目录编号
     */
    private Long dirId;

    /**
     * 文件在多媒体平台的编号
     */
    private Long fileId;

    /**
     * 返回的是绝对路径如：http://img07.taobaocdn.com/imgextra/i7/22670458/
     * T2dD0kXb4cXXXXXXXX_!!22670458.jpg
     */
    private String filePath;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 文件内容修改时间
     */
    private Date modified;

    /**
     * 文件在多媒体平台的文件名称
     */
    private String name;

    /**
     * 图片像素，如果非图片，该值为空
     */
    private String picturePix;

    /**
     * 文件的大小
     */
    private Long size;

    /**
     * 图片状态,unfroze代表没有被冻结，froze代表被冻结,pass代表排查通过
     */
    private String status;

    public Long getCdnUserId() {
        return this.cdnUserId;
    }

    public String getDeleted() {
        return this.deleted;
    }

    public Long getDirId() {
        return this.dirId;
    }

    public Long getFileId() {
        return this.fileId;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public Date getGmtModified() {
        return this.gmtModified;
    }

    public Date getModified() {
        return this.modified;
    }

    public String getName() {
        return this.name;
    }

    public String getPicturePix() {
        return this.picturePix;
    }

    public Long getSize() {
        return this.size;
    }

    public String getStatus() {
        return this.status;
    }

    public void setCdnUserId(Long cdnUserId) {
        this.cdnUserId = cdnUserId;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public void setDirId(Long dirId) {
        this.dirId = dirId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPicturePix(String picturePix) {
        this.picturePix = picturePix;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
