package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 菜品视图对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class DdItemVO extends TaobaoObject {

    private static final long serialVersionUID = 1353449225959255182L;

    /**
     * 用户点菜份数
     */
    @ApiField("count")
    private Long count;

    /**
     * 淘点点菜品id
     */
    @ApiField("id")
    private Long id;

    /**
     * 菜品名称
     */
    @ApiField("name")
    private String name;

    /**
     * 原价
     */
    @ApiField("ori_price")
    private Long oriPrice;

    /**
     * 外部菜品编号
     */
    @ApiField("out_id")
    private String outId;

    /**
     * 外部skuid
     */
    @ApiField("out_sku_id")
    private String outSkuId;

    /**
     * 菜品出售价格
     */
    @ApiField("price")
    private String price;

    /**
     * 淘点点skuid
     */
    @ApiField("sku_id")
    private Long skuId;

    /**
     * sku名称
     */
    @ApiField("sku_name")
    private String skuName;

    /**
     * 点菜单菜品状态
     */
    @ApiField("status")
    private Long status;

    public Long getCount() {
        return this.count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOriPrice() {
        return this.oriPrice;
    }

    public void setOriPrice(Long oriPrice) {
        this.oriPrice = oriPrice;
    }

    public String getOutId() {
        return this.outId;
    }

    public void setOutId(String outId) {
        this.outId = outId;
    }

    public String getOutSkuId() {
        return this.outSkuId;
    }

    public void setOutSkuId(String outSkuId) {
        this.outSkuId = outSkuId;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return this.skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

}
