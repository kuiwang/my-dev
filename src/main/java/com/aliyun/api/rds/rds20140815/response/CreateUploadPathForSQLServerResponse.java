package com.aliyun.api.rds.rds20140815.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: rds.aliyuncs.com.CreateUploadPathForSQLServer.2014-08-15
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CreateUploadPathForSQLServerResponse extends AliyunResponse {

    private static final long serialVersionUID = 5894456886421265775L;

    /**
     * 文件名，带扩展名
     */
    @ApiField("FileName")
    private String fileName;

    /**
     * 外网文件服务器
     */
    @ApiField("InternetFtpServer")
    private String internetFtpServer;

    /**
     * 外网文件服务器端口
     */
    @ApiField("InternetPort")
    private String internetPort;

    /**
     * 内网服务器地址
     */
    @ApiField("IntranetFtpserver")
    private String intranetFtpserver;

    /**
     * 内网服务器端口
     */
    @ApiField("Intranetport")
    private String intranetport;

    /**
     * 文件服务器帐号密码
     */
    @ApiField("Password")
    private String password;

    /**
     * 请求id
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 文件服务器帐号
     */
    @ApiField("UserName")
    private String userName;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setInternetFtpServer(String internetFtpServer) {
        this.internetFtpServer = internetFtpServer;
    }

    public String getInternetFtpServer() {
        return this.internetFtpServer;
    }

    public void setInternetPort(String internetPort) {
        this.internetPort = internetPort;
    }

    public String getInternetPort() {
        return this.internetPort;
    }

    public void setIntranetFtpserver(String intranetFtpserver) {
        this.intranetFtpserver = intranetFtpserver;
    }

    public String getIntranetFtpserver() {
        return this.intranetFtpserver;
    }

    public void setIntranetport(String intranetport) {
        this.intranetport = intranetport;
    }

    public String getIntranetport() {
        return this.intranetport;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

}
