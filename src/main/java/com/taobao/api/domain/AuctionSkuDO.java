package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 商品sku对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class AuctionSkuDO extends TaobaoObject {

    private static final long serialVersionUID = 3792735817777512514L;

    /**
     * sku描述信息
     */
    @ApiField("description")
    private String description;

    /**
     * 商品宝贝id
     */
    @ApiField("item_id")
    private Long itemId;

    /**
     * sku对应外部编码
     */
    @ApiField("outer_id")
    private String outerId;

    /**
     * sku价格，以分为单位
     */
    @ApiField("price")
    private Long price;

    /**
     * sku的属性及属性值id
     */
    @ApiField("properties")
    private String properties;

    /**
     * sku包含的属性对列表
     */
    @ApiListField("pv_list")
    @ApiField("auction_p_v_pair_d_o")
    private List<AuctionPVPairDO> pvList;

    /**
     * sku的库存
     */
    @ApiField("quantity")
    private Long quantity;

    /**
     * sku_id
     */
    @ApiField("sku_id")
    private Long skuId;

    /**
     * 状态 1：正常 -1：删除
     */
    @ApiField("status")
    private Long status;

    public String getDescription() {
        return this.description;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public Long getPrice() {
        return this.price;
    }

    public String getProperties() {
        return this.properties;
    }

    public List<AuctionPVPairDO> getPvList() {
        return this.pvList;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public void setPvList(List<AuctionPVPairDO> pvList) {
        this.pvList = pvList;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

}
