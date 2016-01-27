package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * SQLSlowLog
 *
 * @author auto create
 * @since 1.0, null
 */
public class SQLSlowLog extends TaobaoObject {

    private static final long serialVersionUID = 4285953626926563129L;

    /**
     * 数据生成日期 格式："yyyy-MM-ddZ"，如2011-05-30Z
     */
    @ApiField("CreateTime")
    private String createTime;

    /**
     * DB名称
     */
    @ApiField("DBName")
    private String dBName;

    /**
     * 锁定最大时长，单位：秒
     */
    @ApiField("MaxLockTime")
    private Long maxLockTime;

    /**
     * 执行总次数
     */
    @ApiField("MySQLTotalExecutionCounts")
    private Long mySQLTotalExecutionCounts;

    /**
     * 执行总时长，单位：秒
     */
    @ApiField("MySQLTotalExecutionTimes")
    private Long mySQLTotalExecutionTimes;

    /**
     * 解析最大行数
     */
    @ApiField("ParseMaxRowCount")
    private Long parseMaxRowCount;

    /**
     * 解析总行数
     */
    @ApiField("ParseTotalRowCounts")
    private Long parseTotalRowCounts;

    /**
     * 数据报表生成日期 格式："yyyy-MM-ddZ"，如2011-05-30Z
     */
    @ApiField("ReportTime")
    private String reportTime;

    /**
     * 返回最大行数
     */
    @ApiField("ReturnMaxRowCount")
    private Long returnMaxRowCount;

    /**
     * 返回总行数
     */
    @ApiField("ReturnTotalRowCounts")
    private Long returnTotalRowCounts;

    /**
     * 总执行次数
     */
    @ApiField("SQLServerTotalExecutionCounts")
    private Long sQLServerTotalExecutionCounts;

    /**
     * 总执行时间，单位：毫秒
     */
    @ApiField("SQLServerTotalExecutionTimes")
    private Long sQLServerTotalExecutionTimes;

    /**
     * 查询语句
     */
    @ApiField("SQLText")
    private String sQLText;

    /**
     * 锁定总时长，单位：秒
     */
    @ApiField("TotalLockTimes")
    private Long totalLockTimes;

    /**
     * 总逻辑读
     */
    @ApiField("TotalLogicalReadCounts")
    private Long totalLogicalReadCounts;

    /**
     * 总物理读
     */
    @ApiField("TotalPhysicalReadCounts")
    private Long totalPhysicalReadCounts;

    public String getCreateTime() {
        return this.createTime;
    }

    public String getdBName() {
        return this.dBName;
    }

    public Long getMaxLockTime() {
        return this.maxLockTime;
    }

    public Long getMySQLTotalExecutionCounts() {
        return this.mySQLTotalExecutionCounts;
    }

    public Long getMySQLTotalExecutionTimes() {
        return this.mySQLTotalExecutionTimes;
    }

    public Long getParseMaxRowCount() {
        return this.parseMaxRowCount;
    }

    public Long getParseTotalRowCounts() {
        return this.parseTotalRowCounts;
    }

    public String getReportTime() {
        return this.reportTime;
    }

    public Long getReturnMaxRowCount() {
        return this.returnMaxRowCount;
    }

    public Long getReturnTotalRowCounts() {
        return this.returnTotalRowCounts;
    }

    public Long getsQLServerTotalExecutionCounts() {
        return this.sQLServerTotalExecutionCounts;
    }

    public Long getsQLServerTotalExecutionTimes() {
        return this.sQLServerTotalExecutionTimes;
    }

    public String getsQLText() {
        return this.sQLText;
    }

    public Long getTotalLockTimes() {
        return this.totalLockTimes;
    }

    public Long getTotalLogicalReadCounts() {
        return this.totalLogicalReadCounts;
    }

    public Long getTotalPhysicalReadCounts() {
        return this.totalPhysicalReadCounts;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setdBName(String dBName) {
        this.dBName = dBName;
    }

    public void setMaxLockTime(Long maxLockTime) {
        this.maxLockTime = maxLockTime;
    }

    public void setMySQLTotalExecutionCounts(Long mySQLTotalExecutionCounts) {
        this.mySQLTotalExecutionCounts = mySQLTotalExecutionCounts;
    }

    public void setMySQLTotalExecutionTimes(Long mySQLTotalExecutionTimes) {
        this.mySQLTotalExecutionTimes = mySQLTotalExecutionTimes;
    }

    public void setParseMaxRowCount(Long parseMaxRowCount) {
        this.parseMaxRowCount = parseMaxRowCount;
    }

    public void setParseTotalRowCounts(Long parseTotalRowCounts) {
        this.parseTotalRowCounts = parseTotalRowCounts;
    }

    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }

    public void setReturnMaxRowCount(Long returnMaxRowCount) {
        this.returnMaxRowCount = returnMaxRowCount;
    }

    public void setReturnTotalRowCounts(Long returnTotalRowCounts) {
        this.returnTotalRowCounts = returnTotalRowCounts;
    }

    public void setsQLServerTotalExecutionCounts(Long sQLServerTotalExecutionCounts) {
        this.sQLServerTotalExecutionCounts = sQLServerTotalExecutionCounts;
    }

    public void setsQLServerTotalExecutionTimes(Long sQLServerTotalExecutionTimes) {
        this.sQLServerTotalExecutionTimes = sQLServerTotalExecutionTimes;
    }

    public void setsQLText(String sQLText) {
        this.sQLText = sQLText;
    }

    public void setTotalLockTimes(Long totalLockTimes) {
        this.totalLockTimes = totalLockTimes;
    }

    public void setTotalLogicalReadCounts(Long totalLogicalReadCounts) {
        this.totalLogicalReadCounts = totalLogicalReadCounts;
    }

    public void setTotalPhysicalReadCounts(Long totalPhysicalReadCounts) {
        this.totalPhysicalReadCounts = totalPhysicalReadCounts;
    }

}
