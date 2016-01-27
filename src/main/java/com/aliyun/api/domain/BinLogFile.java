package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * BinLogFile
 *
 * @author auto create
 * @since 1.0, null
 */
public class BinLogFile extends TaobaoObject {

    private static final long serialVersionUID = 2751643323656292227L;

    /**
     * 支持HTTP协议的下载链接URL，NULL表示没有下载链接
     */
    @ApiField("DownloadLink")
    private String downloadLink;

    /**
     * BINLOG文件大小，单位：Byte
     */
    @ApiField("FileSize")
    private Long fileSize;

    /**
     * URL过期时间，格式如：2011-06-11T15:00:00Z
     */
    @ApiField("LinkExpiredTime")
    private String linkExpiredTime;

    /**
     * BINLOG文件记录的开始时间
     */
    @ApiField("LogBeginTime")
    private String logBeginTime;

    /**
     * BINLOG文件记录的结束时间
     */
    @ApiField("LogEndTime")
    private String logEndTime;

    public String getDownloadLink() {
        return this.downloadLink;
    }

    public Long getFileSize() {
        return this.fileSize;
    }

    public String getLinkExpiredTime() {
        return this.linkExpiredTime;
    }

    public String getLogBeginTime() {
        return this.logBeginTime;
    }

    public String getLogEndTime() {
        return this.logEndTime;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public void setLinkExpiredTime(String linkExpiredTime) {
        this.linkExpiredTime = linkExpiredTime;
    }

    public void setLogBeginTime(String logBeginTime) {
        this.logBeginTime = logBeginTime;
    }

    public void setLogEndTime(String logEndTime) {
        this.logEndTime = logEndTime;
    }

}
