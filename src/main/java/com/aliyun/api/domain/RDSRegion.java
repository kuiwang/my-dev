package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * RDSRegion
 *
 * @author auto create
 * @since 1.0, null
 */
public class RDSRegion extends TaobaoObject {

    private static final long serialVersionUID = 1158455617231531176L;

    /**
     * Region编号。
     */
    @ApiField("RegionId")
    private String regionId;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

}
