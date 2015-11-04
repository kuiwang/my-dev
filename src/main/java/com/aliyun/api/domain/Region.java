package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * Region
 *
 * @author auto create
 * @since 1.0, null
 */
public class Region extends TaobaoObject {

    private static final long serialVersionUID = 5443196445796838951L;

    /**
     * 地域名称
     */
    @ApiField("LocalName")
    private String localName;

    /**
     * 地域Id
     */
    @ApiField("RegionId")
    private String regionId;

    public String getLocalName() {
        return this.localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

}
