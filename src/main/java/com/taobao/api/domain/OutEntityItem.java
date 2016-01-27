package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 外部商品实体
 *
 * @author auto create
 * @since 1.0, null
 */
public class OutEntityItem extends TaobaoObject {

    private static final long serialVersionUID = 7862191546316622198L;

    /**
     * entity_type对应的实体类型的id： 当entity_type为IC_ITEM时，entity_id为ic的商品id
     */
    @ApiField("entity_id")
    private String entityId;

    /**
     * 外部实体类型： IC_ITEM--ic商品 IC_SKU--ic销售单元
     */
    @ApiField("entity_type")
    private String entityType;

    public String getEntityId() {
        return this.entityId;
    }

    public String getEntityType() {
        return this.entityType;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

}
