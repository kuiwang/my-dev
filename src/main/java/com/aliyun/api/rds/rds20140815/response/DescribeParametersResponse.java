package com.aliyun.api.rds.rds20140815.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.DBInstanceParameter;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: rds.aliyuncs.com.DescribeParameters.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeParametersResponse extends AliyunResponse {

    private static final long serialVersionUID = 7695391685988915613L;

    /**
     * 正在同步的参数列表
     */
    @ApiListField("ConfigParameters")
    @ApiField("DBInstanceParameter")
    private List<DBInstanceParameter> configParameters;

    /**
     * 数据库类型
     */
    @ApiField("Engine")
    private String engine;

    /**
     * 数据库版本号
     */
    @ApiField("EngineVersion")
    private String engineVersion;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 当前运行的参数列表
     */
    @ApiListField("RunningParameters")
    @ApiField("DBInstanceParameter")
    private List<DBInstanceParameter> runningParameters;

    public void setConfigParameters(List<DBInstanceParameter> configParameters) {
        this.configParameters = configParameters;
    }

    public List<DBInstanceParameter> getConfigParameters() {
        return this.configParameters;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public String getEngineVersion() {
        return this.engineVersion;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setRunningParameters(List<DBInstanceParameter> runningParameters) {
        this.runningParameters = runningParameters;
    }

    public List<DBInstanceParameter> getRunningParameters() {
        return this.runningParameters;
    }

}
