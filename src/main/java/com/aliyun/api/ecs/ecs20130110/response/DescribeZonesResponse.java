package com.aliyun.api.ecs.ecs20130110.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.Zone;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeZones.2013-01-10 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeZonesResponse extends AliyunResponse {

    private static final long serialVersionUID = 2837625356711347289L;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 可用区域列表
     */
    @ApiListField("Zones")
    @ApiField("Zone")
    private List<Zone> zones;

    public String getRequestId() {
        return this.requestId;
    }

    public List<Zone> getZones() {
        return this.zones;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setZones(List<Zone> zones) {
        this.zones = zones;
    }

}
