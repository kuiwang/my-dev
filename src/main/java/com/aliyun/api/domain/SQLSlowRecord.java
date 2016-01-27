package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * SQLSlowRecord
 *
 * @author auto create
 * @since 1.0, null
 */
public class SQLSlowRecord extends TaobaoObject {

    private static final long serialVersionUID = 1183326642648898441L;

    /**
     * DB名称
     */
    @ApiField("DBName")
    private String dBName;

    /**
     * 执行开始时间 格式：YYYY-MM-DD’T’HH:mm:ss Z，如2011-05-30 T12:11:20Z
     */
    @ApiField("ExecutionStartTime")
    private String executionStartTime;

    /**
     * 用户连接数据库的主机地址
     */
    @ApiField("HostAddress")
    private String hostAddress;

    /**
     * 锁定时长，单位：秒
     */
    @ApiField("LockTimes")
    private Long lockTimes;

    /**
     * 解析行数
     */
    @ApiField("ParseRowCounts")
    private Long parseRowCounts;

    /**
     * 执行时长，单位：秒
     */
    @ApiField("QueryTimes")
    private Long queryTimes;

    /**
     * 返回行数
     */
    @ApiField("ReturnRowCounts")
    private Long returnRowCounts;

    /**
     * 查询语句
     */
    @ApiField("SQLText")
    private String sQLText;

    public String getdBName() {
        return this.dBName;
    }

    public String getExecutionStartTime() {
        return this.executionStartTime;
    }

    public String getHostAddress() {
        return this.hostAddress;
    }

    public Long getLockTimes() {
        return this.lockTimes;
    }

    public Long getParseRowCounts() {
        return this.parseRowCounts;
    }

    public Long getQueryTimes() {
        return this.queryTimes;
    }

    public Long getReturnRowCounts() {
        return this.returnRowCounts;
    }

    public String getsQLText() {
        return this.sQLText;
    }

    public void setdBName(String dBName) {
        this.dBName = dBName;
    }

    public void setExecutionStartTime(String executionStartTime) {
        this.executionStartTime = executionStartTime;
    }

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    public void setLockTimes(Long lockTimes) {
        this.lockTimes = lockTimes;
    }

    public void setParseRowCounts(Long parseRowCounts) {
        this.parseRowCounts = parseRowCounts;
    }

    public void setQueryTimes(Long queryTimes) {
        this.queryTimes = queryTimes;
    }

    public void setReturnRowCounts(Long returnRowCounts) {
        this.returnRowCounts = returnRowCounts;
    }

    public void setsQLText(String sQLText) {
        this.sQLText = sQLText;
    }

}
