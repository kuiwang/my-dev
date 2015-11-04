package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 旅游商品销售属性SKU结构。
 *
 * @author auto create
 * @since 1.0, null
 */
public class TravelItemsSku extends TaobaoObject {

    private static final long serialVersionUID = 2648359417379661493L;

    /**
     * SKU创建日期 时间格式：yyyy-MM-dd HH:mm:ss。
     */
    @ApiField("created")
    private Date created;

    /**
     * SKU所属商品数字ID
     */
    @ApiField("item_id")
    private Long itemId;

    /**
     * SKU最后修改日期 时间格式：yyyy-MM-dd HH:mm:ss。
     */
    @ApiField("modified")
    private Date modified;

    /**
     * 商家设置的外部ID
     */
    @ApiField("outer_id")
    private String outerId;

    /**
     * 属于这个SKU的商品的价格 取值范围:0-2<<63-1;单位:分。如:20007，表示:200元7分。
     */
    @ApiField("price")
    private Long price;

    /**
     * SKU的销售属性组合字符串（出发日期，出游人群，等等，可通过taobao.travel.itemsprops.
     * get接口获取旅游类目下的销售属性），格式是p1:v1;p2:v2。
     */
    @ApiField("properties")
    private String properties;

    /**
     * SKU所对应的销售属性的中文名字串，格式如：pid1:vid1:pid_name1:vid_name1;pid2:vid2:
     * pid_name2:vid_name2……。
     */
    @ApiField("properties_name")
    private String propertiesName;

    /**
     * 属于这个SKU的商品的数量。
     */
    @ApiField("quantity")
    private Long quantity;

    /**
     * SKU的ID
     */
    @ApiField("sku_id")
    private Long skuId;

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getProperties() {
        return this.properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getPropertiesName() {
        return this.propertiesName;
    }

    public void setPropertiesName(String propertiesName) {
        this.propertiesName = propertiesName;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

}
