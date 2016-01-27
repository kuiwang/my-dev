package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * SQLRecord
 *
 * @author auto create
 * @since 1.0, null
 */
public class SQLRecord extends TaobaoObject {

    private static final long serialVersionUID = 2479468431315522464L;

    /**
     * 帐号名
     */
    @ApiField("AccountName")
    private String accountName;

    /**
     * 数据库
     */
    @ApiField("DBName")
    private String dBName;

    /**
     * 执行时间 格式：yyyy-MM-dd’T’HH:mm:ss Z，如2011-05-30 T12:11:20Z
     */
    @ApiField("ExecuteTime")
    private String executeTime;

    /**
     * 客户端IP地址
     */
    @ApiField("HostAddress")
    private String hostAddress;

    /**
     * 返回记录数
     */
    @ApiField("ReturnRowCounts")
    private Long returnRowCounts;

    /**
     * SQL语句
     */
    @ApiField("SQLText")
    private String sQLText;

    /**
     * 消耗时间，单位：微秒
     */
    @ApiField("TotalExecutionTimes")
    private Long totalExecutionTimes;

    public String getAccountName() {
        return this.accountName;
    }

    public String getdBName() {
        return this.dBName;
    }

    public String getExecuteTime() {
        return this.executeTime;
    }

    public String getHostAddress() {
        return this.hostAddress;
    }

    public Long getReturnRowCounts() {
        return this.returnRowCounts;
    }

    public String getsQLText() {
        return this.sQLText;
    }

    public Long getTotalExecutionTimes() {
        return this.totalExecutionTimes;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setdBName(String dBName) {
        this.dBName = dBName;
    }

    public void setExecuteTime(String executeTime) {
        this.executeTime = executeTime;
    }

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    public void setReturnRowCounts(Long returnRowCounts) {
        this.returnRowCounts = returnRowCounts;
    }

    public void setsQLText(String sQLText) {
        this.sQLText = sQLText;
    }

    public void setTotalExecutionTimes(Long totalExecutionTimes) {
        this.totalExecutionTimes = totalExecutionTimes;
    }

}
