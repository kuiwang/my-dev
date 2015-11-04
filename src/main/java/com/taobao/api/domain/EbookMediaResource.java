package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 电子书资源信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class EbookMediaResource extends TaobaoObject {

    private static final long serialVersionUID = 7292498224421727551L;

    /**
     * 文件资源状态（0:审核中 1：审核通过 2：审核不通过）
     */
    @ApiField("file_status")
    private Long fileStatus;

    /**
     * 文件资源后缀名
     */
    @ApiField("file_suffix")
    private String fileSuffix;

    /**
     * 资源文件的类型（1：正文，0：试读）
     */
    @ApiField("file_type")
    private Long fileType;

    /**
     * 文件审核不通过原因
     */
    @ApiField("reason")
    private String reason;

    public Long getFileStatus() {
        return this.fileStatus;
    }

    public void setFileStatus(Long fileStatus) {
        this.fileStatus = fileStatus;
    }

    public String getFileSuffix() {
        return this.fileSuffix;
    }

    public void setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
    }

    public Long getFileType() {
        return this.fileType;
    }

    public void setFileType(Long fileType) {
        this.fileType = fileType;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
