package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 查看数据文件列表对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class SQLServerUploadFile extends TaobaoObject {

    private static final long serialVersionUID = 6675688161834525363L;

    /**
     * FTP文件生成时间 格式：YYYY-MM-DD’T’HH:mm:ssZ，如2011-05-30 T12:11:4Z
     */
    @ApiField("CreationTime")
    private String creationTime;

    /**
     * 数据库名
     */
    @ApiField("DBName")
    private String dBName;

    /**
     * 数据文件名，带扩展名
     */
    @ApiField("FileName")
    private String fileName;

    /**
     * 数据文件大小，单位：Byte
     */
    @ApiField("FileSize")
    private Long fileSize;

    /**
     * 文件状态， Unavailable：不可用 Available:可用 对应6种情况，需要拿底层的数字对应成英文
     * 未开始：NotStarted 长在上传：Uploading 上传失败：UploadFailed 有病毒：Virus
     * 文件被删除：Deleted 上传成功：Success 7月28日之前返回中文
     */
    @ApiField("FileStatus")
    private String fileStatus;

    /**
     * 文件服务器
     */
    @ApiField("InternetFtpServer")
    private String internetFtpServer;

    /**
     * 文件服务器端口
     */
    @ApiField("InternetPort")
    private Long internetPort;

    /**
     * 内网服务器地址
     */
    @ApiField("IntranetFtpserver")
    private String intranetFtpserver;

    /**
     * 内网服务器端口
     */
    @ApiField("Intranetport")
    private Long intranetport;

    /**
     * 文件服务器账号密码
     */
    @ApiField("Password")
    private String password;

    /**
     * 文件服务器账号
     */
    @ApiField("UserName")
    private String userName;

    public String getCreationTime() {
        return this.creationTime;
    }

    public String getdBName() {
        return this.dBName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public Long getFileSize() {
        return this.fileSize;
    }

    public String getFileStatus() {
        return this.fileStatus;
    }

    public String getInternetFtpServer() {
        return this.internetFtpServer;
    }

    public Long getInternetPort() {
        return this.internetPort;
    }

    public String getIntranetFtpserver() {
        return this.intranetFtpserver;
    }

    public Long getIntranetport() {
        return this.intranetport;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public void setdBName(String dBName) {
        this.dBName = dBName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public void setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
    }

    public void setInternetFtpServer(String internetFtpServer) {
        this.internetFtpServer = internetFtpServer;
    }

    public void setInternetPort(Long internetPort) {
        this.internetPort = internetPort;
    }

    public void setIntranetFtpserver(String intranetFtpserver) {
        this.intranetFtpserver = intranetFtpserver;
    }

    public void setIntranetport(Long intranetport) {
        this.intranetport = intranetport;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
