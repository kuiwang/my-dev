package com.aliyun.api.rds.rds20140815.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.RDSRegion;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: rds.aliyuncs.com.DescribeRegions.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeRegionsResponse extends AliyunResponse {

    private static final long serialVersionUID = 1497579956528286714L;

    /**
     * Region列表
     */
    @ApiListField("Regions")
    @ApiField("RDSRegion")
    private List<RDSRegion> regions;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    public void setRegions(List<RDSRegion> regions) {
        this.regions = regions;
    }

    public List<RDSRegion> getRegions() {
        return this.regions;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

}
