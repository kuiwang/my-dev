package com.aliyun.api.rds.rds20140815.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.TemplateRecord;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: rds.aliyuncs.com.DescribeParameterTemplates.2014-08-15
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeParameterTemplatesResponse extends AliyunResponse {

    private static final long serialVersionUID = 3442282297395715379L;

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
     * 参数个数
     */
    @ApiField("ParameterCount")
    private Long parameterCount;

    /**
     * Parameters列表
     */
    @ApiListField("Parameters")
    @ApiField("TemplateRecord")
    private List<TemplateRecord> parameters;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

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

    public void setParameterCount(Long parameterCount) {
        this.parameterCount = parameterCount;
    }

    public Long getParameterCount() {
        return this.parameterCount;
    }

    public void setParameters(List<TemplateRecord> parameters) {
        this.parameters = parameters;
    }

    public List<TemplateRecord> getParameters() {
        return this.parameters;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

}
