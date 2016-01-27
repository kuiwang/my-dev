package com.aliyun.api.rds.rds20140815.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.PerformanceKey;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: rds.aliyuncs.com.DescribeDBInstancePerformance.2014-08-15
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeDBInstancePerformanceResponse extends AliyunResponse {

    private static final long serialVersionUID = 3891822213328178926L;

    /**
     * 实例名
     */
    @ApiField("DBInstanceId")
    private String dBInstanceId;

    /**
     * 查询结束时间
     */
    @ApiField("EndTime")
    private String endTime;

    /**
     * 数据库类型
     */
    @ApiField("Engine")
    private String engine;

    /**
     * 性能参数列表
     */
    @ApiListField("PerformanceKeys")
    @ApiField("PerformanceKey")
    private List<PerformanceKey> performanceKeys;

    /**
     * 查询开始时间
     */
    @ApiField("StartTime")
    private String startTime;

    public String getdBInstanceId() {
        return this.dBInstanceId;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getEngine() {
        return this.engine;
    }

    public List<PerformanceKey> getPerformanceKeys() {
        return this.performanceKeys;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setdBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setPerformanceKeys(List<PerformanceKey> performanceKeys) {
        this.performanceKeys = performanceKeys;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

}
