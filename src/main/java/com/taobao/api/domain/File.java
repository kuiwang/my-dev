package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 多媒体平台文件，包括文件的一些基本信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class File extends TaobaoObject {

    private static final long serialVersionUID = 2245694223535739737L;

    /**
     * 申请cdn资源的分配的userId
     */
    @ApiField("cdn_user_id")
    private Long cdnUserId;

    /**
     * 文件是否删除
     */
    @ApiField("deleted")
    private String deleted;

    /**
     * 该文件所属目录的目录编号
     */
    @ApiField("dir_id")
    private Long dirId;

    /**
     * 文件在多媒体平台的编号
     */
    @ApiField("file_id")
    private Long fileId;

    /**
     * 返回的是绝对路径如：http://img07.taobaocdn.com/imgextra/i7/22670458/
     * T2dD0kXb4cXXXXXXXX_!!22670458.jpg
     */
    @ApiField("file_path")
    private String filePath;

    /**
     * 创建时间
     */
    @ApiField("gmt_create")
    private Date gmtCreate;

    /**
     * 修改时间
     */
    @ApiField("gmt_modified")
    private Date gmtModified;

    /**
     * 文件内容修改时间
     */
    @ApiField("modified")
    private Date modified;

    /**
     * 文件在多媒体平台的文件名称
     */
    @ApiField("name")
    private String name;

    /**
     * 图片像素，如果非图片，该值为空
     */
    @ApiField("picture_pix")
    private String picturePix;

    /**
     * 文件的大小
     */
    @ApiField("size")
    private Long size;

    /**
     * 图片状态,unfroze代表没有被冻结，froze代表被冻结,pass代表排查通过
     */
    @ApiField("status")
    private String status;

    public Long getCdnUserId() {
        return this.cdnUserId;
    }

    public void setCdnUserId(Long cdnUserId) {
        this.cdnUserId = cdnUserId;
    }

    public String getDeleted() {
        return this.deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public Long getDirId() {
        return this.dirId;
    }

    public void setDirId(Long dirId) {
        this.dirId = dirId;
    }

    public Long getFileId() {
        return this.fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return this.gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicturePix() {
        return this.picturePix;
    }

    public void setPicturePix(String picturePix) {
        this.picturePix = picturePix;
    }

    public Long getSize() {
        return this.size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
