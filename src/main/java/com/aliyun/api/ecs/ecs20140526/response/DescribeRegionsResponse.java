package com.aliyun.api.ecs.ecs20140526.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.Region;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeRegions.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeRegionsResponse extends AliyunResponse {

    private static final long serialVersionUID = 5139833691291141898L;

    /**
     * 地域信息组成的集合
     */
    @ApiListField("Regions")
    @ApiField("Region")
    private List<Region> regions;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public List<Region> getRegions() {
        return this.regions;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

}
