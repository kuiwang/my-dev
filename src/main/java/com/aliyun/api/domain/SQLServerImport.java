package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * SQLServerImport
 *
 * @author auto create
 * @since 1.0, null
 */
public class SQLServerImport extends TaobaoObject {

    private static final long serialVersionUID = 6153618225722815281L;

    /**
     * 导入的数据库名
     */
    @ApiField("DBName")
    private String dBName;

    /**
     * 文件名
     */
    @ApiField("FileName")
    private String fileName;

    /**
     * 迁移ID
     */
    @ApiField("ImportId")
    private Long importId;

    /**
     * 导入状态，取值： Pending:未开始， Importing:导入中， Success:导入成功， Failed:导入失败
     * Cancelled: 任务取消 迁移取消中
     */
    @ApiField("ImportStatus")
    private String importStatus;

    /**
     * "导入时间 格式：YYYY-MM-DD’T’HH:mm:ssZ，如2011-05-30 T12:11:40Z"
     */
    @ApiField("StartTime")
    private String startTime;

    public String getdBName() {
        return this.dBName;
    }

    public void setdBName(String dBName) {
        this.dBName = dBName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getImportId() {
        return this.importId;
    }

    public void setImportId(Long importId) {
        this.importId = importId;
    }

    public String getImportStatus() {
        return this.importStatus;
    }

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

}
