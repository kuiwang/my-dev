package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 资源类型
 *
 * @author auto create
 * @since 1.0, null
 */
public class ResourceTypes extends TaobaoObject {

    private static final long serialVersionUID = 6865372785286738761L;

    /**
     * 资源类型
     */
    @ApiField("ResourceTypes")
    private String resourceTypes;

    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public void setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

}
