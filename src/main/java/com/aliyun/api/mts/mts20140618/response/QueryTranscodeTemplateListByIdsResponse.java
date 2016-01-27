package com.aliyun.api.mts.mts20140618.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.TranscodeTemplate;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: mts.aliyuncs.com.QueryTranscodeTemplateListByIds.2014-06-18
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class QueryTranscodeTemplateListByIdsResponse extends AliyunResponse {

    private static final long serialVersionUID = 1265919886538962727L;

    /**
     * 不存在的模板ID列表
     */
    @ApiListField("NonExistTids")
    @ApiField("String")
    private List<String> nonExistTids;

    /**
     * 不属于用户的模板ID列表
     */
    @ApiListField("PermissionDeniedTids")
    @ApiField("String")
    private List<String> permissionDeniedTids;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 批量查询转码模板返回的转码模板信息
     */
    @ApiListField("TranscodeTemplates")
    @ApiField("TranscodeTemplate")
    private List<TranscodeTemplate> transcodeTemplates;

    public List<String> getNonExistTids() {
        return this.nonExistTids;
    }

    public List<String> getPermissionDeniedTids() {
        return this.permissionDeniedTids;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public List<TranscodeTemplate> getTranscodeTemplates() {
        return this.transcodeTemplates;
    }

    public void setNonExistTids(List<String> nonExistTids) {
        this.nonExistTids = nonExistTids;
    }

    public void setPermissionDeniedTids(List<String> permissionDeniedTids) {
        this.permissionDeniedTids = permissionDeniedTids;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setTranscodeTemplates(List<TranscodeTemplate> transcodeTemplates) {
        this.transcodeTemplates = transcodeTemplates;
    }

}
