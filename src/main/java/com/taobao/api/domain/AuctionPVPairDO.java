package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * sku中所包含的属性对
 *
 * @author auto create
 * @since 1.0, null
 */
public class AuctionPVPairDO extends TaobaoObject {

    private static final long serialVersionUID = 5417268795331793188L;

    /**
     * 类目销售属性id
     */
    @ApiField("property_id")
    private Long propertyId;

    /**
     * 类目属性名称
     */
    @ApiField("property_text")
    private String propertyText;

    /**
     * sku属性对状态值
     */
    @ApiField("status")
    private Long status;

    /**
     * 类目属性值id
     */
    @ApiField("value_id")
    private Long valueId;

    /**
     * 类目属性值名称
     */
    @ApiField("value_text")
    private String valueText;

    public Long getPropertyId() {
        return this.propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyText() {
        return this.propertyText;
    }

    public void setPropertyText(String propertyText) {
        this.propertyText = propertyText;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getValueId() {
        return this.valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    public String getValueText() {
        return this.valueText;
    }

    public void setValueText(String valueText) {
        this.valueText = valueText;
    }

}
